package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Beans.BankUserBean;
import Beans.TransactionBean;
import DbDetails.CreateConnection;

public class BankDAO {

    public int userRegistration(BankUserBean bub) {
        int k = 0;
        try {
            Connection con = CreateConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "insert into bankuser values(?,?,?,?,?,?,?)");
            ps.setString(1, bub.getUname());
            ps.setString(2, bub.getUfullname());
            ps.setString(3, bub.getUpassword());
            ps.setLong(4, bub.getAdhar());
            ps.setLong(5, bub.getPhoneno());
            ps.setLong(6, bub.getAccountno());
            ps.setDouble(7, bub.getAccountbalance());
            k = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }

    public BankUserBean userLoginByUnamePassword(String uname, String upassword) {
        BankUserBean bub = null;
        try {
            Connection con = CreateConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "select * from bankuser where uname=? and upassword=?");
            ps.setString(1, uname);
            ps.setString(2, upassword);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bub = new BankUserBean();
                bub.setUname(rs.getString(1));
                bub.setUfullname(rs.getString(2));
                bub.setUpassword(rs.getString(3));
                bub.setAdhar(rs.getLong(4));
                bub.setPhoneno(rs.getLong(5));
                bub.setAccountno(rs.getLong(6));
                bub.setAccountbalance(rs.getDouble(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bub;
    }

    public int withdrwalAmount(Double amount, Double accountBalance, String uname) {
        int k = 0;
        try {
            Connection con = CreateConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "update bankuser set accountbalance=? where uname=?");
            Double newBalance = accountBalance - amount;
            ps.setDouble(1, newBalance);
            ps.setString(2, uname);
            k = ps.executeUpdate();
            if (k > 0) {
                recordTransaction(uname, "WITHDRAWAL", amount, newBalance, "Cash withdrawal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    
    public int depositAmount(Double amount, Double accountBalance, String uname) {
        int k = 0;
        try {
            Connection con = CreateConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "update bankuser set accountbalance=? where uname=?");
            Double newBalance = accountBalance + amount;
            ps.setDouble(1, newBalance);
            ps.setString(2, uname);
            k = ps.executeUpdate();
            if (k > 0) {
                recordTransaction(uname, "DEPOSIT", amount, newBalance, "Cash deposit");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return k;
    }
    
    public int[] sendMoney(String uname, String runame, Double amount, Double accountBalance) {
        int[] arr = new int[2];
        int k = 0;
        int y = 0;
        try {
            Connection con = CreateConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "update bankuser set accountbalance=? where uname=?");
            PreparedStatement ps3 = con.prepareStatement(
                    "select * from bankuser where uname=?");
            PreparedStatement ps2 = con.prepareStatement(
                    "update bankuser set accountbalance=? where uname=?");
            ps3.setString(1, runame);
            ResultSet rs = ps3.executeQuery();
            Double receiverNewBalance = null;
            if (rs.next()) {
                receiverNewBalance = rs.getDouble(7) + amount;
                ps2.setDouble(1, receiverNewBalance);
                ps2.setString(2, runame);
                y = ps2.executeUpdate();
            }
            Double senderNewBalance = accountBalance - amount;
            ps.setDouble(1, senderNewBalance);
            ps.setString(2, uname);
            k = ps.executeUpdate();
            arr[0] = k;
            arr[1] = y;
            if (k > 0 && y > 0) {
                recordTransaction(uname, "SENT", amount, senderNewBalance, "Sent to " + runame);
                recordTransaction(runame, "RECEIVED", amount, receiverNewBalance, "Received from " + uname);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    private void recordTransaction(String uname, String txntype, Double amount, Double balanceAfter, String description) {
        try {
            Connection con = CreateConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "insert into transactionhistory (uname, txntype, amount, balanceafter, description) values (?,?,?,?,?)");
            ps.setString(1, uname);
            ps.setString(2, txntype);
            ps.setDouble(3, amount);
            ps.setDouble(4, balanceAfter);
            ps.setString(5, description);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TransactionBean> getTransactionHistory(String uname) {
        List<TransactionBean> list = new ArrayList<>();
        try {
            Connection con = CreateConnection.getCon();
            PreparedStatement ps = con.prepareStatement(
                    "select txnid, uname, txntype, amount, balanceafter, description, txndate " +
                    "from transactionhistory where uname=? order by txndate desc, txnid desc");
            ps.setString(1, uname);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TransactionBean tb = new TransactionBean();
                tb.setTxnid(rs.getLong(1));
                tb.setUname(rs.getString(2));
                tb.setTxntype(rs.getString(3));
                tb.setAmount(rs.getDouble(4));
                tb.setBalanceafter(rs.getDouble(5));
                tb.setDescription(rs.getString(6));
                tb.setTxndate(rs.getTimestamp(7));
                list.add(tb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}

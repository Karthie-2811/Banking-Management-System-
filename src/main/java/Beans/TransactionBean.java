package Beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class TransactionBean implements Serializable {
    private long txnid;
    private String uname;
    private String txntype;
    private Double amount;
    private Double balanceafter;
    private String description;
    private Timestamp txndate;

    public TransactionBean() {}

    public long getTxnid() { return txnid; }
    public void setTxnid(long txnid) { this.txnid = txnid; }

    public String getUname() { return uname; }
    public void setUname(String uname) { this.uname = uname; }

    public String getTxntype() { return txntype; }
    public void setTxntype(String txntype) { this.txntype = txntype; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public Double getBalanceafter() { return balanceafter; }
    public void setBalanceafter(Double balanceafter) { this.balanceafter = balanceafter; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Timestamp getTxndate() { return txndate; }
    public void setTxndate(Timestamp txndate) { this.txndate = txndate; }
}

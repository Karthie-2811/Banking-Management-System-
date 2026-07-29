package BankServlets;

import java.io.IOException;

import Beans.BankUserBean;
import DAO.BankDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, jakarta.servlet.ServletException {

        HttpSession hs = req.getSession(false);
        BankUserBean bub = (BankUserBean) hs.getAttribute("BankUserBean");

        Double amount = Double.parseDouble(req.getParameter("amount"));

        int k = new BankDAO().depositAmount(amount, bub.getAccountbalance(), bub.getUname());

        if (k > 0) {
            bub.setAccountbalance(bub.getAccountbalance() + amount);
        }
        req.setAttribute("Msg", "Deposit Successfull ...");
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
}
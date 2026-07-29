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

@WebServlet("/WithdrawlServlet")
public class WithdrawlServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession hs = req.getSession(false);
        BankUserBean bub = (BankUserBean) hs.getAttribute("BankUserBean");
        Double amount = Double.parseDouble(req.getParameter("amount"));
        if (amount > bub.getAccountbalance()) {
            req.setAttribute("Msg", "Insufficient Balance");
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        } else {
            int k = new BankDAO().withdrwalAmount(amount, bub.getAccountbalance(), bub.getUname());
            if (k > 0) {
                bub.setAccountbalance(bub.getAccountbalance() - amount);
                req.setAttribute("Msg", "Withdrawl Successfull ...");
                req.getRequestDispatcher("home.jsp").forward(req, resp);
            }
        }
    }
}

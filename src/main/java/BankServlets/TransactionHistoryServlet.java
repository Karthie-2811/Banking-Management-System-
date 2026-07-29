package BankServlets;

import java.io.IOException;
import java.util.List;

import Beans.BankUserBean;
import Beans.TransactionBean;
import DAO.BankDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/TransactionHistoryServlet")
public class TransactionHistoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession hs = req.getSession(false);
        if (hs == null || hs.getAttribute("BankUserBean") == null) {
            resp.sendRedirect("userLogin.html");
            return;
        }
        BankUserBean bub = (BankUserBean) hs.getAttribute("BankUserBean");

        List<TransactionBean> history = new BankDAO().getTransactionHistory(bub.getUname());
        req.setAttribute("TransactionHistory", history);
        req.getRequestDispatcher("transactionHistory.jsp").forward(req, resp);
    }
}

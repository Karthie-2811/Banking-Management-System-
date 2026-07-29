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

@WebServlet("/sendMoney")
public class SendMoneyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession hs = req.getSession(false);
        BankUserBean bub = (BankUserBean) hs.getAttribute("BankUserBean");
        String runame = req.getParameter("runame");
        Double amount = Double.parseDouble(req.getParameter("ramount"));
        int[] arr = new BankDAO().sendMoney(bub.getUname(), runame, amount, bub.getAccountbalance());
        if (arr[0] > 0 && arr[1] > 0) {
            bub.setAccountbalance(bub.getAccountbalance() - amount);
            hs.setAttribute("BankUserBean", bub);

            req.setAttribute("Msg", "Money Sent Successfully!");
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }else {
            req.setAttribute("Msg", "Money Transfer Failed ...");
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }
    }
}

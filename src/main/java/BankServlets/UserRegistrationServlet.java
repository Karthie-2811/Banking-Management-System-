package BankServlets;

import java.io.IOException;
import java.util.Random;

import Beans.BankUserBean;
import DAO.BankDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userRegisterServlet")
public class UserRegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        BankUserBean bub = new BankUserBean();
        bub.setUname(req.getParameter("uname"));
        bub.setUfullname(req.getParameter("ufullname"));
        bub.setUpassword(req.getParameter("upassword"));
        bub.setAdhar(Long.parseLong(req.getParameter("adhar")));
        bub.setPhoneno(Long.parseLong(req.getParameter("phoneno")));
        bub.setAccountbalance(Double.parseDouble(req.getParameter("accountbalance")));

        Random rand = new Random();
        int min = 1111111;
        int max = 9999999;
        long accountNo = rand.nextInt((max - min) + 1) + min;
        bub.setAccountno(accountNo);

        int k = new BankDAO().userRegistration(bub);
        if (k > 0) {
            req.setAttribute("Msg", "User Register Successfully");
            req.getRequestDispatcher("msg.jsp").forward(req, resp);
        } else {
            req.setAttribute("Msg", "User Not Register ...");
            req.getRequestDispatcher("msg.jsp").forward(req, resp);
        }
    }
}

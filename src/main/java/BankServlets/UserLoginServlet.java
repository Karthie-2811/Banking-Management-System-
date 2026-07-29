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

@WebServlet("/loginServlet")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upassword = req.getParameter("upassword");
        BankUserBean bub = new BankDAO().userLoginByUnamePassword(uname, upassword);
        if (bub != null) {
            HttpSession hs = req.getSession();
            hs.setAttribute("BankUserBean", bub);
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        } else {
            req.setAttribute("Msg", "Invalid Username or Password ...");
            req.getRequestDispatcher("msg.jsp").forward(req, resp);
        }
    }
}

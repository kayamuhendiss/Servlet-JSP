package _02.implicit.objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/implicit")
public class ImplicitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("username","admin");
        resp.addCookie(cookie);

        req.setAttribute("myAttribute","request Attribute");
        req.getSession().setAttribute("myAttribute","session Attribute");
        RequestDispatcher dispatcher=req.getRequestDispatcher("expressionLanguageAndNull.jsp");
        dispatcher.forward(req,resp);
    }
}

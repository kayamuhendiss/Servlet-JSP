package _04.response.header;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/responseHeaderServlet")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addHeader("username","test user1");
        resp.addHeader("username","test user2");
        resp.setHeader("password","new");
        resp.setHeader("password","old");

        // response header bilgisi , client/browser a donen kucuk
// bilgilerdir(implicit/kapali bilgiler)
    }
}

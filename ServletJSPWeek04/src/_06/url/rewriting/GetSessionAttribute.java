package _06.url.rewriting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getSessionAttribute")
public class GetSessionAttribute  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        String value= (String) session.getAttribute("key");
        System.out.println("Value : "+value);
        PrintWriter pw = resp.getWriter();
        pw.print(" : "+value);
    }
}

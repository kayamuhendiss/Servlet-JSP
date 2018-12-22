package _01.HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class MyFirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyFirstServlet ");

        PrintWriter pw=resp.getWriter();
        LocalTime localTime=LocalTime.now();
        String message="Hello Word";
        pw.print("<html><body>");
        pw.print("<h1>"+localTime+"</h1>");
        pw.print("<h1>"+message+"</h1>");
        pw.print("</body></html>");
    }
}

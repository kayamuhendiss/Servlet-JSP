package _03.lifecycle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lifecycle")
public class LifecycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {


        // konfigurasyon...
        System.out.println("LifecycleeeeeServlet#inittt!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw=resp.getWriter();
        pw.print("LifecycleServlet #doGet");
        System.out.println("LifecycleServlet#doGet is called!");
        System.out.println("Hello Word !!!!!!");
    }

    @Override
    public void destroy() {
        System.out.println("destroyyyy");
    }
}

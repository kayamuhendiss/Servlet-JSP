package _04.servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ConfigServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletConfig config=getServletConfig();
        String username=config.getInitParameter("username");
        String password=config.getInitParameter("password");

        resp.getWriter().print("username : "+username+" password : "+password);


        String servletName=config.getServletName();
        System.out.println("Adi" +servletName);

        ServletContext context=config.getServletContext();
        Enumeration<String> names=config.getInitParameterNames();





    }
}

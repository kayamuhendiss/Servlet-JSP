package _05.servletcontext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/contextServlet")
public class ContextServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context=getServletContext();
        // ServletContext context2 = getServletConfig().getServletContext()
        // context init parametreleri butun proje kapsaminda gecerlidir
        String rootPath=context.getInitParameter("rootPath");

        System.out.println("1 "+rootPath);


        // init parametresini ServletConfig objesi uzerinden cektigimizde bu
        // durumda ilgili parametre Servlet e ait olmalidir
        // aksi durumda null olacaktir
        ServletConfig config=getServletConfig();
        String username=config.getInitParameter("username");
        resp.getWriter().print(rootPath+" "+username);
        System.out.println("2 "+username);

        String realPath=context.getRealPath("/test.txt");
        System.out.println("3 "+realPath);

        String c=context.getContextPath();
        System.out.println("4 "+c);

        String serverInfo=context.getServerInfo();
        System.out.println("5 "+serverInfo);


    }
}

   /* public ServletContext getServletContext() {
        return this.getServletConfig().getServletContext();
    }
*/
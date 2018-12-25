package _02.request.methods;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

@WebServlet("/requestMethodServlet")
public class RequestMethodsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Locale locale=req.getLocale();
        int localPort=req.getLocalPort();
        int serverPort=req.getServerPort();
        String remoteAddr=req.getRemoteAddr();
        ServletContext context=req.getServletContext();
        String header=req.getHeader("host");

        System.out.println("1"+locale);
        System.out.println("2"+localPort);
        System.out.println("3"+serverPort);
        System.out.println("4"+remoteAddr);
        System.out.println("5"+context);
        System.out.println("6"+header);
        System.out.println();

        Enumeration<String> headerNames=req.getHeaderNames();
        while (headerNames.hasMoreElements()){
             String hname=headerNames.nextElement();
             String headerValue=req.getHeader(hname);
            System.out.println(hname+" "+headerValue);
        }
    }
}

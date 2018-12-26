package _01.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //1 ) javax.servlet.Filter arabirimini implements et!
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        // filter yardimiyla araya girip (intercept)

        // loglama
        // parametrelerin kontrolu
        //


        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String IP=req.getRemoteAddr();
        System.out.println( "IP : "+IP);

        filterChain.doFilter(servletRequest,servletResponse);
    }
    @Override
    public void destroy() {

    }
}

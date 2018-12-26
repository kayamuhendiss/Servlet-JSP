package _01.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
@WebFilter()
public class XSSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" XSSFilter  doFilter ");
        filterChain.doFilter(new XSSRequestWrapper((HttpServletRequestWrapper) servletRequest),servletResponse);
    }

    @Override
    public void destroy() {

    }
}

package _03.response.encoding;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseEncodingServlet")
public class ResponseEncodingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String defaultEncoding=resp.getCharacterEncoding();
        System.out.println(defaultEncoding);
        resp.setCharacterEncoding("UTF-8");
        //resp.setContentType("text/html; charset=UTF-8");
        //PrintWriter once setCharacterEncoding yazilmasi gerekir.
        PrintWriter pw=resp.getWriter();
        pw.print("<html>");
        pw.print("<head> <meta charset='UTF-8'> </head>");
        //pw.print("<head> <meta charset='ISO-8859-9'> </head>");
        pw.print("<body>");
        pw.print("ıİşŞçÇüÜğĞ");
        pw.print("</body> </html>");
    }
}
// temel problem ;

// 1)kullanilan karakterler ilgili karakter kumesi/charset tarafindan
// destekleniyor mu?
// 2)her iki ucda da kullanilan charset encoding ayni mi ?

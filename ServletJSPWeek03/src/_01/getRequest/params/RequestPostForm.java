package _01.getRequest.params;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/requestPostFrom")
public class RequestPostForm extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("requestPostFrom  doPost");

       String firstName= req.getParameter("firstname");
       String lastName= req.getParameter("lastname");
       String cinsiyet = req.getParameter("cinsiyet");
       String checkBoxValues[]=req.getParameterValues("hobi");

        PrintWriter pw=resp.getWriter();
        pw.print(firstName);
        pw.println(lastName);
        pw.println(cinsiyet);
        pw.println(Arrays.asList(checkBoxValues));


    }
}

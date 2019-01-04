package _03.jspaction.controller;

import _03.jspaction.model.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/person1")
public class PersonController1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person person1=new Person("zuleyha","kaya",25);
        req.setAttribute("myAttribute",person1);

        RequestDispatcher dispatcher=req.getRequestDispatcher("/personUseBean.jsp");
        dispatcher.forward(req,resp);
    }
}

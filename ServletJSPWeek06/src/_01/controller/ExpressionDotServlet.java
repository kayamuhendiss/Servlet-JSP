package _01.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@WebServlet("/expressionDotServlet")
public class ExpressionDotServlet extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String> hashMap=new HashMap<>();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key3","value3");
        req.setAttribute("myMap",hashMap);

        RequestDispatcher dispatcher=req.getRequestDispatcher("expressionLanguageDot.jsp");
        dispatcher.forward(req,resp);
    }
}

package _01.controller;

import _01.model.Department;
import _01.model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/employeeController")
public class EmployeeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Department department=new Department();
        department.setId(100);
        department.setName("Software Engineering");



        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Zuleyha Kaya");
        employee.setSalary(5000);
        employee.setDepartment(department);
        req.setAttribute("myEmployeeAttribute",employee);

       //  RequestDispatcher dispatcher=req.getRequestDispatcher("/employee.jsp");
        RequestDispatcher dispatcher=req.getRequestDispatcher("/employeeExpressionLanguage.jsp");
        dispatcher.forward(req,resp);
    }
}

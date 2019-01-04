package _03.jspaction.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import _03.jspaction.model.Person;

@WebServlet("/person")
public class PersonController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//
		//Burasi controller kismi istegin karsilanmasi ve ilgili datanin olusturulma kismi
		Person person1=new Person("zuleyha","kaya",24);
		req.setAttribute("myPerson",person1);
		//burada html kodu yazilmasi uygun degil bu yuzden dispatch ediyoruz
		//bir istegi karsilarken  2 tanen companent kullaniliyor biri controller digeri jsv birlikte calisir ortada bi tane istek var
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/personUseBean.jsp");
		dispatcher.forward(req,resp);

	}
}

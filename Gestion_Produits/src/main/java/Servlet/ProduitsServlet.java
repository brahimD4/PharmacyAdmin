package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ProduitsServlet extends HttpServlet {

       
  //  @WebServlet("/pr")
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		request.getRequestDispatcher("vue.jsp").forward(request, response);
		
	}


	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		 double montant= Double.parseDouble(request.getParameter("montant"));
		 double taux= Double.parseDouble(request.getParameter("montant"));
		 double durre= Integer.parseInt(request.getParameter("mois"));
		 
		 
		 
	  }



	public ProduitsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}

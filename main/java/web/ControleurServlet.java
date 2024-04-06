package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Path;

import dio.IProduitDao;
import dio.ProduitDaoImpl;


public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      // private IProduitDao metier;
  
    public ControleurServlet() {
    	
    }
    
    public void init() throws ServletException{
    //	metier=new ProduitDaoImpl();
    }
    


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getServletPath();	
		
		if(path.equals("/index.pr")) {
			  ProduitModel Tous_produits=new ProduitModel();
			  ProduitDaoImpl Dio=new ProduitDaoImpl();
			  Tous_produits.setProduits(Dio.getTousProduits());
			  request.setAttribute("Tous_produits", Tous_produits);
		     request.getRequestDispatcher("vue.jsp").forward(request, response);
		
		}else if(path.equals("/chercher.pr")) {
		    	
		    	String motcle=request.getParameter("nom_produit");
			    ProduitModel PM1=new ProduitModel();
			    PM1.setMotCle(motcle);
			    ProduitDaoImpl Dio=new ProduitDaoImpl();
			    PM1.setProduits(Dio.ProduitsParMC(motcle));
			    request.setAttribute("model", PM1);
			    request.getRequestDispatcher("vue.jsp").forward(request, response);
		    }
		    
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

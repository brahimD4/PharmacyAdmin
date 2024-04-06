package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.Produit;

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
		    }else if(path.equals("/NewProduit.pr")) {
		    		
		    	 request.getRequestDispatcher("NewProduit.jsp").forward(request, response);
		    }else if(path.equals("/save.pr")&&(request.getMethod().equals("POST"))) {
				
				  String Nomproduit=request.getParameter("nom_produit"); double prix=
				  Double.parseDouble(request.getParameter("prix")); int Quantite=
				  Integer.parseInt(request.getParameter("quantite")); String
				  Description=request.getParameter("description"); ProduitDaoImpl Dio=new
				  ProduitDaoImpl(); Produit p=new
				  Produit(Nomproduit,prix,Quantite,Description); Dio.save(p);
				 
		    	  request.getRequestDispatcher("vue.jsp").forward(request, response);
		    }
		    
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
		/*
		 * if(path.equals("/save.pr")) { String
		 * Nom_Produit=request.getParameter("nom_produit"); String Prix=req }
		 */
	}

}

package dio;

import java.util.List;

import metier.Produit;

public class testDao {

	public static void main(String[] args) {
		
	  Produit p1=new Produit( "DOLIPRAN", 12, 20,"HHHHH");
		/* Produit p2=new Produit( "HP", 12, 20,"TTRGNNH  F"); */
	  
	  ProduitDaoImpl  dio=new ProduitDaoImpl();
		
		  dio.save(p1);
		  
			/* dio.save(p2); */
		 
	  
	  List<Produit> prod=dio.ProduitsParMC("HP");
	  
	  for(Produit p:prod) {
		  System.out.println(p.toString());
	  }
	
	}

}

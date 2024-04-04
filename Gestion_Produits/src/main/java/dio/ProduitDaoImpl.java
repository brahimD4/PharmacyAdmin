package dio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Produit;

public class ProduitDaoImpl implements IProduitDao {

	@Override
	public Produit save(Produit p) {
	
		Connection connection= SinglotonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO produits(nom_produit,prix,quantite_en_stock,descript)VALUES(?,?,?,?)");
		    ps.setString(1, p.getNomPrduit()); 
		    ps.setDouble(2, p.getPrix());
		    ps.setInt(3, p.getQuantite());
		    ps.setString(4, p.getDescription());
		    ps.executeUpdate();		    
		    PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id) AS MAXID FROM produits");
		    ResultSet rs=ps2.executeQuery();
		  if(rs.next()) {
			  p.setId(rs.getInt("MAXID"));
		  }
		    ps.close(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Produit> ProduitsParMC(String mc) {
		List<Produit> produits=new ArrayList<>();
		Connection connection= SinglotonConnection.getConnection();
	
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT* FROM produits");
			 
		//	ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				  System.out.println(rs.getString("nom_produit"));
				  System.out.println(rs.getString("descript"));
				Produit p=new Produit();
				p.setId(rs.getInt("id"));
				p.setNomPrduit(rs.getString("nom_produit"));
				p.setPrix(rs.getDouble("prix"));
				p.setDescription(rs.getString("descript"));
				produits.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return produits;
	}

	@Override
	public Produit getProduit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(int id) {
		// TODO Auto-generated method stub
		
	}

}

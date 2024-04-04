package dio;

import java.util.List;

import metier.Produit;

public interface IProduitDao {

	public Produit save(Produit p);
	public List<Produit> ProduitsParMC(String mc);
	public Produit getProduit(int id);
	public Produit updateProduit(Produit p);
	public void deleteProduit(int id);
}

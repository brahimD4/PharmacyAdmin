package metier;

public class Produit {

	private int id;
	private String nomProduit;
	private double prix;
	private int quantite;
	private String description;
	
	public Produit() {
		
	}

	public Produit(String nomProduit, double prix, int quantite, String description) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.quantite = quantite;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", nomProduit=" + nomProduit + ", prix=" + prix + ", quantite=" + quantite
				+ ", description=" + description + "]";
	}
	
}

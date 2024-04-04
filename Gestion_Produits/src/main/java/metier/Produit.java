package metier;

public class Produit {

	private int id;
	private String NomPrduit;
	private double prix;
	private int quantite;
	private String description;
	
	public Produit() {
		
	}
	public Produit(String nomPrduit, double prix, int quantite, String description) {
		super();
		NomPrduit = nomPrduit;
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
	public String getNomPrduit() {
		return NomPrduit;
	}
	public void setNomPrduit(String nomPrduit) {
		NomPrduit = nomPrduit;
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
		return "Produit [id=" + id + ", NomPrduit=" + NomPrduit + ", prix=" + prix + ", quantite=" + quantite
				+ ", description=" + description + "]";
	}
	
	
}

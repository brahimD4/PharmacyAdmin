package Servlet;

public class produitModel {
	
	private double montant;
	private double durre;
	private double taux;
	private double result;
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getDurre() {
		return durre;
	}
	public void setDurre(double durre) {
		this.durre = durre;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public produitModel(double montant, double durre, double taux, double result) {
		super();
		this.montant = montant;
		this.durre = durre;
		this.taux = taux;
		this.result = result;
	}
	
	 
}

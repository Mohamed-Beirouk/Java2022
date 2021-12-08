package Gestion_devellopeurs;

public class Langage {
	
	private String id;
	private String nom;
	
	
	public Langage(String id, String nom) {
		this.id =id;
		this.nom=nom;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void toStringLang() {
		
		System.out.println("id du langage : "+this.id+" le nom du langage est "+this.nom);
	}

}

package Gestion_devellopeurs;

public class Dev {
	
	private String id;
	private String nom;
	private Langage lang;

	public Dev(String id, String nom, Langage lang) {
		
		this.id=id;
		this.nom=nom;
		this.lang=lang;
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
	public Langage getLang() {
		return lang;
	}
	public void setLang(Langage lang) {
		this.lang = lang;
	}
	public void toStringDev() {
		
		System.out.println("le nom du dev est : "+this.nom+" le langage du dev est : "+this.getLang().getNom());
		
	}
	
	

}

package JavaAvance;

public class Article {
	private String reference;
	private String designation;
	private int prixHt;
	private int tauxTva;
	public static int nbresarticle;
	
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getPrixHt() {
		return prixHt;
	}

	public void setPrixHt(int prixHt) {
		this.prixHt = prixHt;
	}

	public int getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(int tauxTva) {
		this.tauxTva = tauxTva;
	}

	public Article() {
//		count++;

		
	}
	
	Article(String reference, String designation, int prixHt, int tauxTva){
		
		this.reference = reference;
		this.designation = designation;
		this.prixHt = prixHt;
		this.tauxTva = tauxTva;
		nbresarticle++;
	}
	
	

	public Double CalculPrixTTC(int prixht, int tauxtva)
	{
		
		double prixttc  = prixht+prixht*tauxtva /100;
		
		return prixttc;
	}
	
	public void afficherArticle() {
		System.out.println ("reference : " + this.reference + " la designation : " + this.designation
				+ " prixHt :" + this.prixHt + " tauxTva: " + this.tauxTva);
	}
	
	public static void nbresarticles() {
		
		System.out.println("le nombre des articles cree est : "+nbresarticle);
		
	}
	

	public static void main(String[] args) {
			
		
			Article a1 = new Article("1", "paris", 4000, 100);
			a1.afficherArticle();
			double ttc = a1.CalculPrixTTC(100, 16);
			System.out.println("la valeur du TTC = "+ttc);
			nbresarticles();
			
			
	}
	
	
	
	

	

}

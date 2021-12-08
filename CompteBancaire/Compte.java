package CompteBancaire;

public class Compte {
	
	private int numero;
	private String nom;
	private float solde;
	private double decouvertmax;
	private double debitmax;
	
	
	

	public Compte(int numero, String nom, float solde, double decouvertmax, double debitmax) {
		this.numero=numero;
		this.nom=nom;
		this.solde=solde;
		this.decouvertmax=decouvertmax;
		this.debitmax=debitmax;
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	};
	public double getDecouvertmax() {
		return decouvertmax;
	}

	public void setDecouvert(double decouvertmax) {
		this.decouvertmax = decouvertmax;
	}

	public double getDebitmax() {
		return debitmax;
	}

	public void setDebitmax(double debitmax) {
		this.debitmax = debitmax;
	}
	
	public void afficherCompte(Compte c) {
		System.out.println("numero :"+c.numero);
		System.out.println("nom :"+c.nom);
		System.out.println("solde :"+c.solde);
		System.out.println("decouvert maximale :"+c.decouvertmax);
		System.out.println("debit maximale :"+c.debitmax);
		
		
	}
	public void creditercompte(Compte compte, float montant) {
		
		compte.getSolde();
		if (solde+montant>this.debitmax) {
			System.out.println("vous ne pouvez pas faire ce versement car vous allez depasser votre debit maximale");
		}
		else {
		this.solde = solde+montant;
		compte.setSolde(solde);
		}
			
	}
	public void debitercompte(Compte compte, float montant) {
		
		compte.getSolde();
		compte.getDecouvertmax();
		if (solde-montant<this.decouvertmax) {
			System.out.println("vous ne pouvez pas faire cette retrait car vous allez depasser votre decouvert maximale");
		}
		else {
			this.solde = solde-montant;
			compte.setSolde(solde);
			}
			
	}

	public static void main(String[] args) {
		
	
			Compte c = new Compte(1, "beirouk", 500, -2000, 5000);
			c.afficherCompte(c);
			c.creditercompte(c, 100);
			c.afficherCompte(c);
			c.debitercompte(c, 2600);
			c.afficherCompte(c);
			
			
	}





	

}

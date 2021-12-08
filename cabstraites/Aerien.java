package cabstraites;

class Aerien extends Transport {
	public Aerien(Marchandises m) {
		super(m);	
	}
	public int prixunitaire() {
		return 10;	
	}
	public int encombrement() {
		return m.getPoids();
	}
	
	
	public static void main(String[] args) {
		Marchandises m1 = new Marchandises(10,20);
		Aerien a1 = new Aerien(m1);
		
		System.out.println("le tarif est : "+a1.tarif());
		
		
		
		
		
		
	}
	
}

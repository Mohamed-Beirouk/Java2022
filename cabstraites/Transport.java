package cabstraites;

	public abstract class Transport {
		
		protected Marchandises m;
	
	public Transport(Marchandises m) {
		this.m=m;
	}
	
	abstract public int prixunitaire();
	abstract public int encombrement();
	
	public  int tarif() {
		
		return prixunitaire() * encombrement();
	}
	
	
	

}

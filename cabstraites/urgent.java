package cabstraites;

public class urgent extends Aerien {

	public urgent(Marchandises m) {
		super(m);
	}
		public static void main(String[] args) {
			Marchandises m1 = new Marchandises(10,20);
			Aerien a1 = new Aerien(m1);
			
			System.out.println("le tarif est : "+a1.tarif()*2);
	}

}

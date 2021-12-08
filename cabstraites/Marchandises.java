package cabstraites;

public class Marchandises {
	
	private int poids;
	private int volume;

	public Marchandises(int poids,int volume) {
		this.poids=poids;
		this.volume=volume;
		
	}


	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	

}

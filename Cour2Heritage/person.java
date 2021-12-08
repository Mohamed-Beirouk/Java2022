package Cour2Heritage;

public class person {

	
	public static final String MALE = "male";
	public static final String FEMALE = "female";
	
	private String nom;
	private String genre;
	private int age;

			public person(String nom, String genre, int age)
			{
				
				this.nom = nom;
				this.genre = genre;
				this.age = age;
				
				
			}

			public String getNom() {
				return nom;
			}

			public void setNom(String nom) {
				this.nom = nom;
			}

			public String getGenre() {
				return genre;
			}

			public void setGenre(String genre) {
				this.genre = genre;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}
			

}

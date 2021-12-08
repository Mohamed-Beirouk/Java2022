package Gestion_devellopeurs;

import java.util.ArrayList;

public class Affichage {

	public Affichage() {
	}

	public static void main(String[] args) {
		
		Langage java = new Langage("1","java");
		
		Dev a = new Dev("1","mohamed",java);
		Dev b = new Dev("2","beirouk",java);
		Dev c = new Dev("3","medos",java);
		Dev d = new Dev("4","ahmed",java);

		ArrayList<Dev> listDev = new ArrayList<Dev>();;
		
		Societe s = new Societe("1","mauri info", listDev);
		s.addDev(a);
		s.addDev(b);
		s.addDev(c);
		s.addDev(d);
//		s.toStringSoc();
//		System.out.println(""+s.getDev(1));
//		a.toStringDev();
//		java.toStringLang();
	}

}

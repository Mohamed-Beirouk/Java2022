package Gestion_devellopeurs;

import java.util.ArrayList;

public class Societe {
	
	private String id;
	private String nom;
	private ArrayList<Dev> listDev;
	
	public Societe(String id, String nom, ArrayList<Dev> listDev) {
		this.id=id;
		this.nom=nom;
		this.listDev=listDev;
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

	public ArrayList<Dev> getListDev() {
		return listDev;
	}
	public void setListDev(ArrayList<Dev> listDev) {
		this.listDev = listDev;
	}
	 
	
	public void toStringSoc() {
		
		System.out.println("le code de la societe est : "+this.id);
		System.out.println("le nom est : "+this.nom);
		System.out.println("les informations des devellopeurs");
		
		int i;
		for(i=0;i<listDev.size();i++) {
			System.out.println("Devellopeur : "+i);
			System.out.println("le nom : "+listDev.get(i).getNom());	
		}	
	}
	
	public void addDev(Dev d){	
		listDev.add(d);	
		System.out.println("done");
		
	}
	
	public String getDev(int indice) {
		
		String result;
		result="le nom est : "+listDev.get(indice).getNom()+" le langage est : "+listDev.get(indice).getLang().getNom();
		
		return result;
	}
	
}

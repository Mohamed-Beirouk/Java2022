package listChaine;
import java.util.Scanner;

public class Liste {
	
	int contenu;
	Liste suivant;
	
	public Liste(int x, Liste a) {
		contenu = x;
		suivant = a;
	}
	static int tete(Liste a) {
		return a.contenu;
	}
	static Liste ajouterDebut(Liste l, Liste nv) {
		nv.suivant=l;
		l=nv;
		return l;
	}
	static void affichage(Liste l) {
		Liste temp = l;
		while(temp != null) {
			System.out.println(" \n"+temp.contenu);
			temp=temp.suivant;
		}
		
		
	}
	static Liste ajoutAvecTri(Liste l, Liste nv) {
		int com= 0;
		Liste test =l;
		int max=0;
		int nb=0;
		Liste zz =l;
		if(l==null) {
			l.contenu=nv.contenu;
		}
		while(zz!=null) {
			if(zz.contenu>max) {
				max=zz.contenu;
			}nb++;
			zz=zz.suivant;
		}	
		if(nv.contenu<l.contenu) {
			nv.suivant=l;
			l=nv;
			return l;
		}
		if(nv.contenu>max) {
			Liste zzz = l;
			while(zzz.suivant!=null) {
				zzz=zzz.suivant;
			}	zzz.suivant=nv;
			nv.suivant=null;
			return l;	}
		while(nv.contenu>test.contenu) {
			test=test.suivant;
			com++;
		}Liste temp = l;
		int j;
		for(j=1;j<com;j++) {
			temp=temp.suivant;
		}nv.suivant = temp.suivant;
		temp.suivant=nv;
		return l;
	}
static Liste fusiontri(Liste a, Liste b) {
	Liste t1 = a;
	Liste t2 = b;
	if(t1==null) {
		return t2;
	}if(t2==null) {
		return t1;
	}
	else {
		if(t1.contenu<=t2.contenu) {
			t1.suivant = fusiontri(t1.suivant,t2);
			return t1;
		}
		else {
			t2.suivant=fusiontri(t1,t2.suivant);
			return t2;
		}
	}
	
}
	public static void main(String[] args) {
		
		int element = 1;
		Scanner sc = new Scanner(System.in);
		Liste l1 = null;
		Liste l2 = null;
		System.out.println(" --- initialisation de l1 --- ");
		
		while(element!=0) {
			System.out.println(" donner l''element a inserer : ");
			element=sc.nextInt();
			if(element!=0) {
				if(l1==null) {
					l1 = new Liste(element, l1);
			}else {
					Liste nv = null;
					nv = new Liste(element, nv);
					l1 = ajoutAvecTri(l1,nv);
					}
				
			}
			else {}
		}	
		System.out.println(" --- initialisation de l2 --- ");
		element=1;
		while(element!=0) {
			System.out.println(" donner l''element a inserer : ");
			element=sc.nextInt();
			if(element!=0) {
				if(l2==null) {
					l2 = new Liste(element, l2);
			}else {
					Liste nv = null;
					nv = new Liste(element, nv);
					l2 = ajoutAvecTri(l2,nv);
					}
				
			}
			else {}
		}	
		
		System.out.println(" la premiere liste : ");
		affichage(l1);
		System.out.println(" la deuxieme liste : ");
		affichage(l2);
		System.out.println(" fusion l1 et l2 : ");
		Liste l3 = null;
		l3 = fusiontri(l1,l2);
		affichage(l3);
		
		


		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("\n"+l1.contenu);
//		System.out.println("\n"+l1.suivant.contenu);
//		System.out.println("\n"+l1.suivant.suivant.contenu);
//		System.out.println("\n"+l1.suivant.suivant.suivant.contenu);
//		System.out.println("\n"+l1.suivant.suivant.suivant.suivant.contenu);
		
		sc.close();
	}

}

package presentation;

import metier.Compte;
import metier.CompteEpargne;
import metier.ComptePayant;
import metier.CompteSimple;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compte c = new Compte(1, "testCompte", 10000);
		CompteSimple cs = new CompteSimple(2, "testCompteSimple", 12000, 1000);
		CompteEpargne ce = new CompteEpargne(3, "testEpargne", 12000, (float)0.5);
		ComptePayant cp = new ComptePayant(4, "testPayant", 15000, 0.2f);
		
		// transtypage CompteSimple ====> Compte
		Compte cs2 = (Compte) new CompteSimple(2, "testCompteSimple", 12000, 1000);
		
		// transtypage  Compte ====> CompteSimple PAS POSSIBLE
		//CompteSimple cs3 = (CompteSimple) new Compte(1, "testCompte", 10000);
		
		//System.out.println(c);
		System.out.println(cs);
		System.out.println(cs2);
		System.out.println(ce);
		System.out.println(cp);
		//System.out.println(cs3);
		
		System.out.println(cs2.getClass());
		System.out.println(cs.getClass());
		//System.out.println(c.getClass());
		System.out.println(ce.getClass());
		System.out.println(cp.getClass());
		
		//System.out.println(cs3.getClass());
		
		// appel de la méthode verser
		//c.verser(2000);
		System.out.println("---------------- APRES VERSEMENT ------------------");
		//System.out.println(c);
		System.out.println("---------------- NOMBRE DE COMPTES ------------------");
		System.out.println(Compte.getNbComptes());
		
	}

}

package presentation;

import java.util.Scanner;

import metier.Personne;
import service.PersonneService;
/**
 * Classe de d�marrage de l'application 
 * @author Stagiaire
 * @version 1.0
 *
 */
public class Lanceur {

	/**
	 * La m�thode main est charg�e en m�moire au d�marrage de l'application
	 * et peut donc �tre utilis�e avant la cr�ation de tout objet
	 * @param args arguments de la m�thode main
	 */
	public static void main(String[] args) {
		//d�claration de la couche service
		PersonneService ps = new PersonneService();
		
		//Cr�ation d'un objet Personne
		Personne p = new Personne();
		Personne p2 = new Personne("TEST", "DUPOND", 40);
		Personne p3 = new Personne("PE","Gilles");
		// valorisation des attributs
		p.setNom("TOTO");
		p.setPrenom("TITI");
		p.setAge(31);
		
		p3.setAge(60);
		// affichage des attributs
		System.out.println((Object)p);
		System.out.println("-------------------------------------------");
		System.out.println(p2);
		System.out.println("-------------------------------------------");
		System.out.println(p3);
		System.out.println("-------------------------------------------");
		System.out.println(ps.marcher(p));
		System.out.println("-------------------------------------------");
		System.out.println(ps.arreter(p));
		//Test de la classe Scanner
		Scanner clavier = new Scanner(System.in);
		while(true)
		{
		// demander le nom
		System.out.println("Saisir le nom :");
		// r�cup�rer le nom
		String leNom = clavier.next();
		// demander le prenom
		System.out.println("Saisir le prenom :");
		// r�cup�rer le nom
		String lePrenom = clavier.next();
		// demander l'age
		System.out.println("Saisir l'age :");
		// r�cup�rer l'age
		int lage = clavier.nextInt();
		
		//cr�er l'objet personne
		Personne p4 = new Personne(leNom, lePrenom, lage);
		//affichage de la personne
		System.out.println("-------------------------------------------");
		System.out.println(p4);
		}
		
	}

}

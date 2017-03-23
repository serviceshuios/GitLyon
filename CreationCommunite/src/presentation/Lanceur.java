package presentation;

import java.util.Scanner;

import metier.Personne;
import service.PersonneService;
/**
 * Classe de démarrage de l'application 
 * @author Stagiaire
 * @version 1.0
 *
 */
public class Lanceur {

	/**
	 * La méthode main est chargée en mémoire au démarrage de l'application
	 * et peut donc être utilisée avant la création de tout objet
	 * @param args arguments de la méthode main
	 */
	public static void main(String[] args) {
		//déclaration de la couche service
		PersonneService ps = new PersonneService();
		
		//Création d'un objet Personne
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
		// récupérer le nom
		String leNom = clavier.next();
		// demander le prenom
		System.out.println("Saisir le prenom :");
		// récupérer le nom
		String lePrenom = clavier.next();
		// demander l'age
		System.out.println("Saisir l'age :");
		// récupérer l'age
		int lage = clavier.nextInt();
		
		//créer l'objet personne
		Personne p4 = new Personne(leNom, lePrenom, lage);
		//affichage de la personne
		System.out.println("-------------------------------------------");
		System.out.println(p4);
		}
		
	}

}

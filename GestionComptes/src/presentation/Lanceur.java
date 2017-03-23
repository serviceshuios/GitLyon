package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import metier.Compte;
import service.CompteService;
import service.CompteSimpleService;
import service.exceptions.MontantNegatifException;
import service.exceptions.SoldeInsuffisantException;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cr�er un objet service
		//CompteService cs = new CompteService();
		CompteSimpleService cs = new CompteSimpleService();
		
		//cr�er un objet Compte
		Compte c = new Compte();
		//faire appel aux m�thodes
		
		Scanner clavier = new Scanner(System.in);
		int id;
		String nom;
		long solde;
		long montant;
		Boolean test=true;
		while(test)
		{
			// r�cup�ration des donn�es saisies par utilisateur
			try {
			System.out.println("Saisir idCompte");
			id=clavier.nextInt();
			System.out.println("Saisir nom du Compte");
			nom=clavier.next();
			System.out.println("Saisir solde");
			solde = clavier.nextLong();
			// affectation des donn�es � l'objet compte
			c.setIdCompte(id);
			c.setNomCompte(nom);
			c.setSolde(solde);
			System.out.println(c);
			
			//saisie montant � ajouter
			System.out.println("Saisir montant � cr�diter");
			montant = clavier.nextLong();
			cs.ajouter(c, montant);
			// afficher apr�s ajout
			System.out.println(c);
			
			//saisir montant � retirer
			System.out.println("Saisir montant � d�biter");
			montant = clavier.nextLong();
			
				cs.retirer(c, montant);
			} catch (SoldeInsuffisantException e) {
				
				System.out.println(e.getMessage());
			} catch (MontantNegatifException e) {
				System.out.println(e.getMessage());
			} catch(InputMismatchException e)
			{
				System.out.println("PROBLEME DE SAISIE");
				test=false;
			}
			
			// afficher apr�s retrait
			 System.out.println(c);
		}
	}

}

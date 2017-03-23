package presentation;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import metier.Personne;

public class Lanceur {

	public static void main(String[] args) {
		
		//1- déclaration de la collection
		SortedSet<Personne> set = new TreeSet<Personne>( 
				new Comparator<Personne>() {

					@Override
					public int compare(Personne o1, Personne o2) {
						if(o1.getNom().equals(o2.getNom()))
						{
							return o1.getPrenom().compareTo(o2.getPrenom());
						}
						else
						{
							return o1.getNom().compareTo(o2.getNom());
						}
					}
		});
		
		//2- Création des objets personnes
		Personne m1 = new Personne(1, "TATA", "eddy");
		Personne m2 = new Personne(2, "TATA", "elise");
		Personne m3 = new Personne(3, "MBIANDOU", "douglas");
		Personne m4 = new Personne(4, "ELBASE", "Jacques");
		
		//3- ajouter les personnes à la collection
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		
		//4- parcourir et afficher la collection
		for(Personne p : set)
		{
			System.out.println(p);
		}
		
	}
}

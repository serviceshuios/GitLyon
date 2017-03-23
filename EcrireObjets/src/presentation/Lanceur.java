package presentation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		
		Compte c1 = new Compte();
		c1.setIdCompte(1);
		c1.setNomCompte("compte 1");
		c1.setSolde(20000);
		
		Compte c2 = new Compte();
		c2.setIdCompte(1);
		c2.setNomCompte("compte 2");
		c2.setSolde(40000);
		
		File f = new File("banque.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c1);
		oos.writeObject(c2);
		
		oos.close();
		fos.close();
		
	}
}

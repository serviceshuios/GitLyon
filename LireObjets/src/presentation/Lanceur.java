package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("banque.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Compte cx = (Compte) ois.readObject();
		Compte cy = (Compte) ois.readObject();
		
		System.out.println(cx);
		System.out.println(cy);
		
		ois.close();
		fis.close();
	}
}

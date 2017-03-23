package presentation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		
		//cryptage
		File f1 = new File("fichier1.txt");
		FileReader fr = new FileReader(f1);
		
		File f2 = new File("fichier2.txt");
		FileWriter fw = new FileWriter(f2);
		
		// d�cryptage
		File f3 = new File("fichier2.txt");
		FileReader fr2 = new FileReader(f3);
		
		File f4 = new File("fichier3.txt");
		FileWriter fw2 = new FileWriter(f4);
		
		// boucle de cryptage
		int c;
		while((c=fr.read())!=-1)
		{
			fw.write(c+1);
		}
		fr.close();
		fw.close();
		
		// boucle de d�cryptage
		int a;
		while((a=fr2.read())!=-1)
		{
			fw2.write(a-1);
		}
		fr2.close();
		fw2.close();
	}
	
}

package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lanceur {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File("soleil.jpg");
		FileInputStream fr = new FileInputStream(f1);
		
		File f2 = new File("Soleil2.jpg");
		FileOutputStream fw = new FileOutputStream(f2);
		
		int c;
		
		while((c=fr.read())!=-1)
		{
			
			fw.write(c);
		}
		fr.close();
		fw.close();
	}

}

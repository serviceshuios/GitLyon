package presentation;

import java.io.File;

public class Lanceur {

	public static void main(String[] args) {
		
		String rep="c:/";
		File f = new File(rep);
		
		if(f.exists())
		{
			//System.out.println(rep+ " existe");
			String[] contenu = f.list();
			
			for(int i=0;i<contenu.length;i++)
			{
				File f2 = new File(rep,contenu[i]);
				if(f2.isDirectory())
				{
					System.out.println("REPERTOIRE :"+ contenu[i]);
				}
				else {
					System.out.println("FICHIER :"+ contenu[i] + " TAILLE :"+f2.length()/1024+ " bytes");
				}
			}
		}
		else {
			System.out.println(rep+ " n'existe pas");
		}
		
	}
}

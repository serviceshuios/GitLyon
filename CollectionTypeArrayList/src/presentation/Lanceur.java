package presentation;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {

	public static void main(String[] args) {
		
		// déclaration
		List al = new ArrayList();
		
		//ajout
		al.add(12);
		al.add("bonjour");
		al.add(12f);
		al.add(true);
		al.add('d');
		al.add('d');
		
		//parcours
		for(int i=0;i<al.size();i++)
		{
			System.out.println("donnée à l'indice "+i +" = "+al.get(i));
		}
		
	}
}

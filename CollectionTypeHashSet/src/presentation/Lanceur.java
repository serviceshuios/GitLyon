package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		// d�claration
		Set hs = new HashSet();
		
		//ajout �lements
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		hs.add('d');
		
		// parcours
		Iterator it = hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}

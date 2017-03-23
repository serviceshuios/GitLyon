package presentation;

import metier.Generique;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generique <String,Double,Float> g1 = new Generique <String, Double, Float> ("abc", 12.2, 45.5f);
		System.out.println(g1);
		System.out.println("--------------------------------------------------------");
		
		Generique <Float,String,Float> g2 = new Generique <Float,String,Float> (12f,"def", 45f);
		System.out.println(g2);
		System.out.println("---------------------------------------------------------");
		
		
		Generique <String,String,Integer> g3 = new Generique <String,String,Integer> ("ghi", "jkl", 44);
		System.out.println(g3);
		System.out.println("----------------------------------------------------------");
		
	}

}

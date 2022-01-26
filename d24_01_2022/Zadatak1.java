package d24_01_2022;

import java.util.ArrayList;

public class Zadatak1 {
//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih 
//	tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.
	
	public static void main(String[] args) {
		

		Korpa korpa1 = new Korpa();
		ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

		Ambalaza tetrapak1 = new Tetrapak(true, 100.00, "123OP42", "Vocna dolina", 100.0, 120.0);
		Ambalaza tetrapak2 = new Tetrapak(false, 87.90, "4245MN53", "Pavlaka za kuvanje", 330.0, 350.0);
		Ambalaza staklenaAmbalaza1 = new StaklenaAmbalaza (50, true, 50.00, "2332SM42", "Nisko pivo", 500.0, 520.0);
		Ambalaza staklenaAmbalaza2 = new StaklenaAmbalaza (0, false, 120.00, "1345LK53", "Klaker",200.0, 220.0);
				
		korpa1.dodajAmbalazu(tetrapak1);
		korpa1.dodajAmbalazu(tetrapak2);
		korpa1.dodajAmbalazu(staklenaAmbalaza1);
		korpa1.dodajAmbalazu(staklenaAmbalaza2);
		korpa1.izbaciAmbalazu(tetrapak2.getBarkod());

		SuperKartica superKartica = new SuperKartica("3253-2353","Marija Nikolic", 20);
		korpa1.ukupnaCenaKorpe(superKartica);
		
		tetrapak1.stampaj();
		tetrapak2.stampaj();
		staklenaAmbalaza1.stampaj();
		staklenaAmbalaza2.stampaj();
		System.out.println("Super kartica:");
		superKartica.stampaj();
		System.out.println("Ukupna cena korpe je: " + korpa1.ukupnaCenaKorpe(superKartica) + " din");
		
	}

}

package d20_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Igrac igrac1 = new Igrac("Marija Nikolic ", "0702998735011 ", 1998 , 7 , "Napadac ", false);
		Igrac igrac2 = new Igrac("Stefan Mihajlovic ", "2901995748592 ", 1995 , 29 , "Spic ", true);

		Trener trener1 = new Trener("Jovan Vuksanovic ", "1101995838485 ", 1995 , 17 , "Personalni");
		Trener trener2 = new Trener("Nikola Kocic ", "230899462982 ", 1994 , 8 , "Kondicioni");

		trener1.stampaj();
		igrac2.stampaj();
		System.out.println();
		trener2.stampaj();
		igrac1.stampaj();
	}

}

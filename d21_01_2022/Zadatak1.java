package d21_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

//U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//postaviti sektore u kojima rade i ispisati platu za svakog

	public static void main(String[] args) {
		Sektor sektor1 = new Sektor("Magacin ocarinjene robe", 50000.0);
		Sektor sektor2 = new Sektor("Magacin robe za carinu", 60000.0);
		Sektor sektor3 = new Sektor("IT sektor", 100000.0);
		
		ArrayList<Sektor> nizSektora1 = new ArrayList<Sektor>();
		nizSektora1.add(sektor1);
		nizSektora1.add(sektor2);
		Magacioner magacioner = new Magacioner("Dusan Nikolic ", nizSektora1);

		ArrayList<Sektor> nizSektora2 = new ArrayList<Sektor>();
		nizSektora2.add(sektor2);
		nizSektora2.add(sektor3);
		Menadzer menadzer = new Menadzer("Marija Nikolic ", nizSektora2);
		
		System.out.println("Plata za: " + magacioner.getImeIPrezime() + " je: " + magacioner.plataRadnika());

		System.out.println("Plata za: " + menadzer.getImeIPrezime() + " je: " + menadzer.plataRadnika());
	}

}

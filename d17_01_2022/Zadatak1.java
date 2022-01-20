package d17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {

//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

		ArrayList<ZeleniKarton> karton = new ArrayList<ZeleniKarton>();

		ZeleniKarton karton1 = new ZeleniKarton("Stefan ", "Mihajlovic", "2333", "Diskretne strukture", "Nikola ",
				"Nikolic", 10);
		ZeleniKarton karton2 = new ZeleniKarton("Marija ", "Nikolic", "2478", "Krivicno pravo ", "Aleksandra ", "Spasic",
				10);
		ZeleniKarton karton3 = new ZeleniKarton("Jovan ", "Jovanovic", "N473", "Matematika", "Dragica ", "Cvetkovic", 9);
		ZeleniKarton karton4 = new ZeleniKarton("Tijana ", "Vuckovic", "1234", "Istorija umetnosti", "Ana ", "Tasic", 10);
		ZeleniKarton karton5 = new ZeleniKarton("Milica ", "Djurovic", "2423", "Pravo EU", "Milovanka ", "Kocic", 10);
		ZeleniKarton karton6 = new ZeleniKarton("Ana ", "Anic", "AB43", "Menadzment", "Milovan ", "Krstic", 7);
		ZeleniKarton karton7 = new ZeleniKarton("Stefan ", "Nikolic", "6463", "Elektrotehnika", "Miodrag ", "Nikolic",
				10);
		ZeleniKarton karton8 = new ZeleniKarton("Dusan ", "Nikolic", "666E", "Fizicko", "Drca ", "Milanovic", 5);
		ZeleniKarton karton9 = new ZeleniKarton("Nevena ", "Nikolic", "5355", "Poslasticarstvo", "Zorana ",
				"Dimitrijevic", 9);
		ZeleniKarton karton10 = new ZeleniKarton("Tamara ", "Mihajlovic", "5353", "Psihologija", "Blagica ", "Blagojevic",
				10);
		karton.add(karton1);
		karton.add(karton2);
		karton.add(karton3);
		karton.add(karton4);
		karton.add(karton5);
		karton.add(karton6);
		karton.add(karton7);
		karton.add(karton8);
		karton.add(karton9);
		karton.add(karton10);
		for (int i = 0; i < karton.size(); i++) {
			karton.get(i).stampaj();
		}

	}
}

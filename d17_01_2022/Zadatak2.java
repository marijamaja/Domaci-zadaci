package d17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		Racun racunUplatioca = new Racun();
		Racun racunPrimaoca = new Racun();
		
		racunUplatioca.setBrojRacuna("234-00042429222-43");
		racunUplatioca.setImeIPrezime("Stefan Mihajlovic");
		racunUplatioca.promeniStanjeRacuna(100000.0);
		
		racunPrimaoca.setBrojRacuna("224-000023422922-53");
		racunPrimaoca.setImeIPrezime("Marija Nikolic");
		racunPrimaoca.promeniStanjeRacuna(3000.0);
		
		Transakcija transakcija = new Transakcija("293DD3042K", racunUplatioca, racunPrimaoca);
		transakcija.stampaj();
		transakcija.izvrsiTransakciju(2000.0);
		transakcija.stampaj();
	}

}

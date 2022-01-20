package d17_01_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost
//		(stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.
//			
		 
		private String brojRacuna;
		private String imeIPrezime;
		private double trenutnoStanje;
		
		public String getBrojRacuna() {
			return brojRacuna;
		}
		public void setBrojRacuna(String brojRacuna) {
			this.brojRacuna = brojRacuna;
		}
		public String getImeIPrezime() {
			return imeIPrezime;
		}
		public void setImeIPrezime(String imeIPrezime) {
			this.imeIPrezime = imeIPrezime;
		}
		public double getTrenutnoStanje() {
			return trenutnoStanje;
		}
		public void promeniStanjeRacuna(double trenutnoStanje) {
			this.trenutnoStanje = trenutnoStanje;
			if(this.trenutnoStanje < 0) {
				this.trenutnoStanje = 0;
			}
		}
		public void stampaj() {
			System.out.println(this.imeIPrezime + " "+ this.brojRacuna);
			System.out.println("Stanje na racunu je: " + this.trenutnoStanje + " rsd");
}
}
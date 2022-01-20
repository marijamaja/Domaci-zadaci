package d17_01_2022;

public class Transakcija {
//	reirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna

		private String idTransakcije;
		private Racun racunUplatioca;
		private Racun racunPrimaoca;
		
		public Transakcija(String idTransakcije, Racun racunUplatioca, Racun racunPrimaoca) {
			this.idTransakcije = idTransakcije;
			this.racunUplatioca = racunUplatioca;
			this.racunPrimaoca = racunPrimaoca;
		}
		public String getIdTransakcije() {
			return idTransakcije;
		}
		public void setIdTransakcije(String idTransakcije) {
			this.idTransakcije = idTransakcije;
		}
		public Racun getRacunUplatioca() {
			return racunUplatioca;
		}
		public void setRacunUplatioca(Racun racunUplatioca) {
			this.racunUplatioca = racunUplatioca;
		}
		public Racun getRacunPrimaoca() {
			return racunPrimaoca;
		}
		public void setRacunPrimaoca(Racun racunPrimaoca) {
			this.racunPrimaoca = racunPrimaoca;
		}
		public void izvrsiTransakciju(double iznos) {
			double trenutnoStanjeRacunaUplatioca = this.racunUplatioca.getTrenutnoStanje();
			trenutnoStanjeRacunaUplatioca -= iznos;
			trenutnoStanjeRacunaUplatioca -= this.racunajProviziju(iznos);
			this.racunUplatioca.promeniStanjeRacuna(trenutnoStanjeRacunaUplatioca);
			
			double trenutnoStanjeRacunaPrimaoca = this.racunPrimaoca.getTrenutnoStanje();
			trenutnoStanjeRacunaPrimaoca += iznos;
			this.racunPrimaoca.promeniStanjeRacuna(trenutnoStanjeRacunaPrimaoca);
		}
		private double racunajProviziju(double visinaTransakcije) {
			double provizija = 0.0;
			if(visinaTransakcije < 4500) {
				provizija = 45.0;
			}else if (visinaTransakcije > 4500) {
				provizija = (int)(visinaTransakcije*(1/100.0));
			}
			return provizija;
		}
		public void stampaj() {
			System.out.println("ID transakcije: " + this.idTransakcije);
			System.out.println("Racun sa: ");
			this.racunUplatioca.stampaj();
			System.out.println("Racun na: ");
			this.racunPrimaoca.stampaj();

		}
}

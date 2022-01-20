package d18_01_2022;

public class Ispit {
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

		private String nazivPredmeta;
		private int ocena;
		private String imeIPrezimeProf;
		
		
		public Ispit(String nazivPredmeta, int ocena, String imeIPrezimeProf) {;
			this.nazivPredmeta = nazivPredmeta;
			this.ocena = ocena;
			this.imeIPrezimeProf = imeIPrezimeProf;
		}
		public String getNazivPredmeta() {
			return nazivPredmeta;
		}
		public void setNazivPredmeta(String nazivPredmeta) {
			this.nazivPredmeta = nazivPredmeta;
		}
		public int getOcena() {
			return ocena;
		}
		public void setOcena(int ocena) {
			this.ocena = ocena;
		}
		public String getImeIPrezimeProf() {
			return imeIPrezimeProf;
		}
		public void setImeIPrezimeProf(String imeIPrezimeProf) {
			this.imeIPrezimeProf = imeIPrezimeProf;
		}
		public boolean daLiJeIspitPolozen() {
			if (this.ocena > 5 && this.ocena <= 10) {
				return true;
			}
			return false;
		}
		public void stampaj() {
			System.out.println(this.nazivPredmeta + " - " + this.imeIPrezimeProf + " - " + this.ocena);
		}
}

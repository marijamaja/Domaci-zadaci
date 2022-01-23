package d21_01_2022;
//Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

import java.util.ArrayList;

public abstract class Radnik {

		private String imeIPrezime;
		private ArrayList<Sektor> nizSektora;
		
		public Radnik() {
		}
		public Radnik(String imeIPrezime, ArrayList<Sektor> nizSektora) {
			super();
			this.imeIPrezime = imeIPrezime;
			this.nizSektora = nizSektora;
		}
		public String getImeIPrezime() {
			return imeIPrezime;
		}
		public void setImeIPrezime(String imeIPrezime) {
			this.imeIPrezime = imeIPrezime;
		}
		public ArrayList<Sektor> getNizSektora() {
			return nizSektora;
		}
		public void setNizSektora(ArrayList<Sektor> nizSektora) {
			this.nizSektora = nizSektora;
		}
		public abstract double plataRadnika();
		
		public void zaposliUSektor(Sektor sektor) {
			this.nizSektora.add(sektor);
		}
}

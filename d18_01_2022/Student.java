package d18_01_2022;

import java.util.ArrayList;

import d17_01_2022.ZeleniKarton;

public class Student {
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

		private String brojIndeksa;
		private String imeIPrezime;
		private String tipStudija;
		private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
		
		public Student(String brojIndeksa, String imeIPrezime, String tipStudija){
			this.brojIndeksa = brojIndeksa;
			this.imeIPrezime = imeIPrezime;
			this.tipStudija = tipStudija;
		}
		public String getBrojIndeksa() {
			return brojIndeksa;
		}
		public void setBrojIndeksa(String brojIndeksa) {
			this.brojIndeksa = brojIndeksa;
		}
		public String getImeIPrezime() {
			return imeIPrezime;
		}
		public void setImeIPrezime(String imeIPrezime) {
			this.imeIPrezime = imeIPrezime;
		}
		public String getTipStudija() {
			return tipStudija;
		}
		public void setTipStudija(String tipStudija) {
			this.tipStudija = tipStudija;
		}
		public ArrayList<Ispit> getIspiti() {
			return ispiti;
		}
		public void dodajIspit(Ispit ispit) {
			this.ispiti.add(ispit);
		}
		public double prosek() {
			double sumaOcena = 0.0;
			double brojPolozenihIspita = 0.0;
			for(int i = 0; i< this.ispiti.size();i++) {
				if (this.ispiti.get(i).daLiJeIspitPolozen()) {
					sumaOcena += this.ispiti.get(i).getOcena();
					brojPolozenihIspita ++;
				}
			}
			return sumaOcena / brojPolozenihIspita;
		}
		public void stampaj() {
			System.out.println(this.brojIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
			System.out.println("Predmeti: ");
			for(int i = 0; i< this.ispiti.size();i++) {
				this.ispiti.get(i).stampaj();
			}
			System.out.println("Prosecna ocena: " + this.prosek());
		}
		
}

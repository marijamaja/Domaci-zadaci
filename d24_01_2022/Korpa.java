package d24_01_2022;
//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar 
//funkcije se prima Super karticu iz koje se cita popust.

import java.util.ArrayList;


public class Korpa {
	
	private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();
	
	
	public ArrayList<Ambalaza> getNizAmbalaza() {
		return nizAmbalaza;
	}
	public void setNizAmbalaza(ArrayList<Ambalaza> nizAmbalaza) {
		this.nizAmbalaza = nizAmbalaza;
	}


	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.nizAmbalaza.add(ambalaza);

	}
	public void izbaciAmbalazu(String barkod) {
		for(int i = 0; i < this.nizAmbalaza.size(); i++) {
			if(this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
				this.nizAmbalaza.remove(i);
			}
		}
	}
	private double cenaSaPopustom(int popust) {
		double sumaCena = 0; 
		for(int i = 0; i < this.nizAmbalaza.size(); i++) {
			sumaCena = sumaCena + (this.nizAmbalaza.get(i).cenaArtikla() - popust);
		}
		return sumaCena;
	}
	public double ukupnaCenaKorpe(SuperKartica superKartica) {
		return this.cenaSaPopustom(superKartica.getPopust());
		
	}
}

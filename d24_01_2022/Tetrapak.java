package d24_01_2022;

//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.

public class Tetrapak extends Ambalaza {

	private boolean reciklaza;
	private double osnovnaCena;
	
	public Tetrapak(boolean reciklaza, double osnovnaCena,String barkod, String naziv, double netoTezina, double brutoTezina) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if(this.reciklaza == true) {
			return (this.tezinaPakovanja() * 1.5) + this.osnovnaCena;
		}else {
		return this.osnovnaCena;
		}
	}

	@Override
	public void stampaj() {
		System.out.println(this.reciklaza);
		System.out.println(this.osnovnaCena);
		
	}
}

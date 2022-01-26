package d24_01_2022;

//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucija;
	private boolean daLisePlacaKaucija;
	private double osnovnaCena;
	
	public StaklenaAmbalaza(double kaucija, boolean daLisePlacaKaucija, double osnovnaCena,
			String barkod, String naziv, double netoTezina, double brutoTezina) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLisePlacaKaucija = daLisePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLisePlacaKaucija() {
		return daLisePlacaKaucija;
	}

	public void setDaLisePlacaKaucija(boolean daLisePlacaKaucija) {
		this.daLisePlacaKaucija = daLisePlacaKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if(this.daLisePlacaKaucija == true) {
			return (this.osnovnaCena * 1.2) + this.kaucija;
		}else {
		return this.osnovnaCena * 1.2;
	}
}
	@Override
	public void stampaj() {
		System.out.println(this.kaucija);
		System.out.println(this.daLisePlacaKaucija );
		System.out.println(this.osnovnaCena);
	}

}

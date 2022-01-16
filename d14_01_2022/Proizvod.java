package d14_01_2022;

public class Proizvod {
//	sifru proizvoda
//	naziv proizvoda
//	cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//	konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//	gettere i settere za sifru i naziv
//	setter za cenu po kilogramu
//	metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//	metodu getCenaLb koja vraca cenu za 1lb prozvoda
//	 		konverzija: 1 kg = 2.2046 lb
//	metodu koja stampa proizvod u formatu:
//	(sifra) - (naziv)
	
	private String sifraProizvoda;
	private String nazivProizvoda;
	private double cenaPoKg;
	
	public Proizvod(String sifraProizvoda, String nazivProizvoda, double cenaPoKg) {
		this.sifraProizvoda = sifraProizvoda;
		this.nazivProizvoda = nazivProizvoda;
		this.cenaPoKg = cenaPoKg;
	}
	public String getSifraProizvoda() {
		return sifraProizvoda;
	}
	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}
	public String getNazivProizvoda() {
		return nazivProizvoda;
	}
	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	public void setCenaPoKg(double cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
	}
	public double getCenaKG() {
		return this.cenaPoKg;
	}
	public double getCenaLb() {
		return this.cenaPoKg * 2.2046;
	}
	public void stampaj() {
		System.out.println(this.sifraProizvoda + " - " + this.nazivProizvoda);
	}
}

package d14_01_2022;

public class Vaga {
//	Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		default-ni konstuktor
//		getteri i setteri za sve atribute
//		metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
	//Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		metodu stampaj koja stampa racun u formatu:
//		               (sifra) - (naziv)
//		   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//		   Ukupno: (ukupna cena) 	      

	private String kgLb;
	private Proizvod proizvod;
	
	public Vaga(String kgLb, Proizvod proizvod) {
		this.kgLb = kgLb;
		this.proizvod = proizvod;
	}
	public String getKgLb() {
		return kgLb;
	}
	public void setKgLb(String kgLb) {
		this.kgLb = kgLb;
	}
	public Proizvod getProizvod() {
		return proizvod;
	}
	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	public double sracunajCenu(double tezina) {
		if (this.kgLb.equals("kg")) {
			return tezina * this.proizvod.getCenaKG();
		} else if (this.kgLb.equals("lb")) {
			return tezina * this.proizvod.getCenaLb();
		} else {
			return 0;
		}
	}
		public void stampaj(double tezina) {
		this.proizvod.stampaj();
		System.out.println("Cena je: " + this.sracunajCenu(tezina) + " " + this.kgLb);
		
	}
		
}

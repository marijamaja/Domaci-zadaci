package d24_01_2022;
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere 
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)

public class SuperKartica {

	private String brojKartice;
	private String imeIPrezime;
	private int popust;
	
	public SuperKartica() {
	}
	public SuperKartica(String brojKartice, String imeIPrezime, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.imeIPrezime = imeIPrezime;
		this.popust = popust;
	}
	public String getBrojKartice() {
		return brojKartice;
	}
	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	public int getPopust() {
		return popust;
	}
	public void setPopust(int popust) {
		this.popust = popust;
	}
	public void stampaj() {
		System.out.println(this.brojKartice + ", " + this.imeIPrezime);
	}
}

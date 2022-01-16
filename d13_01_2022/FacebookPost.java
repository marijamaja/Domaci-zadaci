package d13_01_2022;

public class FacebookPost {

	private String imeIPrezimeKorisnikaKojiObjavljuje;
	private String imeIPrezimeKorisnikaProfila;
	private String textObjave;
	private int brojLajkova = 0;
	private int brojdeljenja;
	
	public FacebookPost(String imeIPrezimeKorisnikaKojiObjavljuje, String imeIPrezimeKorisnikaProfila, String textObjave, int brojLajkova, int brojdeljenja) {
		this.imeIPrezimeKorisnikaKojiObjavljuje=imeIPrezimeKorisnikaKojiObjavljuje;
		this.imeIPrezimeKorisnikaProfila = imeIPrezimeKorisnikaProfila;
		this.textObjave = textObjave;
		this.brojLajkova = brojLajkova;
		this.brojdeljenja = brojdeljenja;
	}

	public String getImeIPrezimeKorisnikaKojiObjavljuje() {
		return imeIPrezimeKorisnikaKojiObjavljuje;
	}

	public void setImeIPrezimeKorisnikaKojiObjavljuje(String imeIPrezimeKorisnikaKojiObjavljuje) {
		this.imeIPrezimeKorisnikaKojiObjavljuje = imeIPrezimeKorisnikaKojiObjavljuje;
	}

}

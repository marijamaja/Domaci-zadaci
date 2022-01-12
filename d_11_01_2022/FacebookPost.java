package d11_01_2022;

public class FacebookPost {

	String imeIPrezimeKorisnikaKojiObjavljuje;
	String imeIPrezimeKorisnikaProfila;
	String textObjave;
	int brojLajkova;
	int brojdeljenja;

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {
		this.brojLajkova = this.brojLajkova - 1;
		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}

	public void share() {
		this.brojdeljenja = this.brojdeljenja + 1;
	}

	public void stampaj() {

		System.out.println(this.imeIPrezimeKorisnikaKojiObjavljuje + " >>> " + this.imeIPrezimeKorisnikaProfila);
		System.out.println(this.textObjave);
		System.out.println("Likes " + this.brojLajkova + " / " + "Shares " + this.brojdeljenja);

	}
}

package d11_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		FacebookPost FacebookPost1 = new FacebookPost();
		
		FacebookPost1.imeIPrezimeKorisnikaKojiObjavljuje = "Marija Nikolic";
		FacebookPost1.imeIPrezimeKorisnikaProfila = "Nevena Nikolic";
		FacebookPost1.textObjave = "Srecan rodjendan!";
		FacebookPost1.brojLajkova = 30;
		FacebookPost1.brojdeljenja = 3;
		
		FacebookPost1.like();
		FacebookPost1.dislike();
		FacebookPost1.share();
		FacebookPost1.stampaj();

		System.out.println();
		
		FacebookPost FacebookPost2 = new FacebookPost();

		FacebookPost2.imeIPrezimeKorisnikaKojiObjavljuje = "Marija Nikolic";
		FacebookPost2.imeIPrezimeKorisnikaProfila = "Dusan Nikolic";
		FacebookPost2.textObjave = "AMIN !!!";
		FacebookPost2.brojLajkova = 20;
		FacebookPost2.brojdeljenja = 1;
		
		FacebookPost2.like();
		FacebookPost2.dislike();
		FacebookPost2.share();
		FacebookPost2.stampaj();
		
	}

}

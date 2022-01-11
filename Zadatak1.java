package d10_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Proizvod proizvod1 = new Proizvod();
 
		proizvod1.naziv = "Cokolada";
		proizvod1.cena = 100 ;
		proizvod1.tezina = 90 ;
		
		proizvod1.stampaj();
		
		Proizvod proizvod2 = new Proizvod();

		proizvod2.naziv = "Cips";
		proizvod2.cena = 80 ;
		proizvod2.tezina = 100 ;
		
		proizvod2.stampaj();

		
	}

}

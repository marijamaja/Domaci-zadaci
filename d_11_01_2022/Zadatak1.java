package d11_01_2022;

public class Zadatak1 {

		public static void main(String[] args) {
			
			Proizvod proizvod1 = new Proizvod();
			 
			proizvod1.naziv = "Cokolada";
			proizvod1.cena = 100 ;
			proizvod1.tezina = 220 ;
			int povecanje = 10;
			double popust = 10.0;
			
			proizvod1.povecajCenu(povecanje);
			proizvod1.stampaj();
			System.out.println("Cena sa popustom je : " + proizvod1.vratiCenuSaPopustom(popust)+ "din");			
			System.out.println("Postarina je : " + proizvod1.racunajPostarinu() + "din");
			System.out.println();
			
			Proizvod proizvod2 = new Proizvod();

			proizvod2.naziv = "Cips";
			proizvod2.cena = 80 ;
			proizvod2.tezina = 100 ;
			int povecanje2 = 20;
			double popust1= 50.0;
			
			proizvod2.povecajCenu(povecanje2);
			proizvod2.stampaj();
			System.out.println("Cena sa popustom je : " + proizvod2.vratiCenuSaPopustom(popust1)+ "din");			
			System.out.println("Postarina je : " + proizvod2.racunajPostarinu() + "din");
		}
	}

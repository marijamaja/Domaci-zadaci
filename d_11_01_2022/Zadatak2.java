package d11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

        SmartAirConditioning klima1 = new SmartAirConditioning();
		
		klima1.marka = "Samsung";
		klima1.temperatura = 26 ;
		klima1.mod = "Greje";
		klima1.potrosnjaDokGreje = 2;
		klima1.potrosnjaDokHladi = 1;
		int mesecnaPotrosnja = klima1.mesecnaPotrosnja();
		
		klima1.stampaj();
		System.out.println("Mesecna potrosnja je: " + mesecnaPotrosnja + "kW");
		System.out.println("Cena struje za ovaj mesec je: " + klima1.kolikoNovcaKlimaTrosi(mesecnaPotrosnja) + "din");

		System.out.println();
		
		SmartAirConditioning klima2 = new SmartAirConditioning();

		klima2.marka = "Galanz";
		klima2.temperatura = 17 ;
		klima2.mod = "Hladi";
		klima2.potrosnjaDokGreje = 2;
		klima2.potrosnjaDokHladi = 1;
		int mesecnaPotrosnja2 = klima2.mesecnaPotrosnja();

		klima2.stampaj();
		System.out.println("Mesecna potrosnja je: " + mesecnaPotrosnja2 + "kW");
		System.out.println("Cena struje za ovaj mesec je: " + klima2.kolikoNovcaKlimaTrosi(mesecnaPotrosnja2) + "din");
	}
}

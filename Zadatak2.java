package d10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		
		SmartAirConditioning klima1 = new SmartAirConditioning();
		
		klima1.marka = "Samsung";
		klima1.temperatura = 26 ;
		klima1.mod = "Greje";
		
		klima1.stampaj();
		
		SmartAirConditioning klima2 = new SmartAirConditioning();

		klima2.marka = "Galanz";
		klima2.temperatura = 17 ;
		klima2.mod = "Hladi";
		
		klima2.stampaj();
		
	}

}

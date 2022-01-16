package d14_01_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Proizvod proizvod = new Proizvod("B112345", "Banana", 10.0);
		Vaga vaga = new Vaga("lb", proizvod);
		vaga.stampaj(10.0);
	}

}

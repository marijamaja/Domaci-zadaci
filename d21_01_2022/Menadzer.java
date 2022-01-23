package d21_01_2022;
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

import java.util.ArrayList;

public class Menadzer extends Radnik {

	
	public Menadzer(String imeIPrezime, ArrayList<Sektor> nizSektora) {
		super(imeIPrezime, nizSektora);
	}

	@Override
	public double plataRadnika() {
		double suma = 0;
		for(int i = 0; i < this.getNizSektora().size(); i++) {
			suma += this.getNizSektora().get(i).getPlata();
		}
		return suma;
	}

}

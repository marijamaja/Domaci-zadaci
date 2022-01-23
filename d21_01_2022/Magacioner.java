package d21_01_2022;
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).

import java.util.ArrayList;

public class Magacioner extends Radnik {
	
	public Magacioner(String imeIPrezime, ArrayList<Sektor> nizSektora) {
		super(imeIPrezime, nizSektora);
	}

	private double prosecnaPlata() {
		double suma = 0;
		double prosecnaPlata = 0;
		for(int i = 0; i < this.getNizSektora().size(); i++) {
			suma += this.getNizSektora().get(i).getPlata();
		}
		prosecnaPlata = suma / this.getNizSektora().size() * 0.5;
		return prosecnaPlata;
	}

	@Override
	public double plataRadnika() {
		return this.prosecnaPlata() * this.getNizSektora().size();
	}
}

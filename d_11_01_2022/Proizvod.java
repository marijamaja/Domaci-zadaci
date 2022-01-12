package d11_01_2022;

public class Proizvod {
	
	String naziv;
	double cena;
	double tezina;	
	
	public  void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + "din , " + this.tezina + "g ");
	}
	public void povecajCenu(int povecanje) {
		cena = cena + povecanje;
	}
	public double vratiCenuSaPopustom(double popust) {
		double cenaSaPopustom = this.cena - ((int)(this.cena*(popust/100.0)));
		return cenaSaPopustom;
	}
	public int racunajPostarinu() {
		if (this.tezina <= 100) {
			return 200;
		} else if (this.tezina >= 101 && this.tezina <= 500){
			return 400;
		}	else {
			return 1000;
		}
		
	}

}
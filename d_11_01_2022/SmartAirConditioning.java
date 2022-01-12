package d11_01_2022;

public class SmartAirConditioning {
	
	String marka;
	int temperatura;
	String mod;
	int potrosnjaDokGreje;
	int potrosnjaDokHladi;
	
	public void stampaj() {
		System.out.println(this.marka + ", " + this.temperatura + "C, " + this.mod);
	}
	public int mesecnaPotrosnja() {
		if(this.mod.equals("Hladi")) {
			return 30 * 15 * this.potrosnjaDokHladi;
		} else if (this.mod.equals("Greje")) {
			return 30 * 15 * this.potrosnjaDokGreje;
		} else {
			return 0;
		}
	}
	
	public int kolikoNovcaKlimaTrosi(int mesecnaPotrosnja) {	
		if(mesecnaPotrosnja <= 350) {
			return mesecnaPotrosnja * 6 ;
		} else {
			int potrosnja = 350 * 6;
			potrosnja = potrosnja + ((mesecnaPotrosnja - 350) * 9) ;
			return potrosnja; 
		}
	}
}

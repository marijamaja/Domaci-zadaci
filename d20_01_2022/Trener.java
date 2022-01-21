package d20_01_2022;
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

public class Trener extends Osoba {

	private int godineIskustva;
	private String tipTrenera;
	
	
	public Trener(String imeIPrezime, String jmbg, int godRodjenja,int godineIskustva, String tipTrenera) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}
	
	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	public void stampaj() {
		System.out.println(this.getImeIPrezime() +", "+ this.getJmbg() +", "+ this.getGodRodjenja() 
		+", "+ this.godineIskustva+", "+ this.tipTrenera);
	}
}

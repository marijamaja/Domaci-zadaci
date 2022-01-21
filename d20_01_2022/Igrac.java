package d20_01_2022;
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

public class Igrac extends Osoba {

	private int broj;
	private String pozicija;
	private boolean kapiten;
	
	public Igrac() {
		
	}

	public Igrac(String imeIPrezime, String jmbg, int godRodjenja,
			int broj, String pozicija, boolean kapiten) {
		super(imeIPrezime, jmbg, godRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	public void stampaj() {
		System.out.println(this.getImeIPrezime()+", "+ this.getJmbg() +", "+ this.getGodRodjenja() +", "+ 
				this.broj +", "+ this.pozicija +", "+ this.kapiten);
	}
}

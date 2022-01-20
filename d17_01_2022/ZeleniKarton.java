package d17_01_2022;

public class ZeleniKarton {

//	Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime

	private String imeStudenta;
	private String prezimeStudenta;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imeProfesora;
	private String prezimeProfesora;
	private int ocena;

	public ZeleniKarton(String imeStudenta, String prezimeStudenta,String brojIndeksa, String nazivPredmeta, String imeProfesora,
			String prezimeProfesora, int ocena) {
		this.imeStudenta = imeStudenta;
		this.prezimeStudenta = prezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.prezimeProfesora = prezimeProfesora;
		this.ocena = ocena;

	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}

	public String getPrezimeStudenta() {
		return prezimeStudenta;
	}

	public void setPrezimeStudenta(String prezimeStudenta) {
		this.prezimeStudenta = prezimeStudenta;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public String getPrezimeProfesora() {
		return prezimeProfesora;
	}

	public void setPrezimeProfesora(String prezimeProfesora) {
		this.prezimeProfesora = prezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean ispit() {
		boolean polozenIspit = false;
		if (this.ocena > 5) {
			polozenIspit = true;
		}
		return polozenIspit;
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeStudenta + this.prezimeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeProfesora + this.prezimeProfesora);
	}
}

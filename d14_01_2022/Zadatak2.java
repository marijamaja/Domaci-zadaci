package d14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		Autor autor = new Autor("Vilijem Pol", "Jang");

		Knjiga knjiga = new Knjiga("978-86-521-0115-3", "Koliba", 2009, autor);

		knjiga.stampaj();
		System.out.println();

		Autor autor1 = new Autor("Herman", "Hese");

		Knjiga knjiga1 = new Knjiga("978-99-402-5068-3", "Stepski vuk", 1927, autor1);

		knjiga1.stampaj();

}
}

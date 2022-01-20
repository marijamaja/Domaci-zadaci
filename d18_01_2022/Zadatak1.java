package d18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Ispit ispit = new Ispit("Srpski jezik", 10, "Katarina Korusac");
		Ispit ispit1 = new Ispit("Engleski jezik", 6, "Katarina Nikolic");
		Ispit ispit2 = new Ispit("Ruski jezik", 8, "Natasa Cakic");
		Ispit ispit3 = new Ispit("Krivicno pravo", 5, "Marko Markovic");
		
		
		Student student = new Student("A123", "Marija Nikolic", "Osnovne studije");
		student.dodajIspit(ispit3);
		student.dodajIspit(ispit2);
		student.dodajIspit(ispit1);
		student.dodajIspit(ispit);
		
		student.stampaj();

	}

}

package d13_01_2022;

import d11_01_2022.FacebookPost;

public class Zadatak1 {

	public static void main(String[] args) {
		
		FacebookPost facebookPost1 = new FacebookPost("Marija Nikolic", "Nevena Nikolic", "Srecan rodjendan!", 0, 0);
		facebookPost1.like();
		facebookPost1.dislike();
		facebookPost1.share();
		facebookPost1.stampaj();

		System.out.println();
		
		FacebookPost facebookPost2 = new FacebookPost("Marija Nikolic", "Dusan Nikolic", "AMIN !!!", 0, 0);

		facebookPost2.like();
		facebookPost2.dislike();
		facebookPost2.share();
		facebookPost2.stampaj();
		
	}
}

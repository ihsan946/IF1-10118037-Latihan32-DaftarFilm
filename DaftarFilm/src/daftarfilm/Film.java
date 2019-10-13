package daftarfilm;



public class Film {

	public String filmName;
	public String filmGenre;
	public double filmRating;
	public int filmDuration;

	public void nowPlaying() {
                                 System.out.println("Judul Film : " + filmName);
                                 System.out.println("Genre Film : " + filmGenre);
                                 System.out.println("Rating Film : " + filmRating );
                                 System.out.println("Duration Film : " + filmDuration + " Menit\n");
                                         
	}

}
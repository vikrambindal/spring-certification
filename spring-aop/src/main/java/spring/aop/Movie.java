package spring.aop;

public class Movie {

	public void watchMovie() {
		System.out.println("Movie: watchMovie(): Watching Movie");
	}
	
	public void wrongMovie() throws Exception {
		System.out.println("Movie: wrongMovie()");
		throw new Exception("This is not LOTR");
	}
}

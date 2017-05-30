package spring.aop.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.Movie;

public class XmlAopExample {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop-xml.xml");
		
		Movie movie = context.getBean(Movie.class);
		
		System.out.println("\nMovie aspect WITHOUT exception");
		movie.watchMovie();
		
		System.out.println("\nMovie aspect WITH exception");
		try {
			movie.wrongMovie();
		} catch (Exception e) {
			//suppress exception
		}
		
		context.registerShutdownHook();
	}

}

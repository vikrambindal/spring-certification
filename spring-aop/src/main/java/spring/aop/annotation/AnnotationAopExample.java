package spring.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.Movie;

public class AnnotationAopExample {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopAnnotationConfig.class);
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

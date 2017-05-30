package spring.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class XmlMovieAspect {

	public void beforeWatchMovie() {
		System.out.println("MovieAspect: before: Taking Seats");
	}
	
	public void afteraWatchMovie() {
		System.out.println("MovieAspect: after: Leaving Hall");
	}
	
	public void afterReturningWatchMovie() {
		System.out.println("MovieAspect: afterReturning: Going Home");
	}
	
	public void afterThrowingWatchMovie() {
		System.out.println("MovieAspect: afterThrowing: You went for wrong movie");
	}
	
	public void aroundWatchMovie(ProceedingJoinPoint pjp) throws Exception {
		try {
			System.out.println("Before PJP");
			pjp.proceed();
			System.out.println("After PJP");
		} catch (Throwable e) {
			System.out.println("Error PJP");
			throw new Exception();
		}
	}
}

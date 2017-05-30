package spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnnotationMovieAspect {

	@Pointcut("execution(** spring.aop.Movie.**(..))")
	public void pointcutMovie(){}
	
	@Before("pointcutMovie()")
	public void beforeWatchMovie() {
		System.out.println("MovieAspect: before: Taking Seats");
	}
	
	@After("pointcutMovie()")
	public void afteraWatchMovie() {
		System.out.println("MovieAspect: after: Leaving Hall");
	}
	
	@AfterReturning("pointcutMovie()")
	public void afterReturningWatchMovie() {
		System.out.println("MovieAspect: afterReturning: Going Home");
	}
	
	@AfterThrowing("pointcutMovie()")
	public void afterThrowingWatchMovie() {
		System.out.println("MovieAspect: afterThrowing: You went for wrong movie");
	}
	
	@Around("pointcutMovie()")
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
package spring.aop.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring.aop.Movie;

@Configuration
@EnableAspectJAutoProxy
public class AopAnnotationConfig {

	@Bean
	public Movie movie() {
		return new Movie();
	}
	
	@Bean
	public AnnotationMovieAspect movieAspect() {
		return new AnnotationMovieAspect();
	}
}

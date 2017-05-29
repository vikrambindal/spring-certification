package spring.container.lifecycle.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages={"spring.container.lifecycle.annotation"})
@PropertySource({"sample.properties"})
public class AnnotationAppConfig {
}

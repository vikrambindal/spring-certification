package spring.container.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDummyBean implements BeanNameAware, BeanFactoryAware, BeanPostProcessor, InitializingBean, DisposableBean {

	private String customProperty;
	
	@Value("${awesome.property}")
	String propValue;
	
	public AnnotationDummyBean() {
		System.out.println("constructor");
	}
	
	@PostConstruct
	public void customInit(){
		System.out.println("@PostConstruct");
	}
	
	public void setCustomProperty(String customProperty) {
		this.customProperty = customProperty;
		System.out.println("settingCustomProperty()");
	}
	
	public String getPropValue() {
		return this.propValue;
	}
	
	@PreDestroy
	public void customDestroy() {
		System.out.println("@PreDestroy");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName()");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory()");
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInit()" + beanName);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInit()" + beanName);
		return arg0;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}
}

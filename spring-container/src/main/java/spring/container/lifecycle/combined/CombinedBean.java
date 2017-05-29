package spring.container.lifecycle.combined;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CombinedBean implements BeanNameAware, BeanFactoryAware, BeanPostProcessor, InitializingBean, DisposableBean{

	private String name;
	
	public CombinedBean(){
		System.out.println("Bean XML Constructor");
	}	
	
	public String getName() {
		System.out.println("getting name");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	@PostConstruct
	public void customPostConstruct() {
		System.out.println("@PostConstruct");
	}
	
	@PreDestroy
	public void customPostDestroy() {
		System.out.println("@PreDestroy");
	}
	
	@Override
	public void setBeanName(String arg0) {
		System.out.println("BeanNameAware: setBeanName");
	}
	
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("BeanFactoryAware: setBeanFactory()");
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("BeanPostProcess: postProcessAfterInitilization()");
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("BeanPostProcess: postProcessBeforeInitilization()");
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean: afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean: destroy()");
	}
	
	public void customInit(){
		System.out.println("init-method: customInit()");
	}
	
	public void customDestroy(){
		System.out.println("destroy-method: customDestroy()");
	}
}
package spring.container.lifecycle.xml;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XmlBeanLifeCycle {

	private static ClassPathXmlApplicationContext appContext;

	public static void main(String[] args) {
		appContext = new ClassPathXmlApplicationContext("xml-beans.xml");
		
		BeanXml beanXml = appContext.getBean(BeanXml.class);
		System.out.println("Bean Prop Value : " + beanXml.getName());
		
		appContext.registerShutdownHook();
	}
}

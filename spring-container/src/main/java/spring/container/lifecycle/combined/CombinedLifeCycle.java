package spring.container.lifecycle.combined;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CombinedLifeCycle {

	private static ClassPathXmlApplicationContext appContext;

	public static void main(String[] args) {
		appContext = new ClassPathXmlApplicationContext("combined-beans.xml");
		
		CombinedBean combinedBean = appContext.getBean(CombinedBean.class);
		System.out.println("Bean Prop Value : " + combinedBean.getName());
		
		appContext.registerShutdownHook();
	}
}

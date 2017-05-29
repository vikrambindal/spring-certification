package spring.container.lifecycle.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotationBeanLifeCycle {

	private static AnnotationConfigApplicationContext appContext;

	public static void main(String[] args) {
		appContext = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
		AnnotationDummyBean adb = appContext.getBean(AnnotationDummyBean.class);
		
		adb.setCustomProperty("Spring Rules");
		System.out.println("Prop Value is " + adb.getPropValue());
		
		appContext.registerShutdownHook();
	}

}

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import sinc.ctrl.SincCtrl;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		SincCtrl ctrl = factory.getBean("ctrl",SincCtrl.class);
		
		*/
		
		// annotaion 사용시. 미리 객체생성해서 올려놔야함.
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SincCtrl ctrl = factory.getBean("sincCtrl",SincCtrl.class);	// Annotaion으로 찾을 때 클래스명의 첫 소문자로 찾게됨.
		
		
		System.out.println(ctrl.sayEcho("하이루"));
		
	}

}

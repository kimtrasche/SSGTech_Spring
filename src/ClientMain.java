import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import sinc.ctrl.SincCtrl;
import util.tv.TV;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		SincCtrl ctrl = factory.getBean("ctrl",SincCtrl.class);
		
		System.out.println(ctrl.sayEcho("«œ¿Ã∑Á"));
		
	}

}

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import tv.model.vo.Ltv;
import tv.model.vo.Stv;
//import util.factory.BeanFactory;
import util.tv.TV;

public class TvMain {

	public static void main(String[] args) {

//		Stv tv = new Stv();
//		tv.soundUp();
		
//		
//		Ltv tv = new Ltv();
//		tv.volumnUp();
		
		
		/*BeanFactory fa = BeanFactory.getInstance();
		
		TV tv = fa.getBean("samsung");
		tv.powerOn();
		
		
		TV tvs = fa.getBean("lg");
		tvs.powerOn();*/
		
		
		// applicationContext.xml 추가후 , Lib 추가 후
		
		BeanFactory fac = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		TV tv = fac.getBean("lg", TV.class);
		
		tv.powerOff();
		
	}
}

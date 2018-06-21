package util.factory;

import java.util.HashMap;

import tv.model.vo.Ltv;
import tv.model.vo.Stv;
import util.tv.TV;

public class BeanFactory {
	// �̱������� ����
	// 1. ������ ������ : private
	// 2. �ڱ��ڽ��� return. static���� ����
	
	private static BeanFactory instance;
	
	private HashMap<String, TV> map = new HashMap<>();
	
	private BeanFactory() {
		map.put("samsung",new Stv());
		map.put("lg",new Ltv());
	}
	
	// ��Ƽ ������ ȯ�濡�� ��ü�� �ּҰ��� �޶����� ����. ���� �̶� synchronized ������ �ذ�.
	public static synchronized BeanFactory getInstance() {

		if(instance == null ) {
			instance = new BeanFactory();
			
		}
		
		return instance;
	}
	
	// lookup method
	public TV getBean(String brand) {
		return map.get(brand);
	}
	
}

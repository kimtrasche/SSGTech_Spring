package util.factory;

import java.util.HashMap;

import tv.model.vo.Ltv;
import tv.model.vo.Stv;
import util.tv.TV;

public class BeanFactory {
	// 싱글톤으로 생성
	// 1. 생성자 접근자 : private
	// 2. 자기자신을 return. static으로 정의
	
	private static BeanFactory instance;
	
	private HashMap<String, TV> map = new HashMap<>();
	
	private BeanFactory() {
		map.put("samsung",new Stv());
		map.put("lg",new Ltv());
	}
	
	// 멀티 쓰레드 환경에서 객체의 주소값이 달라질수 있음. 따라서 이때 synchronized 넣으면 해결.
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

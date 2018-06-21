package sinc.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sinc.model.sql.IDao;
import sinc.model.sql.SincDao;

@Service("service")
public class SincService {

	//@Resource(name="dao")	//SincDao에서 Resource("")의 이름으로
	//private SincDao dao;
	
	
	/* Setter Injection
	public void setDao(SincDao dao ) {

		this.dao = dao;
	}
	
	*/
	
	/*Constructor Injection
	public SincService(SincDao dao) {
		// TODO Auto-generated constructor stub
		this.dao = dao;
	}
	*/
	
	
	@Autowired	
	//private IDao dao; // 에러남. 여러개의 타입이 존재하기 때문
	//private IDao sincDao;
	private IDao payDao;
	
	public String sayEcho(String msg) {
		System.out.println("Sercice sayEcho");
		//return dao.sayEchoRow(msg);
		//sincDao.selectRow();
		payDao.selectRow();
		return null;
	}
}

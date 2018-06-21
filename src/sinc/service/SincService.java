package sinc.service;

import sinc.model.sql.SincDao;

public class SincService {

	private SincDao dao;
	
	public void setDao(SincDao dao ) {

		this.dao = dao;
	}
	
	public String sayEcho(String msg) {
		System.out.println("Sercice sayEcho");
		return dao.sayEchoRow(msg);
	}
}

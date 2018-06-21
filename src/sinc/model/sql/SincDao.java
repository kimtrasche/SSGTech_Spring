package sinc.model.sql;

import org.springframework.stereotype.Repository;

//@Repository("dao")	// SincDao dao = new SincDao();
@Repository
public class SincDao implements IDao {

	
	public String sayEchoRow(String msg) {
		System.out.println("Sercice sayEcho");
		
		return msg+" !! " ; 
	}

	@Override
	public void selectRow() {
		// TODO Auto-generated method stub
		System.out.println("SincDao SelectRow()");
	}
}

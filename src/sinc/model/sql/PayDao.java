package sinc.model.sql;

import org.springframework.stereotype.Repository;

@Repository
public class PayDao implements IDao {

	@Override
	public void selectRow() {
		// TODO Auto-generated method stub
		System.out.println("PayDao SelectRow()");
	}
}

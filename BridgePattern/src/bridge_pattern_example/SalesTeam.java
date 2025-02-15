package bridge_pattern_example;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee{
	
	private List<Payee> payees = new ArrayList<>();
	
	void addPayee(Payee payee){
		payees.add(payee);
	}
	
	@Override
	public void payExpenses(int amount) {
		payees.forEach(payee -> payee.payExpenses(amount));
	}

}

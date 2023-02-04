package problem4;

public class CheckingAccount extends Account{
	final int FREE_TRANSACTIONS = 5;
	int numTransactions;
	CheckingAccount(int accNumber){
		super(accNumber);
	}
	public void deductFee() {
		numTransactions += 1;
		if(numTransactions > FREE_TRANSACTIONS) {
			super.withdraw(0.02);
		}
	}
	
}

package classwork;

public class Fascade {
	
	private Transaction transaction;
	
	public Fascade() {
		transaction = new Transaction();
	}
	
	public void transact(int accountNumber, int scCode, int amount) {
		if(new AccountNumber().checkAccountNumber(accountNumber) && new ScCode().checkCode(scCode))
			transaction.withdwrpw(amount);
		else
			System.out.println("Wrong account");
	}
	
	public void transact(int accountNumber, int amount) {
		if(new AccountNumber().checkAccountNumber(accountNumber))
			transaction.deposit(amount);
		else
			System.out.println("Wrong account");
	}
}

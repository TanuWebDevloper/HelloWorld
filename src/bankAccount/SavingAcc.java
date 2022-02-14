package bankAccount;

public class SavingAcc extends BankAccount {
	
	private double irate;
	
	public SavingAcc(String accNumber , String accName , double rate) {
		super(accNumber , accName);
		irate = rate;
	}
	
	public void addInterest() {
		double interest = getBal() * irate /100;
		this.deposite(interest);
		
	}

}

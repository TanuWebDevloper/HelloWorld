package bankAccount;

public class BankAccount {
	//BankAccount Attributes
	private String accountNumber;
	private String accountName;
	private double balance;
	
	//constructor
	public  BankAccount(String accNo ,String accName){
		
		accountNumber = accNo;
		accountName = accName;
		balance=0;
	}
	//methods to  read the atrributes
	public String getAcNo() {
		return accountNumber;
		
	}
	public String getAcName() {
		return accountName;
		
	}
	public double getBal() {
		return balance;
		
	}
	

	//methods to deposite and withdraw money
	public boolean deposite(double amount) {
		
		if(amount >0) {
			balance =balance +amount;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean withdraw(double amount) {
		if(amount > balance) {
			return false;
		}else {
			balance = balance-amount;
			return true;
		}
	}


	}


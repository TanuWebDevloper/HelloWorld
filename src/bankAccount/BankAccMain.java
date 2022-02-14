package bankAccount;

public class BankAccMain {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount("2020202202" ,"SavingTanu");
		
		obj.deposite(200);
		obj.deposite(400);
		obj.getBal();
		
		
		System.out.print("balance is" +obj.getBal());
		
		obj.withdraw(500);
		
		
		System.out.print("balance is" +obj.getBal());
		
	
		

	}

}

package bankAccount;

public class CheckingAccMain {

	public static void main(String[] args) {
	
		ChAcc obj =new ChAcc("2022" ,"tanu");
		
		obj.deposite(400);
		obj.withdraw(200);
		obj.deposite(1000);
		
		obj.deductFees();
		
		System.out.println(obj.getBal());
		
		//obj.deposite(300);
		
		System.out.println(obj.getBal());
		

	}

}

package bankAccount;

public class SavingMain {

	public static void main(String[] args) {
		
		SavingAcc obj = new SavingAcc("2022" ,"tanu" , 5);
		obj.deposite(500);
		
		
		System.out.print(obj.getBal());
		
		obj.addInterest();
		
		
		System.out.println(obj.getBal());

	}

}

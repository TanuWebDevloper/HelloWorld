package bankAccount;

public class ChAcc extends BankAccount{
	
	 private int tcount;
	 private static final double numfee=3.0;
	 private static final double transfee = 2.0;
	 
	 public ChAcc (String accNumber , String accName) {
		 super(accNumber , accName);
		 tcount=0;
		 }
	 
	 public boolean deposite(double amount) {
		 if(super.deposite(amount)) {
			 tcount++;
			 return true;
		 }
		 return false;
	 }
	 
	 public boolean withdraw(double amount) {
		 if(super.withdraw(amount)) {
			 tcount++;
			 return true;
		 }
		 return false;	 
		 
		 
	 }
	 public void deductFees() {
		 if(tcount>numfee) {
			 double fees =transfee *(tcount -numfee);
			 if(super.withdraw(fees)) {
				 
				 tcount= 0;
			 }
		 }
	 }
	 
}



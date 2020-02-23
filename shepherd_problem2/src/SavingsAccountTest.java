
public class SavingsAccountTest {
	
	
	public static void main(String[] args) {
		System.out.println("       Saver1          ");
	SavingsAccount saver1 = new SavingsAccount(2000.00); 
	saver1.calculateMonthlyInterest();
	
	
	SavingsAccount saver2 = new SavingsAccount(3000.00);
	System.out.println("       Saver2          ");
	saver2.calculateMonthlyInterest();
	
		
	}

}

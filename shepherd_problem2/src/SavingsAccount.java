
public class SavingsAccount {
	
	private static double  annualInterestRate;
    private static double savingsBalance;
    static double MonthlyBalance;
    
    
public SavingsAccount(double bank ) {
	    
		savingsBalance = bank; 
		annualInterestRate = 0.04;
	}


public static void calculateMonthlyInterest(){
	
	System.out.println("Starting Balance: " + savingsBalance);
		for(int i = 0; i< 12; i++) {
			 MonthlyBalance =((savingsBalance * annualInterestRate) / 12);
			savingsBalance += Math.round((MonthlyBalance * 100)/100); 
			System.out.println("Month " + i + " | Balance: " + savingsBalance + "| Interest rate: " + annualInterestRate + " |");
			System.out.println("_____________________________________________");
		}
		
		modifyInterestRate();
		 MonthlyBalance = Math.round((savingsBalance * annualInterestRate) / 12);
		savingsBalance += MonthlyBalance; 
		System.out.println("Month 12 | Balance: " + savingsBalance + "| Interest rate: " + annualInterestRate + " |");
		System.out.println("_____________________________________________");
		System.out.println();
}
	

	public static void modifyInterestRate() {
		annualInterestRate = 0.05;
	}
	

}

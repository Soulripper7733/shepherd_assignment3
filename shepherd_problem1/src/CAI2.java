import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	static SecureRandom random = new SecureRandom();
	static int random_num = random.nextInt(10); 
	static int random_num1 = random.nextInt(10);
	static String Userinput; 
	static int total; 
	static int StudAnswer; 
	
	public static void quiz() {
		
	total =  random_num * random_num1;
		
		askQuestion();

	}
	public static void askQuestion() {
		 
		System.out.print("How much is " + random_num + " times " + random_num1 +" ?");
	readResponse();
	}
	
	public static void readResponse() {
	Scanner input = new Scanner(System.in);
		
		 Userinput = input.nextLine();
		 StudAnswer = Integer.parseInt(Userinput);
		 isAnswerCorrect();
	}
	
	public static void isAnswerCorrect() {
	
	if( total == StudAnswer) {
		displayCorrectResponse();
	}
	else {
		displayIncorrectResponse();
	}
	}
	
	public static void displayCorrectResponse() {
		 
		switch(random.nextInt((4 - 1) + 1)+ 1 ) {
		case 1: System.out.println("Very Good!");
		break;
		case 2: System.out.println("Excellent!");
		break;
		case 3: System.out.println("Nice work!");
		break;
		case 4: System.out.println("Keep up the good work!");
		break;
			
		}
		
	}

	public static void displayIncorrectResponse() {
		switch(random.nextInt((4 - 1) + 1)+ 1 ) {
		case 1: System.out.println("No. Please try again.");
		break;
		case 2: System.out.println("Wrong. Try once more.");
		break;
		case 3: System.out.println("Don't give up!");
		break;
		case 4: System.out.println("No. Keep trying.");
		break;
		}
		askQuestion();
	}
	
	public static void main(String[] args) {
		
     quiz();
	}


}

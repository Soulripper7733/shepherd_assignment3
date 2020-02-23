import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
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
		System.out.println("Very Good!");
	}
	public static void displayIncorrectResponse() {
		System.out.println("No. Please try again.");
		askQuestion();
	}
	
	public static void main(String[] args) {
		
     quiz();
	}

}

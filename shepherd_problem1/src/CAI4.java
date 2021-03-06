import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
	static SecureRandom random = new SecureRandom();
	static int random_num; 
	static int  random_num1;
	static String Userinput; 
	static double total; 
	static int StudAnswer; 
	static double counter1 = 0.00;
	static double percentage = 0.00;
	static int UserDifficulty = 0 ; 
	
	public static void quiz() {
		counter1 = 0.0;
		readDifficulty();
		askQuestion();
		displayCompletionMessage();
	

	}
	public static void askQuestion() {
		
		for(int i = 1; i < 11; i++) {	
			generateQuestionArgument();
			System.out.print("Question " + i + " :");
			System.out.print("How much is " + random_num + " times " + random_num1 +" ?");
			readResponse();
		
		}
		}
	
	public static void readResponse() {
	Scanner input = new Scanner(System.in);
		
		 Userinput = input.nextLine();
		 StudAnswer = Integer.parseInt(Userinput);
		 isAnswerCorrect();
	}
	
	public static void isAnswerCorrect() {
	
	if( total == StudAnswer) {
		
		counter1++;
	
		
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
		
	}
	public static void displayCompletionMessage() {
		
		Scanner nextquiz = new Scanner(System.in);
			percentage = (counter1 / 10) * 100 ;
		System.out.println("Your quiz grade is: " + percentage + "%");
		if(percentage < 75.0) {
			System.out.println("Please ask your teacher for extra help!");
		}
		else if(percentage >= 75.0) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		
		System.out.print("Would you like to take the quiz again? y/n : ");
		String Nextquiz = nextquiz.nextLine(); 
		 
		if(Nextquiz.equals ("y")) {
			quiz(); 
		}
		else if (Nextquiz.equals("n")) {
			System.exit(0);
		}
			
		}
	
	 public static void readDifficulty() {
		 System.out.print("Please enter the level of difficulty for the quiz 1 - 4 : ");
		 Scanner diff = new Scanner(System.in);
		  UserDifficulty = diff.nextInt();
		  System.out.println("You have selected difficulty " + UserDifficulty + " begin!!!" );
		 
	 }
	 public static void generateQuestionArgument() {
		 
		 
		 switch (UserDifficulty) {
		 
		 case 1:
	
		for(int i = 1; i < 11; i++) {
			random_num = random.nextInt(10);
			random_num1 = random.nextInt(10);
			total =  random_num * random_num1;
			}
		
		break;
		
		 case 2:
		
		for(int i = 1; i < 11; i++) {
			random_num = random.nextInt(100);
			random_num1 = random.nextInt(100);
			total =  random_num * random_num1;	
					}

			 break;
			 
		 case 3:
				for(int i = 1; i < 11; i++) {
					random_num = random.nextInt(1000);
					random_num1 = random.nextInt(1000);
					total =  random_num * random_num1;	
					}
			 break;
			 
		 case 4:
				for(int i = 1; i < 11; i++) {
					random_num = random.nextInt(10000);
					random_num1 = random.nextInt(10000);
					total =  random_num * random_num1;	
					}
			 break;
			 
		 }
		 
	 }
	
	
	
	public static void main(String[] args) {	
     quiz();
	}


}

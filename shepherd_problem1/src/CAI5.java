import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	static SecureRandom random = new SecureRandom();
	static double random_num; 
	static double  random_num1;
	static String Userinput; 
	static double total ; 
	static double StudAnswer; 
	static double counter1 = 0.00;
	static double percentage = 0.00;
	static int UserDifficulty = 0 ; 
	static int probType = 0;
	static Scanner diff = new Scanner(System.in);
	static String Operator;
	static int rand_Type = 1;
	public static void quiz() {
		counter1 = 0.0;
		readDifficulty();
		readProbType();
		askQuestion();
		displayCompletionMessage();
	

	}
	public static void askQuestion() {
		
		for(int i = 1; i < 11; i++) {	
			generateQuestionArgument();
			System.out.print("Question " + i + " :");
			System.out.print("How much is " + random_num + Operator + random_num1 +" ?");
			readResponse();
		
		}
		}
	
	public static void readResponse() {
	Scanner input = new Scanner(System.in);
		
		 Userinput = input.nextLine();
		 StudAnswer = Double.parseDouble(Userinput);
		 isAnswerCorrect();
	}
	
	public static void isAnswerCorrect() {
	
	if((Math.round( total * 100.0 )/ 100.0) == StudAnswer) {
		
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
		
		  UserDifficulty = diff.nextInt();
		  System.out.println("You have selected difficulty " + UserDifficulty + " begin!!!" );
		 
	 }
	 public static void readProbType() {
		 System.out.println("Please select the type of problem you wish to solve? (1 = Addition, 2 = Subtraction, 3 = Multiplication, 4 = Division, 5 = Random Operator): ");
		 probType = diff.nextInt(); 
		 
	 }
	 public static void generateQuestionArgument() {
		 
		 
		 switch (UserDifficulty) {
		 
		 case 1:
	
		for(int i = 1; i < 11; i++) {
			random_num = random.nextInt(10);
			random_num1 = random.nextInt(10);
			
			switch (probType) {
			case 0: 
				Operator = " plus ";
				total =  random_num + random_num1;
				break;
			case 1: 
				Operator = " plus ";
				total =  random_num + random_num1;
				break;
			case 2:
				Operator = " minus ";
				total =  random_num - random_num1;
				break;
			case 3:
				Operator = " times ";
				total =  random_num * random_num1;
				break;
			case 4:
				Operator = " divided by ";
				total =  random_num / random_num1;
				break;
			case 5:
				rand_Type = random.nextInt(5);
				probType = rand_Type ;
				generateQuestionArgument();
				break;
			
			}
			}
		
		break;
		
		 case 2:
		
		for(int i = 1; i < 11; i++) {
			random_num = random.nextInt(100);
			random_num1 = random.nextInt(100);
			
			switch (probType) {
			case 0: 
				Operator = " plus ";
				total =  random_num + random_num1;
				break;
			case 1: 
				Operator = " plus ";
				total =  random_num + random_num1;
				break;
			case 2:
				Operator = " minus ";
				total =  random_num - random_num1;
				break;
			case 3:
				Operator = " times ";
				total =  random_num * random_num1;
				break;
			case 4:
				Operator = " divided by ";
				total =  random_num / random_num1;
				break;
			case 5:
				rand_Type = random.nextInt(5);
				probType = rand_Type ;
				generateQuestionArgument();
				break;
			
			}
					}

			 break;
			 
		 case 3:
				for(int i = 1; i < 11; i++) {
					random_num = random.nextInt(1000);
					random_num1 = random.nextInt(1000);
					switch (probType) {
					case 0: 
						Operator = " plus ";
						total =  random_num + random_num1;
						break;
					case 1: 
						Operator = " plus ";
						total =  random_num + random_num1;
						break;
					case 2:
						Operator = " minus ";
						total =  random_num - random_num1;
						break;
					case 3:
						Operator = " times ";
						total =  random_num * random_num1;
						break;
					case 4:
						Operator = " divided by ";
						total =  random_num / random_num1;
						break;
					case 5:
						rand_Type = random.nextInt(5);
						probType = rand_Type ;
						generateQuestionArgument();
						break;
					
					}
					}
			 break;
			 
		 case 4:
				for(int i = 1; i < 11; i++) {
					random_num = random.nextInt(10000);
					random_num1 = random.nextInt(10000);
					switch (probType) {
					case 0: 
						Operator = " plus ";
						total =  random_num + random_num1;
						break;
					case 1: 
						Operator = " plus ";
						total =  random_num + random_num1;
						break;
					case 2:
						Operator = " minus ";
						total =  random_num - random_num1;
						break;
					case 3:
						Operator = " times ";
						total =  random_num * random_num1;
						break;
					case 4:
						Operator = " divided by ";
						total =  random_num / random_num1;
						break;
					case 5:
						rand_Type = random.nextInt(5);
						probType = rand_Type ;
						generateQuestionArgument();
						break;
					
					}
					}
			 break;
			 
		 }
		 
	 }
	
	public static void main(String[] args) {	
     quiz();
	}
 

}

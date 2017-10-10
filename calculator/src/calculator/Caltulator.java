package calculator;

import java.util.Scanner;
public class Caltulator {
	public static void main(String[] args){
		
		while (true) 
		{
			Scanner scanner = new Scanner(System.in); 
			System.out.println("Select from the following choices-"); 
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");
			System.out.println("5 for Power");
			System.out.println("6 for Modulo");
			System.out.println("7 for Trignometric Function");
			System.out.println("0 for EXIT\n");
			System.out.println("Enter your choice:");
			int choice = scanner.nextInt(); 

			/*
			 * if (choice==0) System.out.println("EXIT"); System.exit(0);
			 */
			if (choice >= 1 && choice <= 6) {
				System.out.println("Enter the first number:");
				double operand1 = scanner.nextInt(); 
				System.out.println("Enter the second number:");
				double operand2 = scanner.nextInt();
				double output = 0; 

				switch (choice) {    
				case 1:
					output = operand1 + operand2;
					break;

				case 2:
					output = operand1 - operand2;
					break;

				case 3:
					output = operand1 * operand2;
					break;

				case 4:
					output = operand1 / operand2;
					break;

				case 5:
					output = Math.pow(operand1, operand2);
					break;

				case 6:
					output = operand1 % operand2;
					break;

				/*case 0:
					System.out.println("Safe Exit");
					System.exit(0);
					break;*/

				/*
				 * default:
				 * System.out.println("You have entered incorrect operation");
				 */

				}

				System.out.println("Output result=" + output);
			}if(choice==7){
				System.out.println("press 1 For SIN(X)");
				System.out.println("press 2 for COS(X)");
				System.out.println("press 3 for TAN(X)");
				choice=scanner.nextInt();
				if(choice ==1){
					System.out.println("Enter the value of Degree");
					double degree=scanner.nextDouble();
					System.out.println(Math.sin(degree*Math.PI/180));
					
				}
				if(choice==2){
					System.out.println("Enter the value of Degree");
					double degree=scanner.nextDouble();
					System.out.println(Math.cos(degree*Math.PI*180));
				}
				
				if(choice==3){
					System.out.println("Enter the value of Degree");
					double degree=scanner.nextDouble();
					System.out.println(Math.tan(degree*Math.PI/180));
				}
			}
			
			
			else { //else it will check the operator either to exit or show error message
				if (choice == 0) {
					System.out.println("EXIT");
					System.exit(0); //exit the program if entered 0
				} else {
					System.out.println("You have entered wrong choice"); //print wrong choice and continue the program in loop
				}
			}
		}
	}
		
	}
	
	


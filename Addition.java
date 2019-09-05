
import java.util.Scanner;

public class Addition{
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter first integer: ");
	  int number1 = input.nextInt();

	  System.out.print("Enter second integer: ");
	  int number2 = input.nextInt();

	  if(number2 % number1 == 0){
	  System.out.println("number1 is a multiple of number2");

	  }
	  if(number2 % number1 != 0){
	  System.out.println("number1 is  not a multiple of number2");

	  }
	  int subtraction = number1 - number2;

	  System.out.printf("Subtraction is %d%n", subtraction);

}
}
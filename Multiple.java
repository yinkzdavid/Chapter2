import java.util.Scanner;

public class Multiple{
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
	  
	 int num = input.nextInt(); 
	 int a = (num/10000);
	
	  
	 int b = (num/1000)%10;
	 
	 int c = ((num/100)%100)%10;
	  
	 int d = ((((num/10)%1000)%100)%10);
	 
	 int e = ((((num%10000)%1000)%100)%10); 
	  
	
	  System.out.printf("%d   %d   %d   %d   %d", a,    b,    c,    d,    e);

}
}
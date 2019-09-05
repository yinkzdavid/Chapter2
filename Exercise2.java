import java.util.Scanner;
	public class Exercise2{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first value: ");
		int x = input.nextInt();

		
		System.out.print("Enter second value: ");
		int y = input.nextInt();

		int sum = x + y;
		int product = x * y;
		int difference = x - y;
		int quotient = x/y;

		System.out.printf("Sum is: %d%n", sum);
		System.out.printf("Product is:%d%n", product);
		System.out.printf("Difference is:%d%n", difference);
		System.out.printf("Quotient is:%d%n", quotient);

		
	}
}
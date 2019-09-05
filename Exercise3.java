import java.util.Scanner;

	public class Exercise3{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first value:");
		int x = input.nextInt();
		
		System.out.print("Enter second value:");
		int y = input.nextInt();

		System.out.print("Enter third value:");
		int z = input.nextInt();

		int sum = x + y + z;
		int average = (x + y + z)/3;
		int product = x * y * z;

		System.out.printf("The sum is: %d%n" , sum);
		System.out.printf("The Average is: %d%n", average);
		System.out.printf("The product is: %d%n" , product);

		if(x < y && x < z){
		System.out.printf("The smallest number is: %d%n", x);
		}

		if(y < x && y < z){
		System.out.printf("The smallest number is: %d%n", y);
		}

		if(z < x && z < y){
		System.out.printf("The smallest number is: %d%n", z);
		}

		if(x > y && x > z){
		System.out.printf("The greatest number is: %d%n", x);
		}

		
		if(y > x && y > z){
		System.out.printf("The greatest number is: %d%n", y);
		}

		
		if(z > x && z > y){
		System.out.printf("The greatest number is: %d%n", z);
		}
}

}
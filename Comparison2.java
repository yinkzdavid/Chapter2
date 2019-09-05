import java.util.Scanner;

	public class Comparison2{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer:");
		int x = input.nextInt();
		
		System.out.print("Enter second integer:");
		int y = input.nextInt();

		if (x > y ){ 
		System.out.printf("%d is larger", x);

		}

		if (x < y ){ 
		System.out.printf("%d is larger", y);

		}
		if (x == y){
		System.out.print("These numbers are equal");
		}
	
	}

}
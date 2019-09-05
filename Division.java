import java.util.Scanner;

	public class Division{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("The first value:");
		int x = input.nextInt();

		
		System.out.print("The second value:");
		int y = input.nextInt();

		
		System.out.print("The third value:");
		int z = input.nextInt();
		int division = x / y / z;
		
		System.out.printf("The answer is: %d%n", division);
}
}
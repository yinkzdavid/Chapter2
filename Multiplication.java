import java. util. Scanner;

	public class Multiplication{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first value: ");
		int x = input.nextInt();
		
		System.out.print("Enter second value: ");
		int y = input.nextInt();

		System.out.print("Enter third value: ");
		int z = input.nextInt();
		
		int multiplication = x * y * z;

		System.out.printf("The answer is: %d%n", multiplication);

		


}
}
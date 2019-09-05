import java.util.Scanner;

	public class Comparison{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter First number: ");
		int first = input.nextInt();

		System.out.print("Enter Second number: ");
		int second = input.nextInt();

		if(first == second){
		System.out.printf("%d == %d%n", first, second);
		}

		if (first != second){
		System.out.printf("%d !=%d%n", first, second);
		}
		if (first > second){
		System.out.printf ("%d > %d%n", first, second );
		}
		if (first >= second){
		System.out.printf ("%d >= %d%n", first, second );
		}
		if (first <= second){
		System.out.printf ("%d <= %d%n", first, second );
		}

}

}
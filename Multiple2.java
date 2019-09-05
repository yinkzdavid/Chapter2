import java.util.Scanner;
	public class Multiple2{
		public static void main(String... args){
		Scanner yinkz = new Scanner(System.in);

		System.out.print("Enter number:");
		int num = yinkz.nextInt();
		int remainder = num%2;
		if (remainder == 0){
		System.out.printf("%d is even", num);
		}
		if (remainder != 0){
		System.out.printf("%d is odd", num);
		}	
	}
}                                               
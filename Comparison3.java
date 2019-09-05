import java.util.Scanner;
	public class Comparison3{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("First number:");
		int a = input.nextInt();

		
		System.out.println("Second number:");
		int b = input.nextInt();

		
		System.out.println("Third number:");
		int c = input.nextInt();

		
		System.out.println("Fourth number:");
		int d = input.nextInt();

		
		System.out.println("Fifth number:");
		int e = input.nextInt();

		int biggest = 0;

		if(a>b){
			biggest = a;
		}

		if (b>a) {
			biggest = b;
		}

		if (biggest > c) {
			biggest =biggest;
		}

		if (c> biggest){
			biggest= c;
		}

		if (biggest>d) {
			biggest=biggest;
		}
		
		if (d > biggest) {
			biggest = d;
		}

		if (biggest > e) {
			biggest = biggest;
		}
		
		if (e>biggest) {
			biggest = e;
		}

		System.out.printf("The biggest is: %d%n", biggest);
		
		int smallest = 0;

		if (a < b){
			smallest =a;
		}
		if (b < a) {
			smallest = b;
		}
		if (smallest < c){
			smallest = smallest;
		}
		if (c < smallest){
			smallest = c;
		}
		if (smallest < d){
			smallest = smallest;	
		}
		if (d < smallest){
			smallest = d;
		}
		if (smallest < e){
			smallest = smallest;
		}
		if (e < smallest){
			e = smallest;
		}

		System.out.printf("The smallest is: %d%n", smallest);
		
}
}
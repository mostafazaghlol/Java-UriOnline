 import java.util.Scanner;  // needed for Scanner


public class Input {

	public static void main(String[] args)/* throwsjava.io.IOException*/{
Scanner scanner = new Scanner( System.in );
String A = scanner.nextLine();
String B = scanner.nextLine();
int number = Integer.parseInt( A );
int number2 = Integer.parseInt( B );
System.out.print("X = ");
System.out.println( number+ number2);

		
	}

}

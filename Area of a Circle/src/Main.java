import java.text.*;
import java.util.Scanner;
public class Main {

	private static Scanner scanner;
	private static DecimalFormat df;

	public static void main(String[] args) {
scanner = new Scanner(System.in);
String r=scanner.nextLine();
double R=Double.parseDouble(r);
df = new DecimalFormat("#.#####");
DecimalFormat df2=new DecimalFormat("0.0000");

double result=(3.141590001*Math.pow(R, 2));
System.out.println("A="+df2.format(result));
	}

}

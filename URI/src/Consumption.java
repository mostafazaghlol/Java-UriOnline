import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
		int distance=in.nextInt();
		double fuel=in.nextDouble();
		double result=distance/fuel;
	    DecimalFormat myFormatter = new DecimalFormat(".000");
	    System.out.println(myFormatter.format(result)+" km/l");

	}

}

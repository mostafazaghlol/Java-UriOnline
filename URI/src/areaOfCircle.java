import java.text.DecimalFormat;
import java.util.Scanner;
public class areaOfCircle {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
	    DecimalFormat myFormatter = new DecimalFormat(".0000");
		
	    double R=in.nextDouble();
		final double pi=3.14159;
		double area =pi * R* R;
		System.out.println("A="+myFormatter.format(area));
	
	}

}

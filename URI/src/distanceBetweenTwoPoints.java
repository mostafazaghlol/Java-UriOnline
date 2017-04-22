import java.text.DecimalFormat;
import java.util.Scanner;

public class distanceBetweenTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
DecimalFormat Myformate=new DecimalFormat(".0000");
double x1=in.nextDouble();
double y1=in.nextDouble();
double x2=in.nextDouble();
double y2=in.nextDouble();
double term1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
System.out.println(Myformate.format(term1));



	}

}

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
DecimalFormat name = new DecimalFormat("0.000");
int x=s.nextInt();
float y=s.nextFloat();
float result=x/y;
System.out.println(name.format(result)+" km/l");
	}

}

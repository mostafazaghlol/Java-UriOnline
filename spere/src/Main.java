import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int R=Integer.parseInt(s1);
double VOLUME =0;
VOLUME=(Math.pow(R, 3)*3.14159*(4/3.0));
DecimalFormat d=new DecimalFormat("0.000");
System.out.println("VOLUME = "+d.format(VOLUME));

	}

}

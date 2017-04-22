import java.text.*;
import java.util.Scanner;
public class Main {

//	private static  sammary;

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
DecimalFormat df=new DecimalFormat("0.00");
String name=s.nextLine();
String s1=s.nextLine();
String s2=s.nextLine();
double salary=Double.parseDouble(s1);
double  sold =Double.parseDouble(s2);
double sammary = (double)(15*sold/100);
double full=salary+sammary;
System.out.println("TOTAL = R$ "+df.format(full));
	}

}

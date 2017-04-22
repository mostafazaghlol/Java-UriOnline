import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String NUM1=s.nextLine();
String NUM2=s.nextLine();
String NUM3=s.nextLine();

float num1=Float.parseFloat(NUM1);
float num2=Float.parseFloat(NUM2);
float num3=Float.parseFloat(NUM3);
DecimalFormat df=new DecimalFormat("0.0");
float result=(float) (((num1*2)+(num2*3)+(num3*5))/10);
System.out.println("MEDIA = "+df.format(result));

	}

}
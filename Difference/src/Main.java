import java.util.*;
public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String num1=s.nextLine();
String num2=s.nextLine();
String num3=s.nextLine();
String num4=s.nextLine();
int n1=Integer.parseInt(num1);
int n2=Integer.parseInt(num2);
int n3=Integer.parseInt(num3);
int n4=Integer.parseInt(num4);
int DIFERENCA=(n1*n2)-(n3*n4);
System.out.println("DIFERENCA = "+DIFERENCA);
	}

}

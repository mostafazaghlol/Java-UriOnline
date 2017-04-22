import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner( System.in);
		int cod1,cod2,num1,num2;
		float price1,price2;
		String s1=scanner.next();
		String s2=scanner.next();
		String s3=scanner.nextLine();
		String s4=scanner.next();
		String s5=scanner.next();
		String s6=scanner.nextLine();
		cod1=Integer.parseInt(s1);
		num1=Integer.parseInt(s2);
		price1=Float.parseFloat(s3);
		cod2=Integer.parseInt(s4);
		num2=Integer.parseInt(s5);
		price2=Float.parseFloat(s6);
		DecimalFormat df=new DecimalFormat("0.00");
		float result=0;
		result=(num1*price1)+(num2*price2);
		System.out.println("VALOR A PAGAR: R$ "+df.format(result));

	}

}

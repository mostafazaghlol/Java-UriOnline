import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
double num=s1.nextDouble();
double num2=s1.nextDouble();
double num3=s1.nextDouble();
double TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
TRIANGULO=0.5*num*num3;
CIRCULO= 3.14159*Math.pow(num3, 2);
TRAPEZIO=0.5*(num+num2)*num3;
QUADRADO=Math.pow(num2, 2);
RETANGULO=num*num2;
DecimalFormat d=new DecimalFormat("0.000");

System.out.println("TRIANGULO: "+d.format(TRIANGULO));		
System.out.println("CIRCULO: "+d.format(CIRCULO));		
System.out.println("TRAPEZIO: "+d.format(TRAPEZIO));		
System.out.println("QUADRADO: "+d.format(QUADRADO));		
System.out.println("RETANGULO: "+d.format(RETANGULO));		
		
		
		
		
	}

}

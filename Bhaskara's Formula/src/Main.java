import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner n=new Scanner(System.in);
DecimalFormat d=new DecimalFormat("0.00000");
float a,b,c;
a=n.nextFloat();
b=n.nextFloat();
c=n.nextFloat();
if(a==0||a>b || c>a ||b==0||c==0){  
	System.out.println("Impossivel calcular");
	
}else{
	float x1=(float) (-b+Math.pow((Math.pow(b,2)-4*a*c), 0.5))/(2*a);
	float x2=(float) (-b-Math.pow((Math.pow(b,2)-4*a*c), 0.5))/(2*a);
	System.out.println("R1 ="+d.format(x1));
	System.out.println("R2 ="+d.format(x2));
	
}

	}

}

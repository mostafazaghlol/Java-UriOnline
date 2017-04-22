
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	int x1=s1.nextInt();
	System.out.println(x1);
	int s2=x1/100;
	int S3=s2*100;
	int s3=(x1-S3)/50;
	int S4=s3*50;
	int s4=(x1-(S3+S4))/20;
	int S5=s4*20;
	int s5=(x1-(S3+S4+S5))/10;
	int S6=s5*10;
	int s6=(x1-(S6+S3+S4+S5))/5;
	int S7=s6*5;
	int s7=(x1-(S7+S6+S3+S4+S5))/2;
	
	int S9=s7*2;
	
	int s9=(x1-(S7+S6+S3+S4+S5+S9))/1;
	

	System.out.println(s2+" nota(s) de R$ 100,00");
	System.out.println(s3+" nota(s) de R$ 50,00");
	System.out.println(s4+" nota(s) de R$ 20,00");
	System.out.println(s5+" nota(s) de R$ 10,00");
	System.out.println(s6+" nota(s) de R$ 5,00");
	System.out.println(s7+" nota(s) de R$ 2,00");
	System.out.println(s9+" nota(s) de R$ 1,00");

	}

}

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner n=new Scanner(System.in);
double x=n.nextDouble();
int s100=(int) (x/100);
int s50=(int) ((x-(s100*100))/50);
int s20=(int)(x-((s100*100)+(s50*50)))/20;
int s10=(int) ((x-((s100*100)+(s50*50)+(s20*20)))/10);
int s5=(int) ((x-((s100*100)+(s50*50)+(s20*20)+(s10*10)))/5);
int s2=(int) ((x-((s100*100)+(s50*50)+(s20*20)+(s10*10)+(s5*5)))/2);
int s1=(int) ((x-((s100*100)+(s50*50)+(s20*20)+(s10*10)+(s5*5)+(s2*2)))/1);
DecimalFormat df=new DecimalFormat("0.00");
	String x2=df.format((x-((s100*100)+(s50*50)+(s20*20)+(s10*10)+(s5*5)+(s2*2)+(s1*1))));
	double x3=Double.parseDouble(x2);
	double x4=x3*100;
	int S50=(int) (x4/50);
	int S25=(int) (x4-(S50*50))/25;
	int S10=(int) (x4-(S50*50)-(S25*25))/10;
	int S5=(int) (x4-(S50*50)-(S25*25)-(S10*10))/5;
	int S1=(int) (x4-(S50*50)-(S25*25)-(S10*10)-(S5*5))/1;
	System.out.println("NOTAS:");
System.out.println(s100+" nota(s) de R$ 100.00");
System.out.println(s50+" nota(s) de R$ 50.00");
System.out.println(s20+" nota(s) de R$ 20.00");
System.out.println(s10+" nota(s) de R$ 10.00");
System.out.println(s5+" nota(s) de R$ 5.00");
System.out.println(s2+" nota(s) de R$ 2.00");
System.out.println("MOEDAS:");
System.out.println(s1+" moeda(s) de R$ 1.00");
	System.out.println(S50+" moeda(s) de R$ 0.50");
	System.out.println(S25+" moeda(s) de R$ 0.25");
	System.out.println(S10+" moeda(s) de R$ 0.10");
	System.out.println(S5+" moeda(s) de R$ 0.05");
	System.out.println(S1+" moeda(s) de R$ 0.01");
	
	
	

	}

}

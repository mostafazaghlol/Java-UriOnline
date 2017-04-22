import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelSpent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
int time=in.nextInt();
int speed=in.nextInt();
final int fule=12;
DecimalFormat MYformater=new DecimalFormat(".000");
System.out.println(MYformater.format((double)(time*speed)/fule));
	}

}

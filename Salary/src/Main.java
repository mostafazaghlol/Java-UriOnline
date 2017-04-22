import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		String s1=s.nextLine();
		String s2=s.nextLine();
		String s3=s.nextLine();
		int NUMBER=Integer.parseInt(s1);
		int SALARY=Integer.parseInt(s2);
		float perHour=Float.parseFloat(s3);
		
		System.out.println("NUMBER = "+NUMBER);
		System.out.println("SALARY = U$ "+df.format(SALARY*perHour));
	}

}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner n=new Scanner(System.in);
int x=n.nextInt();
//int hour=x/3600;
//int min=(x-(hour*3600))/60;
//int sec=x-((hour*3600)+(min*60));
//System.out.println(hour+":"+min+":"+sec);
int years=x/365;
int month=(x-years*365)/30;
int days=x-((years*365)+(month*30));
System.out.println(years+" ano(s)\n"+month+" mes(es)\n"+days+" dia(s)");

	}

}

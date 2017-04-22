import java.util.Scanner;
public class AgeInDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in =new Scanner(System.in);
int days=in.nextInt();
int years=days/356;
int remain=days-(years*365);
int months=remain/30;
	remain=remain-(months*30);
	printMessage(years,months,remain);
	}
	static void printMessage(int year,int mounth,int days){
		System.out.println(year+" ano(s)");
		System.out.println(mounth+" mes(es)");
		System.out.println(days+" dia(s)");
		
	}

}

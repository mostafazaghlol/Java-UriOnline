import java.util.Scanner;
public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int SecInNum=in.nextInt();
int hour=SecInNum/(60*60);
int remain=SecInNum-(hour*(3600));
int min=remain/60;
	remain=remain-(min*60);
	printmassege(hour,min,remain);
	}

	static void printmassege(int hour,int mins,int sec){
		System.out.print(hour);
		System.out.print(":");
		System.out.print(mins);
		System.out.print(":");
		System.out.println(sec);

		
	}
}

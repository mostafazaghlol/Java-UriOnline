import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		int x,y;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		if(y%x==0){
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
	}

}

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n,m,a;
n=in.nextInt();
m=in.nextInt();
a=in.nextInt();

int Square =((n + a - 1) / a) * ((m + a - 1) / a);
System.out.println(Square);
	}

}

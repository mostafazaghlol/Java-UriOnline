import java.util.Scanner;

public class TheGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int A=in.nextInt();
int B=in.nextInt();
int c=in.nextInt();
int max1=Math.max(A, c);
int max2=Math.max(max1, B);
System.out.println(max2+" eh o maior");
	}

}

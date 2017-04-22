import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int num1=s1.nextInt();
		int num2=s1.nextInt();
		int num3=s1.nextInt();
int greats=0;
if(num1>num2){
	greats=num1;
	
}else{greats=num2;}
if (greats>num3){
	System.out.println(greats+" eh o maior");
}else{
	System.out.println(num3+" eh o maior");
	
}
	}

}

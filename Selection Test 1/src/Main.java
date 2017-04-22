import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner n=new Scanner(System.in);
int a,b,c,d;
a=n.nextInt();
b=n.nextInt();
c=n.nextInt();
d=n.nextInt();
if(b>c&&d>a&&((c+d)>(a+b))&&c>0&&d>0&&a%2==0){
	
	System.out.println("Valores aceitos");
	
}else{
	
	System.out.println("Valores nao aceitos");
}

	}

}

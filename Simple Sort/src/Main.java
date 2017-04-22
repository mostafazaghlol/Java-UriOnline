import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int x1=s.nextInt();
int x2=s.nextInt();
int x3=s.nextInt();
int s1=0,m=0,h=0;
if(x1<x2&&x3>x2){
	s1=x1;
	m=x2;
	h=x3;
}if(x2<x1&x3>x1){
	s1=x2;
	m=x1;
	h=x3;
}if(x1<x3&&x2>x3){
	s1=x1;
	m=x3;
	h=x2;
}if(x3<x1&&x2>x1){
	s1=x3;
	m=x1;
	h=x2;
}if(x2<x3&&x1>x3){
	s1=x2;
	m=x3;
	h=x1;
}if(x3<x2&&x1>x2){
	s1=x3;
	m=x2;
	h=x1;
}
System.out.println(s1);
System.out.println(m);
System.out.println(h);
System.out.println();
System.out.println(x1);
System.out.println(x2);
System.out.println(x3);


	
	
	
	}

}

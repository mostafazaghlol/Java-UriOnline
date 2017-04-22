import java.util.Scanner;

public class Banknotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int number=in.nextInt();
int hundrd=number/100;
int remain=number-(100*hundrd);
int fifty=remain/50;
remain=remain-(50*fifty);
int twity=remain/20;
remain=remain-(20*twity);
int tenth=remain/10;
remain=remain-(10*tenth);
int five=remain/5;
remain=remain-(5*five);
int two=remain/2;
remain=remain-(2*two);
int one=remain/1;
System.out.print(hundrd);
System.out.println(" nota(s) de R$ 100,00");
System.out.print(fifty);
System.out.println(" nota(s) de R$ 50,00");
System.out.print(twity);
System.out.println(" nota(s) de R$ 20,00");
System.out.print(tenth);
System.out.println(" nota(s) de R$ 10,00");
System.out.print(five);
System.out.println(" nota(s) de R$ 5,00");
System.out.print(two);
System.out.println(" nota(s) de R$ 2,00");
System.out.print(one);
System.out.println(" nota(s) de R$ 1,00");


	}
	public static void printmessage(int number,String letter){
		System.out.print(number);
		System.out.print(" nota(s) de R$ ");
		System.out.println(letter);
	}

	
}

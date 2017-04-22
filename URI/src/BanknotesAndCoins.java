import java.util.Scanner;

public class BanknotesAndCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double Money = in.nextDouble();
		int num = (int) (Money * 100);
		int hundred = num / 10000;
		int remain = num - (hundred * 10000);
		int Fiftieth = remain / 5000;
		remain = remain - (Fiftieth * 5000);
		int Twenty = remain / 2000;
		remain = remain - (Twenty * 2000);
		int ten = remain / 1000;
		remain = remain - (ten * 1000);
		int five = remain / 500;
		remain = remain - (five * 500);
		int two = remain / 200;
		remain = remain - (two * 200);
		int one = remain / 100;
		remain = remain - (one * 100);
		int fiveOfTen = remain / 50;
		remain = remain - (fiveOfTen * 50);
		int twoOfTen = remain / 25;
		remain = remain - (twoOfTen * 25);
		int oneOfTen = remain / 10;
		remain = remain - (oneOfTen * 10);
		int fiveOfHundred = remain / 5;
		remain = remain - (fiveOfHundred * 5);
		int oneOfHundred=remain/1;
		printMessage(hundred,Fiftieth,Twenty,ten,five,two,one,fiveOfTen,twoOfTen,oneOfTen,fiveOfHundred,oneOfHundred);
	}
	
	static void printMessage(int hundred,int Fiftieth,int Twenty,int ten,int five,int  two,int  one,int fiveOfTen,int twoOfTen,int oneOfTen,int fiveOfHundred,int remain){
		System.out.println("NOTAS:");
		System.out.println(hundred+" nota(s) de R$ 100.00");
		System.out.println(Fiftieth+" nota(s) de R$ 50.00");
		System.out.println(Twenty+" nota(s) de R$ 20.00");
		System.out.println(ten+" nota(s) de R$ 10.00");
		System.out.println(five+" nota(s) de R$ 5.00");
		System.out.println(two+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(one+" nota(s) de R$ 1.00");
		System.out.println(fiveOfTen+" nota(s) de R$ 0.50");
		System.out.println(twoOfTen+" nota(s) de R$ 0.25");
		System.out.println(oneOfTen+" nota(s) de R$ 0.10");
		System.out.println(fiveOfHundred+" nota(s) de R$ 0.05");
		System.out.println(remain+" nota(s) de R$ 0.01");
	}

}

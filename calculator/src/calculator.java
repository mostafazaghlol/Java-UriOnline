import java.util.Scanner;


public class calculator {

	public static void main(String[] args) {

		Scanner scanner=new Scanner( System.in);
		String num1=scanner.nextLine();
		String num2=scanner.nextLine();
		int NUM1=Integer.parseInt(num1);
		int NUM2=Integer.parseInt(num2);
		int result=Math.add( NUM1, NUM2);
		int result2=Math.sub(NUM1,NUM2);
		int result3=Math.div(NUM1,NUM2);
		int result4=Math.mul(NUM1,NUM2);
		
		System.out.println("addintion"+result+"submattion"+result2+"div "+result3+"\n mul"+result4);
		
		
	}

//	private static int mul(int nUM1, int nUM2) {
//		// TODO Auto-generated method stub
//		return nUM1*nUM2;
//	}
//
//	private static int div(int nUM1, int nUM2) {
//		// TODO Auto-generated method stub
//		return nUM1/nUM2;
//	
//
//	private static int sub(int nUM1, int nUM2) {
//		return nUM1-nUM2;
//	}
//
//	private static int add(int nUM1, int nUM2) {
//		return nUM1+nUM2;
//	}

}

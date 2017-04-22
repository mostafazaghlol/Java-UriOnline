import java.util.Scanner;
		
		
		public class Main {
		
			public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double A,B,C;
		A=in.nextDouble();
		B=in.nextDouble();
		C=in.nextDouble();
		double h=Math.max(A, Math.max(C, B));
		double m = 0,s = 0;
		if(h==A){
			m=B; s=C;
		}
		if(h==B){
			m=A;s=C;
		}
		if(h==C){
			m=A;s=B;
		}
		System.out.println(h+"     "+m+"  "+s);
		if(h>=(m+s)){
			System.out.println("NAO FORMA TRIANGULO");
		}if(Math.pow(h, 2)==(Math.pow(m, 2)+Math.pow(s,2))){
			System.out.println("TRIANGULO RETANGULO");
		} if(Math.pow(h, 2)>(Math.pow(m, 2)+Math.pow(s,2))){
			System.out.println("TRIANGULO OBTUSANGULO");
		} if(Math.pow(h, 2)<(Math.pow(m, 2)+Math.pow(s,2))){
			System.out.println("TRIANGULO ACUTANGULO");
		} if(h==m&&m==s){
			System.out.println("TRIANGULO EQUILATERO");
		} if(m==s&&h!=m){
			System.out.println("TRIANGULO ISOSCELES");
		}if((m==h&&s!=m))
				{System.out.println("TRIANGULO ISOSCELES");
				} if((h==s&&s!=m))
				{System.out.println("TRIANGULO ISOSCELES");
				}
			}
		
			}

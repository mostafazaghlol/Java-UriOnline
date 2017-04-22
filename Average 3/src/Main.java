import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	DecimalFormat df=new DecimalFormat("0.0");
		float n1,n2,n3,n4;
		n1=in.nextFloat();
		n2=in.nextFloat();
		n3=in.nextFloat();
		n4=in.nextFloat();
		float subMedia=(n1*2)+(n2*3)+(n3*4)+(n4*1);
	    float Media=subMedia/10;
	    System.out.println("Media: "+df.format(Media));
	    
	    
	    if(Media>=7){
	    	System.out.println("Aluno aprovado.");
	    }else if (Media<5) {
			System.out.println("Aluno reprovado.");
		}
	    else if (Media>=5&&Media<7) 
	    {		
			System.out.println("Aluno em exame.");
			 n4=in.nextFloat();
			System.out.println("Nota do exame: "+n4);
			if(((Media+n4)/2)>=5){
			System.out.println("Aluno aprovado.");
			System.out.println("Media final: "+(df.format((Media+n4)/2)));
			}
			else
			{
			
				System.out.println("Aluno reprovado.");
				System.out.println("Media final: "+(df.format((Media+n4)/2)));
			}
			
			}
	
	
	}
		

}

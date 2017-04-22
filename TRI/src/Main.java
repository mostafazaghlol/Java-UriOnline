import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		float A=s.nextFloat();
		float B=s.nextFloat();
		float C=s.nextFloat();
		DecimalFormat df=new DecimalFormat("0.0");
		if(((A+B)>C )&&((B+C)>A) && ((C+A)>B))
	    {
			float Perimetro =A+B+C;
			System.out.println("Perimetro = "+df.format(Perimetro));
	    }else{
	    	float area=(float) ((0.5*(A+B))*C);
			System.out.println("Area = "+df.format(area));

	    }
	}
}

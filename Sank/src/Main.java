import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static float result=0;
	public static void main(String[] args) {

		Scanner n=new Scanner(System.in);
	int x,y;
	x=n.nextInt();
	y=n.nextInt();
	if(x==1){
		result= (float) (y*4.00);
		
	}
	else if(x==2){
		result=(float) (y*4.50);
	}else if(x==3){
		result=(float) (y*5.00);
	}else if(x==4){
		result=(float) (y*2.00);
	}else if(x==5){
		result=(float) (y*1.50);
	}
	DecimalFormat d=new DecimalFormat("0.00");
	System.out.println("Total: R$ "+d.format(result));
	}

}

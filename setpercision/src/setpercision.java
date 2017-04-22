import java.text.*;
public class setpercision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double d = 1.234567;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(d));

	}

}

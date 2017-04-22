import java.util.ArrayList;

import s1.kalamta;
import s1.lugrin;
import s1.olives;

public class Main {

	public static void main(String[] args) {

		ArrayList<olives> olive2 = new ArrayList<olives>();
		olives olivee;
		olivee = new kalamta();
		System.out.println(olivee.name);
		olive2.add(olivee);
		olivee = new lugrin();
		System.out.println(olivee.name);
		olive2.add(olivee);
		olivee = new kalamta();
		System.out.println(olivee.name);
		olive2.add(olivee);
		olivee.crush();

	}

}

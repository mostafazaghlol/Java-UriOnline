package arraya;

public class arrayw {

	public static void main(String[] args) {
 String[][] states =new String[3][2];
 states[0][0]="mostafa";
 states[0][1]="zaghloul";
 states[1][0]="aya";
 states[1][1]="zaghloul";
 states[2][0]="esraa";
 states[2][1]="zaghloul";
 for(int i = 0; i < states.length; i++) {
	 StringBuilder sb=new StringBuilder();
	 for (int j = 0; j < states[i].length; j++) {
		if(j==0){sb.append("this");
		}
		
		 sb.append(states[i][j]);
		
	}
	System.out.println(sb);
}
	}

}

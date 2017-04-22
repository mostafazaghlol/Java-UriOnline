import sun.text.resources.en.FormatData_en_GB;


public class loops {
     static private String[] months=
    	 {
    	 "jan","feb","mar"
    	 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	// for(int i=0;i<months.length;i++)
    	 //{
    		// System.out.println(months[i]);
    //	 }
//		for(String monnth:months){
//		System.out.println(monnth);
//			
//		}
//		int i=0;
//		while(i<months.length)
//		{
//			System.out.println(months[i]);
//			i++;
//			
//		}
		int i=0;
		do{
			System.out.println(months[i]);
			i++;
			
			
			
		}while(i<months.length);
		
	}

}

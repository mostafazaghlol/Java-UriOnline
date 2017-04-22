package s1;

public class olives {
	public static final long BLACK=0x000000;
	public static final long green=0x00FF00;
	



	public String name="kalmat";
	public String flavor="gresso";
	public long color=olives.BLACK;
	public int oil=3;
	
	
	public int getOil() {
		return oil;
	}



	public olives(int oil) {
		this.oil = oil;
	}



	public void setOil(int oil) {
		this.oil = oil;
	}
	public olives(){
		
		System.out.println("I am the constructor");
	}
	
	
	
 public void crush(){
	 
	 System.out.println("ouch!!!");
 }
}

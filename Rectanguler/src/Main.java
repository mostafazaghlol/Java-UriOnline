import javafx.scene.shape.Line;

import com.sun.javafx.geom.Rectangle;


public class Main {

	public static void main(String[] args) {

		Rectangle front=new Rectangle(20,30,100,40);
		Line left=new Line(20,30,50,10);
		Line right =new Line(50,10,150,10);
		Line middel=new Line(120,30,150,10);
		Line bottom=new Line(150,10,150,50);
		front.draw();
		left.draw();
		middel.draw();
		bottom.draw();
		right.draw();
		
	
	}

}

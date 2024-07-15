package dat7;

public class shape_demo {

	public static void main(String[] args) {
		shape[] shapes=new shape[3];
		shapes[0]=new circle(5.0);
		shapes[0]=new triangle(4.0,3.0);
		shapes[0]=new square(6.0);
		for(shape shape:shapes)
		{
			shape.draw();
			shape.erase();
			System.out.println("-------------");
		}

	}

}

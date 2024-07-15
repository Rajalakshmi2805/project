package dat7;

public class square extends shape {
	private double side;
    public square(double side)
    {
    	this.side=side;
    }
    @Override
    public void draw() {
		System.out.println("Drawing a square with side " + side);
	}
    @Override
	public void erase() {
		System.out.println("Erasing a square with side " + side);
	}
}

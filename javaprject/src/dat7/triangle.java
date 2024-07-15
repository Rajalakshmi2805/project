package dat7;

public class triangle extends shape {
	private double base;
	private double height;
	public triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	@Override
	public void draw()
	{
		System.out.println("Drawing a triangle with base"+base+" height="+height);
		
	}
	@Override
	public void erase()
	{
		System.out.println("Erasing a triangle with base"+base+"height"+height);
	}

}

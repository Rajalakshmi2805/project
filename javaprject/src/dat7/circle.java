package dat7;

 class circle extends shape {
	private double radius;
	public circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	public void draw()
	{
		System.out.println("Drawing a circle with radius"+radius);
	}
	@Override
	public void erase()
	{
		System.out.println("Erasing the circle with rsdius"+radius);
	}

}

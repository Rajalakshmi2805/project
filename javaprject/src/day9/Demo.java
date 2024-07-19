package day9;

public class Demo {
	public Demo() {
		System.out.println("In Constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("In Finalize");
	}

}

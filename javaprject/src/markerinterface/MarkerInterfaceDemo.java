package markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Student s=new Student(101,"Rajalakshmi",1200,"c");
		if(s instanceof Registrable)
			System.out.println("Student is registered for the course ");
		else
			System.out.println("Student is not registered for the course ");
	}

}

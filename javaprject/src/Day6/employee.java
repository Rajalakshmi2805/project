package Day6;

public class employee {
	private String name;
	private int id;
	static String companyName = "TNS";
	employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", "
				+ "Company= "+companyName+"]";
	}


}

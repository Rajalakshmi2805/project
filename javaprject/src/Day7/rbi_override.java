package Day7;

public class rbi_override {

	public static void main(String[] args) {
		rbi rbi;


		rbi = new sbi();
		System.out.println(rbi.getRateOfInterest());

		rbi = new icici();
		System.out.println(rbi.getRateOfInterest());

		rbi = new hdfc();
		System.out.println(rbi.getRateOfInterest());
	}

}

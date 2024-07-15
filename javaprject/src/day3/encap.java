package day3;

public class encap {

	public void encap(constructors persondemo)
	{
		if(persondemo.getAge()>65||persondemo.getGender().equalsIgnoreCase("female"))
		{
			persondemo.setTax(0);
			System.out.println("Tax not applicable");
		}
		else
		{
			if(persondemo.getIncome()<=16000)
			{
				persondemo.setTax(0);
			}
			 else if (persondemo.getIncome() > 160000 && persondemo.getIncome() <= 500000)
			 {
				 persondemo.setTax((persondemo.getIncome() - 160000) * 10 / 100);
				 } else if (persondemo.getIncome() >= 500000 && persondemo.getIncome() <= 800000) 
				 {
					 persondemo.setTax((persondemo.getIncome() - 500000) * 20 / 100 + 34000);
				 } else {
				 persondemo.setTax((persondemo.getIncome() - 800000) * 30 / 100 + 94000);
				 }
				 }
				 }
				 }
				 
		
	


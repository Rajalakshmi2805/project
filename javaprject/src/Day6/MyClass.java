package Day6;

public class MyClass {
   private int section;
   private static int srno;
   static
   {
	   
	   System.out.println("--------------Within Static Blok----------------");
	   srno=1000;
   }
   MyClass()
   {
	   System.out.println("----------Within Default Constructor------------");
	   srno++;
	   section++;
   }
   @Override
   public String toString()
   {
	   return "MyClass[SERIAL NUMBER"+srno+",SECTION="+section+"]";
   }
   static void display()
   {
	   System.out.println("SERIAL NUMBER"+srno);
   }

}

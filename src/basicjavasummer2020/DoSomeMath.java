package basicjavasummer2020;

public class DoSomeMath {
	
	int apple=2345;
	byte price=126;
	String best="Sahrif";
	
	public static void student() {
		
	}
public static int x=24;//String name=("junaid khalid");    //Global variable  and static keyword use in main method
	
	public static  String name="junaid khalid";    //Global variable  and static keyword use in main method
	
	public void game() {
			System.out.println("killing terrorist is a good game"); // Local variable and non static method use in main method with object  
	}
		
		protected void games() {
			System.out.println("killing terrorist"); // Local variable and non static method use in main method with object  
	}
	

		private static String contactInfo= " 3472869394" ;         //Access modifier and global variable
		
		//System.out.println(DoSomeMath.deci);
		
	public static void main(String[]args) {
		
		
		DoSomeMath call=new DoSomeMath();
		
		System.out.println(call.apple);
		
		call.apple=50000;

		System.out.println(call.apple);
		
		//System.out.println(call.best);
		
		call.best="Akbar";
		
		//System.out.println(call.best);
		
		call.best="Mohammed Ali";
		
		System.out.println(call.best);
		
		call.games();
		System.out.println(DoSomeMath.contactInfo);
		
		
		
		
	int number1=40;
	int number2=20;
	int add= number1 + number2;
	int subtraction= number1 - number2;
	int multiply= number1 * number2;
	int division = number1 / number2;
	//  con-cat-e-nation
	                    // String+variable
	System.out.println("Total value is = " + add);
	System.out.println("Subtract value is = " + subtraction);
	System.out.println("Division value is = " + division);
	System.out.println (multiply);
	
	System.out.println(DoSomeMath.name+" is my name");
	
	System.out.println(DoSomeMath.x);
	
	   DoSomeMath obj=new DoSomeMath();
	   obj.game();
	   
	   
   DoSomeMath oj=new DoSomeMath();
	   oj.games();
	   
	 
	   
	   //System.out.println(DoSomeMath.deci);
	}
	
	
	
}

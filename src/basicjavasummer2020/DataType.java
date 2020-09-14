package basicjavasummer2020;

public class DataType {
	public static void main(String[] args) {
		DoSomeMath issue= new DoSomeMath();
		System.out.println(issue.name);
		issue.name="kito";
		
		System.out.println(issue.name);
		
		DoSomeMath.student();
		System.out.println(issue.best);
		
		System.out.println(DoSomeMath.x);
		
		System.out.println(DoSomeMath.x);
		
	    int myNum = 5;               // integer (whole number)
	    float myFloatNum = 5.99f;    // floating point number
	    char myLetter = 'D';         // character
	    boolean myBool = true;       // boolean
	    String myText = "Hello";     // String    
	    System.out.println(myNum);
	    System.out.println(myFloatNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
	    
	    
	    
	    System.out.println(DataType.price+" We are learning java");
	    
	    DataType obj=new DataType();
	    obj.hotel();
		
	    System.out.println(DataType.age+" The range of our age is");
	    
	    
	    DataType ram=new DataType();
	    ram.method();
	    

		DoSomeMath call=new DoSomeMath();
		
		System.out.println(call.apple);
		
		call.apple=50000;
	    
	    
	  }
	
	
	
	
	
	public static double price=450.59;///  global variable
	
	protected void hotel(){
	System.out.println("price of hotel at NY expensive");
	}
       
	private static int age=45;
	
	private void method() {
		
		System.out.println("we love java");
	}
	
	

}

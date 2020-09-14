package basicjavasummer2020;

public class ReviewJava {
	int a=345;
	int b;
	String name="ali";
	boolean isGood=false;
	//System.out.println(call.isGood);
	
	public void java() {
		System.out.println("Apple is good for health");
		
	}
	public void game() {
		System.out.println("USA is the great country who has money");  //NON RETURN TYPE METHOD
	}
	
	
	public void cricket() {
		int a=10;
		int b=25;
		int total=a+b;
		
		System.out.println("Total run of Bangladesh team is :"+total);
		
		
		
		
	}
	
	
	
	
	
	
		
	public static void main (String[]args) {
		
		ReviewJava call=new ReviewJava();
		
		
		call.a=550;
		System.out.println("*****"+call.a);
		 
		
		call.java();
		
		call.game();
		call.cricket();
		
	//	call.name="Junaid";
	
		System.out.println(" The learning student name is :"+call.name);	
	System.out.println(call.b);
	int bi=9000;
	//call.b=6790;
	call.a=900000;
	//call.b=100000000;
call.b=5000000;
	
	
	System.out.println(call.b);
	
//	System.out.println(call.bi);
	
	System.out.println(call.isGood);
	
	//System.out.println(call.java);
	

	System.out.println(call.isGood);
	
	call.isGood=true;	
	
	System.out.println(call.isGood);
		
		
		
		
		
		
	}
	
	
	
	
	
	

}

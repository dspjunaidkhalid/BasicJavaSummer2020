package advance;

public class TestObject {
	
	
	
	
	int ram =126;
	float rom=23.45f;
	short com= 345;
	long del=234578l;
	
	static String lan = "we learn java";
     static char hard='h';
     
     
     public static void main (String[]args) {
    	 
    	 
    	 System.out.println(TestObject.lan);
    	 System.out.println(TestObject.hard);
    	 
    	 TestObject computer = new TestObject();
    	 
    	 System.out.println(computer.del);
    	 System.out.println(computer.com);
    	 System.out.println(computer.rom);
    	 System.out.println(computer.ram);
    	 
    	 
    	 
    	 
    	 
     }
}

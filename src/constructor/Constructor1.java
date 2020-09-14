package constructor;

public class Constructor1 {
	// Constructor Name will be same as Class Name.
		// Constructor Has no Return Type
		// Constructors are used to initialize the object.
		// Before creating Parameterize constructor we must have to create Default
		// constructor

		
		// Default/ non Parameterized Constructor
		// Parameterized Constructor

		// AccessModifier className(){ }
	
	
	
	int afc;
	float ufc;
	String apple;
	public Constructor1() {
		// Default/ non Parameterized Constructor
		
		
		}
	public Constructor1(int kfc) {
		//single Parameterized Constructor
		
		//System.out.println("we learn constructor");
		
		this.afc=kfc;
		System.out.println("my salary is = "+this.afc);
		
	}
	public Constructor1(int kfc, float tfc) {
		//multi Parameterized Constructor
		
		//System.out.println("we learn constructor");
		
		this.afc=kfc;
		this.ufc=tfc;
		System.out.println(this.afc+" ,"+this.ufc);
		
	}
	
	public Constructor1(int kfc, float tfc,String mango) {
		//multi Parameterized Constructor
		
		//System.out.println("we learn constructor");
		
		this.afc=kfc;
		this.ufc=tfc;
		this.apple=mango;
		System.out.println(this.afc+" ,"+this.ufc+ " "+this.apple);
		
	}
	
	public static void main(String[] args) {
		Constructor1 dil = new Constructor1();
		Constructor1 jan = new Constructor1(234557);//Argument passing
		Constructor1 feb = new Constructor1(234,39.99f);
		Constructor1 mar = new Constructor1(124,99.99f,"junaid khalid");
	}

}

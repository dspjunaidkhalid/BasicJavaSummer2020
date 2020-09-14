package basicjavasummer2020;

public class ByteShort {
	public static void main(String[] args) {
	    byte j = 126;  //1 byte	Stores whole numbers from -128 to 127
	    System.out.println(j);  
	    short k = 32750;  //2 bytes	Stores whole numbers from -32,768 to 32,767
	    System.out.println(k); 
	    
	    //                            concatenation= variable+ sting
	    
	    System.out.println(ByteShort.ram+("GB is the ram size of my computer"));// call the function in main method
	    
	    
	    ByteShort drive = new ByteShort();
	    drive.shortDrive();
	    
	    
	    System.out.println(ByteShort.hardDisk+("GB is harddisk size of my computer"));
	    
	  }
	
	
	
	
	
public static byte ram=126;	// GLobal variable and access modifier



protected void shortDrive() {     // Local variable and access modifier
	
	
	System.out.println("Short drive is not possible");
}


	
	private static short hardDisk=4000;
	
	
	
	
	
	
	

}

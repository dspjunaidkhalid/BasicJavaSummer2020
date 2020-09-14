package operators;

public class CondititionalOperator {
	// && Conditional AND: all condition must have to be true
		// || Conditional OR: if one condition is true then block of code will execute
		
		// || pipe
	public static void main(String[] args) {
		int pen=65;
		int pen1=75;
		int pen2=85;
		
		if(pen==65 && pen1<76 && pen2>84 ) {
			System.out.println("pen writeing is good");
		}
		if(pen==65 && pen1<=76 && pen2>84 ) {
			System.out.println("pen writeing is good but not all the time");
		}
		if(pen==65 && pen1<76 && pen2>23 ) {
			System.out.println("pen colour is blue");
		}
		if(pen==65 || pen1<76 || pen2>84 ) {
			System.out.println("pen name is paino");
		}
		if(pen==22 && pen1<66 && pen2>62 ) {
			System.out.println("pen is good better the pencial");
		}
	}

}

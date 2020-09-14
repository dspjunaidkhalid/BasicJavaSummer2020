package operators;

public class UnaryOperator {
	// UnaryOperators
		// ++ Increment Operator: Increasing/Adding 1
		// PreIncrement  ++number   1+number
		// Post Increment number++   number+  1 for Future use
		
		// -- Decrement Operator: Decreasing/Minus 1
		// PreDecrement --number
		// PostDecrement number--
public static void main(String[] args) {
		
		int number=20;
		++number;  // 1+20
		++number;//22
		
		System.out.println(number++);// 22
		System.out.println(number); //1+ 22=  23
		number++;//23
		number++;//24
		number++;//25
		++number;//27
		++number;//28
		System.out.println(number); //28,29  //27
		--number;
		System.out.println(number);//27
		--number;//26    -1+27
		--number;//25	-1+26
		--number;//24	-1+25
		number++;//24 	+1 for Future
		number--;//25  1+24 -1 for Future
		--number;//23  -1 -1 +25
		++number;//24
		number++; //24   +1 for Future
		number--;//+1+24   -1 for Future
		number--;//24	-1 for Future
		System.out.println(number); //23
		
		
}
}
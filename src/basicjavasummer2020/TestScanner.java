package basicjavasummer2020;

import java.util.Scanner;

public class TestScanner {
	
	

	public static void main(String[] args) {
		
		Scanner lock = new Scanner(System.in);
		
		System.out.println("What is your room colour :");
		String colour = lock.nextLine();
		System.out.println(colour+" is the beautiful colour ");
		
		System.out.println("How many door do you have ");
		int door=lock.nextInt();
		System.out.println("My room have "+door+" doors");
		
		System.out.println("How many light in your room");
		int light =lock.nextInt();
		System.out.println("My room have "+light+" lights");
		
		System.out.println("How many watch in your room");
		int watch =lock.nextInt();
		System.out.println("My room have "+watch+" watches");
		
		System.out.println("How many fan in your room");
		int fan =lock.nextInt();
		System.out.println("My room have "+fan+" fans");
		
		System.out.println("How many Bathroon in your room");
		float bath =lock.nextFloat();
		System.out.println("My room have "+bath+" Bathrooms");
		
		System.out.println("How many windows in your room");
		int window =lock.nextInt();
		System.out.println("My room have "+window+" windows");
		
		System.out.println("What is the color of your mirror");
		Scanner input=new Scanner(System.in);
		String mirror = input.nextLine();
		System.out.println("My mirror color is "+mirror);
		
		System.out.println("How many pictures in a Gallery");
		long picture =input.nextLong();
		System.out.println("This Gallery have "+picture+" pictures");
		
		System.out.println("What is the initian of your Name");
		String name =input.nextLine();
		System.out.println("My name is start leter "+name);
		
	 
		lock.close();
		input.close();
	}

}

package practicNested;

import advance.TestPublic.Islamabad;

public class Nested {
	 byte clock=123;
	 short door=35;
	
	public static void main(String[] args) {
		
		Nested.Lahore lah= new Nested.Lahore();
		System.out.println(lah.city1);
		System.out.println(lah.good);
	}
	
	public static class Lahore{
		String city1="lahore is the beautiful city";
		boolean good=true;
	}
	
	public static class karachi{
		int apple=123455;
		long mango=1344455555322l;
		public static void main(String[] args) {
			Multan bat = new Multan();
			System.out.println(bat.chair);
			System.out.println(bat.table);
		}
		
	}
public static class Multan{
		double chair=2345664.4433;
		char table='l';
		public static void main(String[] args) {
			Nested ball = new Nested();
			System.out.println(ball.clock);
			System.out.println(ball.door);
			
			
			Islamabad lan = new Islamabad();
			System.out.println(lan.cat1);
			System.out.println(lan.cat2);
		}
	}
	
	
}
	
	


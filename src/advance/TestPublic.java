package advance;

import basicjavasummer2020.ByteShort;
import basicjavasummer2020.DoSomeMath;

public class TestPublic {
	public static void main(String[]args) {
		
		System.out.println(DoSomeMath.x);
		
		 System.out.println(ByteShort.ram+("GB is the ram size of my computer"));//  check the public access modifier
		}
	
	public static class Islamabad{
		public int cat1=1234;
		public float cat2=39.99f;
		public static void main(String[] args) {
			Islamabad lan = new Islamabad();
			System.out.println(lan.cat1);
			System.out.println(lan.cat2);
			
		}
	}
	

}

package basicjavasummer2020;



public class Casting {
	// Casting: Converting Data type
		// Casting is possible for only primitive to primitive data type
		// Casting is possible for only non primitive to non primitive data type
		
		double apple=2345.45;
		int flo=(int) apple;
		
		
		int aaa=234;
		double newaaa=(double) aaa;
		// byte, short,long, int, float all are real number which is double type.
		
		byte    bbb=126;
		short   ccc=1234;
		long    ddd=123445667l;
		int     eee=981;
		float    fff=123.345f;
		
		double ggg =  bbb;
		double hhh =  ccc;
		double iii =  ddd;
		double jjj =  eee;
		double kkk =  fff;
		
		double vvv=234.5544;
		
		long  newvvv =  (long)  vvv;
		
		// byte ,short are real number which is int type.
		
		byte lll=12;
		short mmm=12345;
		
		int nnn= lll;
		int ooo= mmm;
		
		int xxx=420;
		short newxxx = (short)xxx;
		// byte ,short, int are real number which is long type.
		byte  ppp=12;
		short qqq=12345;
		int   rrr=1235566;
		
		long sss = ppp;
		long ttt = qqq;
		long uuu=  rrr;
        
		long www=8765421l;
		int newwww = (int)www;
		public static void main(String[] args) {
			
			Casting low=new Casting();
		

			
			System.out.println(low.apple);
			System.out.println(low.newaaa);
			System.out.println(low.newvvv);
			System.out.println(low.newwww);
			System.out.println(low.newxxx);
		}

}

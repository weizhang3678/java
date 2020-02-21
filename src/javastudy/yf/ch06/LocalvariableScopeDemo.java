package javastudy.yf.ch06;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 19, 2020 6:15:35 PM
* 
* a demo to illustrate overload
* 
*/
public class LocalvariableScopeDemo {
	
	public void test(int formalPatam1, int formalParam2) {
		for(int i = 0;i<5;i++) {
			int localParam1 = 0;
			
		}
		for(int i = 0;i<5;i++) {
			int localParam1 = 0;
			
		}
		{
			int localParam2 = 10;
		}
		{
			int localParam2 = 10;
		}
		
	}

	public static void main(String[] args) {
		

	}

}

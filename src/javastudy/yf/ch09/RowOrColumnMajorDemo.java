package javastudy.yf.ch09;

import java.util.Date;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 4, 2020 8:23:19 AM
 * 
 * a demo to test performance comparision of Row - Major and Column - Major 
 * 
 */

public class RowOrColumnMajorDemo {
	
	/**
	 * create array randomly
	 * @return
	 */
	public static byte [] [] init(){
		byte [] [] b =new byte[24000][24000];
		for(int i=0;i<10240;i++){
			for(int k =0; k<10240;k++){
				byte random = (byte)(Math.random()*256-128);
				b[i][k]= random;
			}
		}
		return b;
	}

	/**
	 * @param args
	 */
	public static void processByRow(byte [] [] b){
		Long sum=0l;
		for(int i=0;i<b.length;i++){
			for(int k=0;k<b[0].length;k++){
				sum += b[i][k];
			}
		}
	}
	
	/**
	 * @param b
	 */
	public static void processByColumn(byte [] [] b){
		Long sum=0l;
		for(int i=0;i<b.length;i++){
			for(int k=0;k<b[0].length;k++){
				sum += b[k][i];
			}
		}
	}

	

	public static void main(String[] args) {
		
		byte [] []b =init();
		
		// row
		Long currentStrarTime =new Date().getTime();
		System.out.println("process by row starting: currentStrarTime:" + currentStrarTime);
		processByRow(b);
		Long currentEndTime=new Date().getTime();
		System.out.println("process by row ending:"+currentEndTime);
		Long times1 = currentEndTime - currentStrarTime;
		System.out.println("process by row use time:" + times1);
		

		System.out.println("************");
		
		// column
	    currentStrarTime =new Date().getTime();
		System.out.println("process by column starting: currentStrarTime:" + currentStrarTime);
		processByColumn(b);
		currentEndTime=new Date().getTime();
		System.out.println("process by column ending:"+currentEndTime);
		times1 = currentEndTime - currentStrarTime;
		System.out.println("process by column use time:" + times1);

	}

}

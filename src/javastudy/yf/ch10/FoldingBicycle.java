package javastudy.yf.ch10;

/**
*
* Copyright 2020 YF Studio
*
* All right reserved.
* 
* Created on Feb 21, 2020 9:07:05 AM
* 
*/
public class FoldingBicycle extends Bicycle {

	private int[] packSize;

	public FoldingBicycle(int[] packSize, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		this.packSize = packSize;
	}
	
	
	
	public int[] getPackSize() {
		return packSize;
	}



	public void setPackSize(int[] packSize) {
		this.packSize = packSize;
	}



	public static void main(String[] args) {
		FoldingBicycle fb = new FoldingBicycle(new int[] {58,46,75}, 5, 18, 5);
		fb.applyBrake(10);
		fb.speedUp(5);
		System.out.println("The current speed is: "+fb.speed);
		System.out.println("The current gear is: "+fb.gear);
		System.out.println("The current cadence is: "+fb.cadence);
	}
}

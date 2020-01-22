package javastudy.yf.ch03;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Jan 22, 2020 5:39:16 PM
 * 
 */

public class FrogSimulation {

	/** Distance, in inches, from the starting position to the goal. */
	private int goalDistance;

	/** Maximum number of hops allowed to reach the goal. */
	private int maxHops;

	/**
	 * Constructs a FrogSimulation where dist is the distance, in inches, from the
	 * starting position to the goal, and numHops is the maximum number of hops
	 * allowed to reach the goal. Precondition: dist > 0; numHops > 0
	 */
	public FrogSimulation(int dist, int numHops) {
		goalDistance = dist;
		maxHops = numHops;
	}

	/**
	 * Returns an integer representing the distance, in inches, to be moved when the
	 * frog hops.
	 */
	private int hopDistance() {
		/* implementation not shown */ 
		return (int)(Math.random()-0.3)*10;
	}

	/**
	 * Simulates a frog attempting to reach the goal as described in part (a).
	 * Returns true if the frog successfully reached or passed the goal during the
	 * simulation; * false otherwise.
	 */
	public boolean simulate() {
		int distance = 0;
		for(int times = 0; times < maxHops; times++ ) {
			distance +=  hopDistance();
			if(distance >= goalDistance){
				return true;
			} else if(distance < 0 ) {
				
			}
		}
		return false;
	}

	/**
	 * Runs num simulations and returns the proportion of simulations in which the
	 * frog successfully reached or passed the goal. Precondition: num > 0
	 */
	public double runSimulations(int num) {
		double success = 0;
		for(int i=0; i < num; i++){
			success = success + (simulate()? 1:0);
		}
		return success/num;
	}
	
	/**
	 * Runs num simulations and returns the proportion of simulations in which the
	 * frog successfully reached or passed the goal. Precondition: num > 0
	 */
	public double runSimulations1(int num) {
		int success = 0;
		for(int i=0; i < num; i++){
			if(simulate())
			success++;
		}
		return (double)success/num;
	}
}

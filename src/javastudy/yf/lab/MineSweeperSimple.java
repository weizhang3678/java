package javastudy.yf.lab;

import java.util.Scanner;

/**
 *
 * Copyright 2020 YF Studio
 *
 * All right reserved.
 * 
 * Created on Feb 9, 2020 12:08:41 PM
 * 
 * A simple mine sweeper: 
 * We don't consider Exception of input. 
 * We don't have a UI. 
 * We don't have a timer. 
 * Game players can try unlimited times until find
 * all the mines.
 * 
 */
public class MineSweeperSimple {

	private static final int MINE_NUMBER = 5;
	private static final int NOT_MINE = 0;
	private static final int IS_MINE = 1;
	private static final int MINE_FOUND = 2;
	private static final int NOT_MINE_SHOT = 3;

	// print the hints and existing shots
	public static void hint(int[][] map, int x, int y) {
		// show neighbor of this shot
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {

				if (x + i < 0 || y + j < 0 || x + i > 9 || y + j > 9) {
					continue;
				}

				if (map[x + i][y + j] == 0) {
					map[x + i][y + j] = 3;
					System.out.println(
							"x axis is " + (x + i) + " and y axis is " + (y + j) + "" + ", it is not the target!");
				} else if (map[x + i][y + j] == 1) {
					// map[x + i][y + j] = MINE_FOUND;
					System.out
							.println("x axis is " + (x + i) + " and y axis is " + (y + j) + "" + ", this is a target!");

				}
			}

		}
		System.out.println("-------------------------------------");
		// print all the previous shots.
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 3) {
					System.out.println("x axis is " + i + " and y axis is " + j + "" + ", it is not the target!");
				} else if (map[i][j] == 2) {
					System.out.println("x axis is " + i + " and y axis is " + j + "" + ", it is a found target!");
				}
			}
		}
	}

	public static void main(String[] args) {
		// explain the game targets
		System.out.println("This is a 10 * 10 map, x axis and y axis start from 0 - 9.");
		System.out.println("There are totally "+MINE_NUMBER+"  mines, and your task is to find all the mines.");

		// generate 10*10 grid
		/*
		 * 0: not mine 1: mine 2: mine found 3: not mine shot
		 * 
		 */
		int[][] map = new int[10][10];
		// repeated at least 5 times generate 5 mines
		int i = 0;
		while (i < MINE_NUMBER) {
			// generate mines generally
			int x = (int) (Math.random() * 10); // 0-9
			int y = (int) (Math.random() * 10); // 0-9
			if (map[x][y] == 1) {
				continue;
			}
			map[x][y] = 1;
			i++;
		}

		// ready to accept user input
		Scanner input = new Scanner(System.in);
		// how many mines been found
		int find = 0;

		// start to accept user input
		while (find < MINE_NUMBER) {
			int clickX, clickY;
			System.out.println("please enter the x axis of mine");
			clickX = input.nextInt();
			System.out.println("please enter the y axis of mine ");
			clickY = input.nextInt();

			if (map[clickX][clickY] == 1) {
				map[clickX][clickY] = 2;
				find++;
				System.out.println("You find a mine! Now you found " + find + " mines and " + (MINE_NUMBER - find) + " left!");

			} else if (map[clickX][clickY] == 2) {
				System.out.println("You have found this target, try again!");
			} else {
				map[clickX][clickY] = 3;
				System.out.println("You miss!");
				hint(map, clickX, clickY);
			}
		}

		System.out.println("You found all the mines! You win!");
		input.close();
	}

}

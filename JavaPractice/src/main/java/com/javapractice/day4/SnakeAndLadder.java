package com.javapractice.day4;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int position = 0;
		System.out.println("SNAKE AND LADDER GAME");
		System.out.println("Welcome");

		Random random = new Random();
		int count = 0;
		do {
			count++;
			int dice = random.nextInt(6) + 1;
			Random r = new Random();
			String[] opr = { "No_Play", "Ladder", "Snake" };
			int r_opr = r.nextInt(opr.length);

			switch (opr[r_opr]) {
			case "No_Play":
				break;
			case "Ladder":
				if (position + dice <= 100)
					position += dice;
				break;
			case "Snake":
				if (position - dice < 0)
					position = 0;
				break;
			}
		} while (position != 100);

		System.out.println("count: " + count);
	}

}

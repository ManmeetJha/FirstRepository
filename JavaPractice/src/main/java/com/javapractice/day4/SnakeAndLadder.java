package com.javapractice.day4;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		System.out.println("SNAKE AND LADDER GAME");
		System.out.println("Welcome");
		System.out.println("Player 1:");
		int count_p1 = count();
		System.out.println("Player 2:");
		int count_p2 = count();
		if (count_p1 < count_p2)
			System.out.println("Player 1 wins");
		else if (count_p1 > count_p2)
			System.out.println("Player 2 wins");
		else
			System.out.println("Match is draw");
	}

	static int count() {
		Random random = new Random();
		int position = 0;
		int count = 0;
		boolean isLadder = false;
		do {
			if (!isLadder)
				count++;
			int dice = random.nextInt(6) + 1;
			Random r = new Random();
			String[] opr = { "No_Play", "Ladder", "Snake" };
			int r_opr = r.nextInt(opr.length);
			System.out.println(position + "\t" + dice + "\t" + count + "\t" + opr[r_opr]);
			switch (opr[r_opr]) {
			case "No_Play":
				isLadder = false;
				break;
			case "Ladder":
				isLadder = true;
				if (position + dice <= 100)
					position += dice;

				continue;
			case "Snake":
				isLadder = false;
				if (position - dice < 0)
					position = 0;
				else
					position -= dice;
				break;
			}
//			System.out.println(position + " | ");
		} while (position != 100);

		System.out.println("\ncount: " + count);
		return count;

	}
}

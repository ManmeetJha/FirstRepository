package com.javapractice.day4;

import java.util.Random;

public class SnakeAndLadder{

	public static void main(String[] args) {
		int position = 0;
		System.out.println("SNAKE AND LADDER GAME");
		System.out.println("Welcome");

		int dice = (int) Math.floor(Math.random() * 5) + 1;
		System.out.println(dice);

		System.out.println("Random Operation");
		Random r = new Random();
		String[] opr = { "No_Play", "Ladder", "Snake" };
		int r_opr = r.nextInt(opr.length);
		System.out.println(opr[r_opr]);

		switch (opr[r_opr]) {
		case "No_Play":
			break;
		case "Ladder":
			position += dice;
			break;
		case "Snake":
			position -= dice;
			break;
		}
		System.out.println("New position is:"+position);

	}

}

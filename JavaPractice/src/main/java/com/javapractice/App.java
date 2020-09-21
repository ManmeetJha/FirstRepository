package com.javapractice;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	public static final Logger LOG = LogManager.getLogger(App.class);
	public int test;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String message = "Hello World";
		LOG.debug(message + "will be printed at debug");
		LOG.info(message + "will be printed at info");
		LOG.error(message + "will be printed at error");
		LOG.warn(message + "will be printed at warn");
		LOG.fatal(message + "will be printed at fatal");
		LOG.info("Append String:{}", message);
		System.out.println(message);

		///
		System.out.println("Enter number 1:");
		int num1 = scanner.nextInt();

		System.out.println("Enter number 2:");
		int num2 = scanner.nextInt();

		addnumbers(num1, num2);

		scanner.close();

	}

	private static void addnumbers(int num1, int num2) {
		long sum = num1 + num2;
		LOG.info("Sum of two numbers is:"+sum);
	}

}

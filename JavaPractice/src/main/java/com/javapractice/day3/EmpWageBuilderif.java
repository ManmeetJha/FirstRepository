package com.javapractice.day3;

public class EmpWageBuilderif {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;

		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empcheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:" + empWage);

	}

}

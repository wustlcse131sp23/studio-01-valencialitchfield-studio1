package studio1;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("input n1 value");
		int n1 = in.nextInt();
		System.out.print("input n2 value");
		double n2 = in.nextInt();
		double avg = (n1 + n2)/2;
		System.out.print("Average of these integers is " + avg);
		
		
	}

}

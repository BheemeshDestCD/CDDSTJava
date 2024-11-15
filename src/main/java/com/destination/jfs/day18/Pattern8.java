package com.destination.jfs.day18;

import java.util.Scanner;

/*
 * 
pattern-8
25	24	23	22	21
20 	19	18	17	16
15	14	13	12	11
10	9	8	7	6	
5	4	3	2	1
 */
public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		int count=n*n;
		//rows
		for(int i=1;i<=n;i++) {
			//columns
			for(int j=1;j<=n;j++) {
				System.out.print(count+"	");
				count--;
			}
			System.out.println();
		}
	}
}

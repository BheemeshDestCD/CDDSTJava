package com.destination.jfs.day18;

import java.util.Scanner;

/*
 * 4. 
   # # # # #
   # # # # #
   # # # # #
   # # # # #
   # # # # #

 */
public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		//rows
		for(int i=1;i<=n;i++) {
			//columns
			for(int j=1;j<=n;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}









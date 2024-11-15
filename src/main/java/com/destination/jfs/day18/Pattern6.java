package com.destination.jfs.day18;

import java.util.Scanner;

/*
 * Pattern_6
 *    1 2 3 4 5
 *    1 2 3 4 5
 *    1 2 3 4 5
 *	  1 2 3 4 5
 *    1 2 3 4 5
 *                
 */
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		//rows
		for(int i=1;i<=n;i++) {
			//columns
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

package com.destination.jfs.day18;

import java.util.Scanner;

//3. # # # # #
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		//for loop
		for(int i=1;i<=n;i++) {
			System.out.print("# ");
		}
		System.out.println();
		System.out.println("========");
		//while
		int j=1;
		while(j<=n) {
			System.out.print("$ ");
			j++;
		}
		System.out.println();
		System.out.println("========");
		//do while
		int k=1;
		do {
			System.out.print("@ ");
			k++;
		}while(k<=n);
		
	}
}

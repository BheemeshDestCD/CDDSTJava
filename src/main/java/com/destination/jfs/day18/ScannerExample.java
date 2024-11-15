package com.destination.jfs.day18;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte data : ");
		byte byt = sc.nextByte();
		System.out.println("Byte Data is : "+byt);
		System.out.println("=============");
		System.out.println("Enter the short data : ");
		short srt = sc.nextShort();
		System.out.println("Short Data is : "+srt);
		System.out.println("=============");
		System.out.println("Enter the int data : ");
		int i = sc.nextInt();
		System.out.println("Int Data is : "+i);
		System.out.println("=============");
		System.out.println("Enter the long data : ");
		long lng = sc.nextLong();
		System.out.println("Long Data is : "+lng);
		System.out.println("=============");
		System.out.println("Enter the String data : ");
		String str = sc.next();
		System.out.println("String Data is : "+str);
		System.out.println("=============");
		System.out.println("Enter the float data : ");
		float f = sc.nextFloat();
		System.out.println("Float Data is : "+f);
		System.out.println("=============");
		System.out.println("Enter the Double data : ");
		double d = sc.nextDouble();
		System.out.println("Double Data is : "+d);
		System.out.println("=============");
		System.out.println("Enter the boolean data : ");
		boolean b = sc.nextBoolean();
		System.out.println("Boolean Data is : "+b);
		System.out.println("=============");
	}
}

package com.destination.jfs.day18;

import java.util.Scanner;

/*
patter-1
1	6	11	16	21
2	7	12	17	22
3	8	13	18	23
4	9	14	19	24
5	10	15	20	25

 */
public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		int count;
		//rows
		for(int i=1;i<=n;i++) {
			count=i;
			//columns
			for(int j=1;j<=n;j++) {
				System.out.print(count+"	");
				count = count + n;
			}
			System.out.println();
		}
	}
}
/*
case-1 
i=1
count = i --> count = 1--6--11--16--21--26
1	6	11	16	21

case-2
i=2
count=i --> count = 2--7--12--17--22--27
2	7	12	17	22
 */

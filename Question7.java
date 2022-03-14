package assignment2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("a:");
		a=sc.nextInt();
		System.out.println("b:");
		b=sc.nextInt();
		System.out.println("c:");
		c=sc.nextInt();
		int d=a+b+c;
		System.out.println("Sum of Integers:" + d);
		int e=(a+b+c)/3;
		System.out.println("Average of the Integers:" + e);
		int f=a*b*c;
		System.out.println("Product of Integers:" + f);
		if(a>b && a>c) {
			System.out.println("Largest number is " + a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest number is " + b);
		}
		else
			System.out.println("Largest number is" + c);
		if(a<b && a<c) {
			System.out.println("Smallest number is" + a);
		}
		else if(b<a && b<c) {
			System.out.println("Smallest number is" + b);
		}
		else
			System.out.println("Smallest number is" + c);
		
	}

}

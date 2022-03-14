package assignment2;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("a:");
		a=sc.nextInt();
		System.out.println("b:");
		b=sc.nextInt();
		int c=b%a;
		if(b%a==0) {
			System.out.println(b+ " is a multiple of " +a);
		}else {
			System.out.println(b+ "is not a multiple of " +a);
		}
	}

}

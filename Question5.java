package assignment2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numb1");
		n=sc.nextInt();
		System.out.println("Enter num2");
		m=sc.nextInt();
		int c,d,e,f,a;
		c=n+m;
		d=n-m;
		e=n*m;
		f=n/m;
		a=n%m;
		System.out.println("Addition"+c);
		System.out.println("Subtraction"+d);
		System.out.println("Multiplication"+e);
		System.out.println("Quoitent"+f);
		System.out.println("Remainder"+a);
	}

}

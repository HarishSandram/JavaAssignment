package assignment2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numb1");
		n=sc.nextInt();
		System.out.println("Enter num2");
		m=sc.nextInt();
		if(n>m) {
			System.out.println(n+" is larger");
		}
		else if(n==m){
			System.out.println("The numbers are equal");
		}
		else {
			System.out.println(m+"is larger");
		}
	}

}

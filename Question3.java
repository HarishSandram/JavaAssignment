package assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius;
		double farenheit;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Celsius:");
		//celsius=sc.nextInt();
		System.out.println("Enter Farenheit:");
		farenheit=sc.nextDouble();
		celsius=(farenheit-32.0)*5.0/9.0;
		System.out.printf("Celisius: %.1f ",celsius);
	}

}

package assignment2;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0,number=0,largest=0;
		Scanner sc=new Scanner(System.in);
		for(counter=0;counter<10;counter++) {
			System.out.printf("Enter the Number ", counter+1);
			number=sc.nextInt();
			largest=largest>number?largest:number;
		}
		System.out.println("largest number = "+largest);
	}

}

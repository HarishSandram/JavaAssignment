package assignment1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int lower=sc.nextInt();
		int upper=sc.nextInt();
		int sum=0;
		int i=lower;
		while(i<=upper) {
			sum=sum+i;
			i++;
		}
		System.out.println("the total sum is " +sum);
		
	}

}

package assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=53;
		int i=2;
		int count=0;
		while(i<=num/2) {
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if(count==0) {
			System.out.println(num+ " prime number");
		}else {
			System.out.println(num+ " not a prime number");
		}
	}

}

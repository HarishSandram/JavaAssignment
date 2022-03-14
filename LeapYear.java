package assignment1;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2000;
		//int num=i%100;
		if(i%400==0 && i%100==0 && i%4==0) {
			System.out.println(i+ " Leap Year");
		}else {
			System.out.println(" Not a Leap Year");
		}
	}

}

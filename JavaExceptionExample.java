package Tutorials;

public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=10/0;
		}
		catch(ArithmeticException a) {
			System.out.println("An arithmetic error occur");
			System.out.println(a);
		}
	}

}

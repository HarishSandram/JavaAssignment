package assignment2;
class SavingsAccount{
	int savingsBalance;
	static int annualIntrest;
	public int calculateMonthlyIntrest() {
		int intrest=(this.savingsBalance*annualIntrest)/12;
		this.savingsBalance+=intrest;
		return intrest;
	}
	public static void setAnnualIntrest(int intrest) {
		annualIntrest=intrest;
	}
}
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1=new SavingsAccount();
		saver1.savingsBalance=4500;
		SavingsAccount saver2=new SavingsAccount();
		saver2.savingsBalance=5700;
		SavingsAccount.annualIntrest=4;
		System.out.println(saver1.calculateMonthlyIntrest());
		System.out.println(saver2.calculateMonthlyIntrest());
		SavingsAccount.annualIntrest=5;
		System.out.println(saver1.calculateMonthlyIntrest());
		System.out.println(saver2.calculateMonthlyIntrest());
	}

}

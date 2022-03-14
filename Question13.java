package assignment2;
class Account{
	int balance=0;
	Account(int balance){
		this.balance=balance;
	}
	public void debit(int debitAmount) {
		if(balance>=debitAmount) {
			balance-=debitAmount;
		}else {
			System.out.println("Debit amount exceeded account balance");
		}
	}
}
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account(9500);
		acc.debit(350);
		System.out.println(acc.balance);
		acc.debit(7680);
		System.out.println(acc.balance);
		acc.debit(400);
		System.out.println(acc.balance);
	}

}

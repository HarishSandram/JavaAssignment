package assignment2;
class Date{
	int day;
	int month;
	int year;
	int test=5;
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;	
	}
	public int getDay() {
		return this.day;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int Month) {
		this.month=month;
	}public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void displayDate() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date(11,10,2001);
		Date date1=new Date(24,2,2005);
		date.displayDate();
		date1.displayDate();
	}

}

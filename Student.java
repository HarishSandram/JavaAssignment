package assignment1;

public class Student {
	int id=183;
	String name;
	void getValues(int i,String j) {
		id=i;
		name=j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=170;
		String name="harish";
		Student s1=new Student();
		Student s2=new Student();
		s1.getValues(183, "Harish");
		System.out.println(s1.id);
		System.out.println(s1.name);
		
	}

}

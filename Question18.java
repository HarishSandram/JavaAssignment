package assignment2;
class Book{
	private String Name;
	private String ISBN;
	private String Aurthor;
	private String Publisher;
	public Book() {
		Name="NULL";
		ISBN="NULL";
		Aurthor="NULL";
		Publisher="NULL";
	}
	public Book(String name,String isbn,String aurthor,String publisher) {
		Name=name;
		ISBN=isbn;
		Aurthor=aurthor;
		Publisher=publisher;
	}
	public void setName(String Name) {
		this.Name=Name;
	}public String getName() {
		return Name;
	}public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}public String getiSBN() {
		return ISBN;
	}public void setAurthor(String Aurthor) {
		this.Aurthor=Aurthor;
	}public String getAurthor() {
		return Aurthor;
	}public void setPublisher(String Publisher) {
		this.Publisher=Publisher;
	}public String getPublisher(){
		return Publisher;
	}public void getBookInfo() {
		System.out.printf("%s %s %s %s ",Name,ISBN,Aurthor,Publisher);
	}
}

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book test[]=new Book[13];
		test[1]=new Book();
		test[1].getBookInfo();
	}

}

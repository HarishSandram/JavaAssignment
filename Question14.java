package assignment2;
class Invoice{
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	Invoice(String partNumber,String partDescription,int quantity,double price){
		this.partNumber=partNumber;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.price=price;
	}
	public String getPartNumber() {
		return  this.partNumber;
	}
	public void setPartNumber() {
		this.partNumber=partNumber;
	}
	public String getPartDescription() {
		return this.partDescription;
	}
	public void setPartDescription() {
		this.partDescription=partDescription;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
			this.quantity=0;
		}else {
			this.quantity=quantity;
		}
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		if (price<0) {
			this.price=0.0;
		}else {
			this.price=price;
		}
	}
	public double getInvoiceAmount() {
		return this.quantity*this.price;
	}
}


public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice in=new Invoice("5","sugar",2,20.0);
		System.out.println(in.getPartNumber());
		System.out.println(in.partDescription);
		System.out.println(in.quantity);
		System.out.println(in.price);
		System.out.println(in.getInvoiceAmount());
	}

}

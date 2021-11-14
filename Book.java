package BookStorePackge;


public class Book {
	private String bookName;//å
	private String bookNumber;// ������ȣ
	private String bookPublisher;//���ǻ�
	private int price;//å����
	private String bookAuthor;//����

	public Book() {	}

	public Book(String bookName, String bookNumber, String bookPublisher,int price,String bookAuthor ) {
		this.bookName=bookName;
		this.bookNumber=bookNumber;
		this.bookPublisher=bookPublisher;
		this.price=price;
		this.bookAuthor=bookAuthor;

	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}




	public void bookPrint() {
		System.out.printf("%10s \t%10s \t%10s \t%9d \t%10s\n", bookName, bookNumber, bookPublisher, price, bookAuthor);
	}

	// Ÿ�̺� ���
	public static void titlePrint() {
		System.out.printf("%9s \t%9s \t%10s \t%10s \t%10s\n", "å�̸�", "å��ȣ", "����", "�ݾ�", "���ǻ�");
		System.out.println("------------------------------------------------------------------------------------------");
	}
}

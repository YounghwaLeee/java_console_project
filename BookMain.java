import BookStorePackge.BookDataSet;

public class BookMain {

	public static void main(String[] args) {
	
		BookLogin login =new BookLogin();
		BookDataSet.basicDataSet();

		login.StartLogin();
	}

}

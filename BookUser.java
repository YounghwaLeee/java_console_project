import java.util.Scanner;

import BookStorePackge.Book;
import BookStorePackge.BookDataSet;
import Member.Join;

public class BookUser {
	Scanner scan = new Scanner(System.in);
	String menuTitle="메뉴[1.도서검색2.도서구매3.프로그램종료]";

	public BookUser() {}
	public void UserStart() {
		System.out.println("회원로그인성공");
	}
	
	public void UserCall() {
		String menu=inData(menuTitle);
		if(menu.equals("1")) {
			bookSearch();//도서검색
		}else if(menu.equals("2")) {
			bookRent();//도서구매
		}else if(menu.equals("3")) {
			System.exit(0);
		}			
	}
		

	public void bookSearch() {//도서검색
		String search = inData("검색할 도서 입력");
		Book bk=BookDataSet.bkList.get(search);
		if(search.equals(bk.getBookName())) {
			System.out.println("구매할 수 있는 도서 입니다.");
		}//else if(search.equals(bk.getBookName())){
	
		
		
		}
	public void bookRent() {//도서구매
	
	}
	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"->");
		return sc.nextLine();//data 입력받을때 반환값 이메서드를 실행하면 값이 반환된다.
	}

}
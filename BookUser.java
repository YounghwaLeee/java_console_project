import java.util.Scanner;

import BookStorePackge.Book;
import BookStorePackge.BookDataSet;
import Member.Join;

public class BookUser {
	Scanner scan = new Scanner(System.in);
	String menuTitle="�޴�[1.�����˻�2.��������3.���α׷�����]";

	public BookUser() {}
	public void UserStart() {
		System.out.println("ȸ���α��μ���");
	}
	
	public void UserCall() {
		String menu=inData(menuTitle);
		if(menu.equals("1")) {
			bookSearch();//�����˻�
		}else if(menu.equals("2")) {
			bookRent();//��������
		}else if(menu.equals("3")) {
			System.exit(0);
		}			
	}
		

	public void bookSearch() {//�����˻�
		String search = inData("�˻��� ���� �Է�");
		Book bk=BookDataSet.bkList.get(search);
		if(search.equals(bk.getBookName())) {
			System.out.println("������ �� �ִ� ���� �Դϴ�.");
		}//else if(search.equals(bk.getBookName())){
	
		
		
		}
	public void bookRent() {//��������
	
	}
	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"->");
		return sc.nextLine();//data �Է¹����� ��ȯ�� �̸޼��带 �����ϸ� ���� ��ȯ�ȴ�.
	}

}
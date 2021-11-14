
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import BookStorePackge.Book;
import BookStorePackge.BookDataSet;
import Member.MemberSet;
import Member.MemberVO;


public class BookManager {
	Scanner scan = new Scanner(System.in);
	String menuTitle="�޴�[1.�������,2.�������,3.������������,4.��������,5.����;]";

	BookDataSet books= new BookDataSet();

	
	public BookManager() {}
	
	public void BookStart() {
	

			BookProcessStart();
			
	}

	public void BookProcessStart() {
		do {
			
			String menu= inData(menuTitle);//��ü������
			System.out.println(menu);
			if(menu.equals("1")) {
				allBkList();
			}else if(menu.equals("2")) { //�������
				allBkList();
				bkInsert();
			}else if(menu.equals("3")) {//������������
				allBkList();
				bkUpdate();
			}else if(menu.equals("4")) {//��������
				allBkList();
				bkDelete();
			}else if(menu.equals("5")) {
				System.out.println("�ý����� ����Ǿ����ϴ�.");
				BookLogin bl = new BookLogin();
				bl.StartLogin();//���α׷� ����
			}else {
				System.out.println("�޴��� �߸����� �߽��ϴ�. �ٽ� �Է��ϼ���");
			
		
			}
		}while(true);
	}
	//��������
	public void bkDelete() {
		String DelBook = inData("������ �������");
		BookDataSet.bkList.remove(DelBook);
				
		}
	//�������
	public void bkInsert() {
		Book vo= new Book();

		vo.setBookName(inData("�����̸�"));//inData��� �޼��带 ��������ش�.���� �Է��� ����return�� �ǰ�. �̸��� ���ϵǰ�.
		vo.setBookNumber(inData("������ȣ"));//get�� �����°�set�� �ִ°�.
		vo.setBookPublisher(inData("���ǻ�"));
		vo.setPrice(Integer.parseInt(inData("å����")));
		vo.setBookAuthor(inData("����"));
		BookDataSet.bkList.put(vo.getBookName(),vo);
	}
		
	//������������
	public void bkUpdate() {
		String editName = inData("������ ���� �Է�");
		
		if(BookDataSet.bkList.containsKey(editName)==false) {
			System.out.printf("ã���� %s�� �����ϴ�.\n",editName);
			return;
		}
		
		
		String editMenu=inData("������ �ʵ弱��[1.����2.å��ȣ]");
		if(editMenu.equals("1")){
			Book b =BookDataSet.bkList.get(editName);
			System.out.print("������ �־��ּ���:");
			Scanner sc = new Scanner(System.in);
			b.setPrice(sc.nextInt());
	
		}else if(editMenu.equals("2")) {
//				bookAuthor(editName);
			Book b= BookDataSet.bkList.get(editName);
			
			System.out.println("��ȣ�� �־��ּ���");
			Scanner sc = new Scanner(System.in);
			b.setBookNumber(sc.nextLine());	
		}else {
			System.out.println("�޴��� �߸������߽��ϴ�. �ٽ��Է��ϼ���");
		}
	}
	//���� ��ü��� ���
	public void allBkList() {
		//�������

		Book.titlePrint();
		Collection<Book>list=BookDataSet.bkList.values();
		//System.out.println(list.size());
		Iterator<Book>ii=list.iterator();
		while(ii.hasNext()) {
			Book bk=ii.next();
			bk.bookPrint();
		}
	}
	//ȸ������ ����ϱ�
	public void alljoinList() {
		MemberVO.titlePrint();
		Collection<MemberVO> list = MemberSet.member.values();
		Iterator<MemberVO> iii = list.iterator();
		while(iii.hasNext()) {
			MemberVO vo = iii. next();
			vo.joinprint();
		}
	}
	
	//ȸ������
	public void allJoin() {
		MemberVO vo = new MemberVO();
		vo.setName(inData("�̸�"));
		vo.setId(inData("���̵�"));
		vo.setPw(inData("��й�ȣ"));
		vo.setTel(inData("��ȭ��ȣ"));
		MemberSet.member.put(vo.getId(), vo);
		System.out.println(vo.getName()+"�� ������ ȯ���մϴ�");

	}

	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"->");
		return sc.nextLine();//data �Է¹����� ��ȯ�� �̸޼��带 �����ϸ� ���� ��ȯ�ȴ�.
	}

}
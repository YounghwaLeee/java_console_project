import java.util.InputMismatchException;
import java.util.Scanner;

import BookStorePackge.BookDataSet;
import Member.Join;
import Member.MemberSet;
import Member.MemberVO;



public class BookLogin {

	private static String userid1="admin";
	private static String userpw1="1234";



	String id =" ";
	String pw =" ";

	Scanner scan= new Scanner (System.in);
	public BookLogin() {}

	public void StartLogin() {
		MemberVO mvo = new MemberVO();
		Scanner scan= new Scanner(System.in);

		do{
			//inData��1���̸� �α��� 2. ȸ������ ����� �Ѵ�.����

			MemberSet.basicMemgerSet();
			mvo.titlePrint();
			
				int number= scan.nextInt();

				switch(number) {
				case 1: 
					inputLogin();
					MemberVO vo = MemberSet.member.get(id);
					if(id.equals(userid1) && pw.equals(userpw1)) {
						System.out.println("�����ڷ� �α��� �Ǽ̽��ϴ�.");
						BookManager bk = new BookManager();
						bk.BookStart();
						
					}else if(id.equals(vo.getId())&&pw.equals(vo.getPw())) {
						System.out.println("�̿��ڷ� �α��� �Ǽ̽��ϴ�.");
						BookUser user= new BookUser();
						user.UserStart();
						user.UserCall();
						
					}else {
						System.out.println("�ٽ��Է����ּ���");
					}	break;
				case 2://ȸ������
					BookManager bbk= new BookManager();
					bbk.allJoin();
					break;
				}
				
		}while(true);
		
	}
	// ȸ������
	//join();


	public void inputLogin() {
		System.out.println("���̵� �Է��ϼ���");
		id=scan.nextLine();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		pw=scan.nextLine();

	}	


}


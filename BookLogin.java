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
			//inData로1번이면 로그인 2. 회원가입 물어보고 한다.ㅎㄹ

			MemberSet.basicMemgerSet();
			mvo.titlePrint();
			
				int number= scan.nextInt();

				switch(number) {
				case 1: 
					inputLogin();
					MemberVO vo = MemberSet.member.get(id);
					if(id.equals(userid1) && pw.equals(userpw1)) {
						System.out.println("관리자로 로그인 되셨습니다.");
						BookManager bk = new BookManager();
						bk.BookStart();
						
					}else if(id.equals(vo.getId())&&pw.equals(vo.getPw())) {
						System.out.println("이용자로 로그인 되셨습니다.");
						BookUser user= new BookUser();
						user.UserStart();
						user.UserCall();
						
					}else {
						System.out.println("다시입력해주세요");
					}	break;
				case 2://회원가입
					BookManager bbk= new BookManager();
					bbk.allJoin();
					break;
				}
				
		}while(true);
		
	}
	// 회원가입
	//join();


	public void inputLogin() {
		System.out.println("아이디를 입력하세요");
		id=scan.nextLine();
		System.out.println("비밀번호를 입력하세요");
		pw=scan.nextLine();

	}	


}


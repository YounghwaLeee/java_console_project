
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import BookStorePackge.Book;
import BookStorePackge.BookDataSet;
import Member.MemberSet;
import Member.MemberVO;


public class BookManager {
	Scanner scan = new Scanner(System.in);
	String menuTitle="메뉴[1.도서목록,2.도서등록,3.도서정보수정,4.도서삭제,5.종료;]";

	BookDataSet books= new BookDataSet();

	
	public BookManager() {}
	
	public void BookStart() {
	

			BookProcessStart();
			
	}

	public void BookProcessStart() {
		do {
			
			String menu= inData(menuTitle);//전체도서명
			System.out.println(menu);
			if(menu.equals("1")) {
				allBkList();
			}else if(menu.equals("2")) { //도서등록
				allBkList();
				bkInsert();
			}else if(menu.equals("3")) {//도서정보수정
				allBkList();
				bkUpdate();
			}else if(menu.equals("4")) {//도서삭제
				allBkList();
				bkDelete();
			}else if(menu.equals("5")) {
				System.out.println("시스템이 종료되었습니다.");
				BookLogin bl = new BookLogin();
				bl.StartLogin();//프로그램 종료
			}else {
				System.out.println("메뉴를 잘못선택 했습니다. 다시 입력하세요");
			
		
			}
		}while(true);
	}
	//도서삭제
	public void bkDelete() {
		String DelBook = inData("삭제할 도서목록");
		BookDataSet.bkList.remove(DelBook);
				
		}
	//도서등록
	public void bkInsert() {
		Book vo= new Book();

		vo.setBookName(inData("도서이름"));//inData라는 메서드를 실행시켜준다.내가 입력한 값이return이 되고. 이름이 리턴되고.
		vo.setBookNumber(inData("도서번호"));//get값 꺼내는거set값 넣는거.
		vo.setBookPublisher(inData("출판사"));
		vo.setPrice(Integer.parseInt(inData("책가격")));
		vo.setBookAuthor(inData("저자"));
		BookDataSet.bkList.put(vo.getBookName(),vo);
	}
		
	//도서정보수정
	public void bkUpdate() {
		String editName = inData("수정할 도서 입력");
		
		if(BookDataSet.bkList.containsKey(editName)==false) {
			System.out.printf("찾으신 %s는 없습니다.\n",editName);
			return;
		}
		
		
		String editMenu=inData("수정할 필드선택[1.가격2.책번호]");
		if(editMenu.equals("1")){
			Book b =BookDataSet.bkList.get(editName);
			System.out.print("가격을 넣어주세요:");
			Scanner sc = new Scanner(System.in);
			b.setPrice(sc.nextInt());
	
		}else if(editMenu.equals("2")) {
//				bookAuthor(editName);
			Book b= BookDataSet.bkList.get(editName);
			
			System.out.println("번호를 넣어주세요");
			Scanner sc = new Scanner(System.in);
			b.setBookNumber(sc.nextLine());	
		}else {
			System.out.println("메뉴를 잘못선택했습니다. 다시입력하세요");
		}
	}
	//도서 전체목록 출력
	public void allBkList() {
		//제목출력

		Book.titlePrint();
		Collection<Book>list=BookDataSet.bkList.values();
		//System.out.println(list.size());
		Iterator<Book>ii=list.iterator();
		while(ii.hasNext()) {
			Book bk=ii.next();
			bk.bookPrint();
		}
	}
	//회원정보 출력하기
	public void alljoinList() {
		MemberVO.titlePrint();
		Collection<MemberVO> list = MemberSet.member.values();
		Iterator<MemberVO> iii = list.iterator();
		while(iii.hasNext()) {
			MemberVO vo = iii. next();
			vo.joinprint();
		}
	}
	
	//회원가입
	public void allJoin() {
		MemberVO vo = new MemberVO();
		vo.setName(inData("이름"));
		vo.setId(inData("아이디"));
		vo.setPw(inData("비밀번호"));
		vo.setTel(inData("전화번호"));
		MemberSet.member.put(vo.getId(), vo);
		System.out.println(vo.getName()+"님 가입을 환영합니다");

	}

	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"->");
		return sc.nextLine();//data 입력받을때 반환값 이메서드를 실행하면 값이 반환된다.
	}

}
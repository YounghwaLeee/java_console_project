package Member;

import java.util.Scanner;

public class Join {

	public Join() {	}
	public void memberInsert() {
	MemberVO vo= new MemberVO();
	vo.setName(inData("이름"));
	vo.setId(inData("아이디"));
	vo.setPw(inData("패스워드"));
	vo.setTel(inData("휴대폰번호"));
	MemberSet.member.put(vo.getId(), vo);

	}
	
	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"->");
		return sc.nextLine();//data 입력받을때 반환값 이메서드를 실행하면 값이 반환된다.
	}

}	


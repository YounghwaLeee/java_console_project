package Member;

import java.util.Scanner;

public class Join {

	public Join() {	}
	public void memberInsert() {
	MemberVO vo= new MemberVO();
	vo.setName(inData("�̸�"));
	vo.setId(inData("���̵�"));
	vo.setPw(inData("�н�����"));
	vo.setTel(inData("�޴�����ȣ"));
	MemberSet.member.put(vo.getId(), vo);

	}
	
	public String inData(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg+"->");
		return sc.nextLine();//data �Է¹����� ��ȯ�� �̸޼��带 �����ϸ� ���� ��ȯ�ȴ�.
	}

}	


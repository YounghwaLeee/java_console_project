package Member;

import java.util.HashMap;

public class MemberSet {

	public static HashMap< String,MemberVO>member = new HashMap<String,MemberVO>();
	
	public MemberSet() {
		
	}
	public static void  basicMemgerSet() {
		member.put("abc1", new MemberVO("�̿�ȭ","abc1","1234","31173688"));
		member.put("abcd1", new MemberVO("������","abcd1","12345","12345678"));
		member.put("abcde1", new MemberVO("�輺��","abcde1","123456","23456789"));
		member.put("abcde1", new MemberVO("�����","abcde1","1234567","34567891"));
		
	}
	


}

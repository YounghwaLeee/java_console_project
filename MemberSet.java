package Member;

import java.util.HashMap;

public class MemberSet {

	public static HashMap< String,MemberVO>member = new HashMap<String,MemberVO>();
	
	public MemberSet() {
		
	}
	public static void  basicMemgerSet() {
		member.put("abc1", new MemberVO("ÀÌ¿µÈ­","abc1","1234","31173688"));
		member.put("abcd1", new MemberVO("ÀÌÀºÁ¤","abcd1","12345","12345678"));
		member.put("abcde1", new MemberVO("±è¼º±Ô","abcde1","123456","23456789"));
		member.put("abcde1", new MemberVO("±èÈñ¼ö","abcde1","1234567","34567891"));
		
	}
	


}

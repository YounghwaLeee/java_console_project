package Member;

public class MemberVO {
	//�̸� ���̵� ��й�ȣ ����ó
	private String name;
	private String id;
	private String pw;
	private String tel;
	
	public MemberVO() {}
	
	public MemberVO(String name,String id,String pw,String tel) {
		this.name=name;
		this.id=id;
		this.pw=pw;
		this.tel=tel;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public static void titlePrint() {
		
		System.out.println("==================================================================================");
		System.out.println("1. �α��� 2. ȸ������");
		System.out.println("----------------------------------------------------------------------------------");
	
		
	}

	public void joinprint() {
		System.out.printf("%s %s %s %10s\n",name,id,pw,tel);
		
	}

}


package BookStorePackge;

import java.util.HashMap;

public class BookDataSet {

	public static HashMap<String,Book>bkList =new HashMap<String, Book>();
	
	public BookDataSet() {
	}
	
	
	public static void basicDataSet() {
		bkList.put("���� ���Ͽ�",new Book("�������Ͽ�","11111","������",15000,"������"));
		bkList.put("�ܼ��� ����",new Book("�ܼ��� ����","22222","������",17000,"������"));
		bkList.put("�Ҷ�",new Book("�Ҷ�","33333","�ڿ���",12500,"�ϳ븶��"));
		bkList.put("���� �Ӽ�",new Book("���ǼӼ�","44444","���ȣ",15500,"�ص��۵�Ŵ"));
		bkList.put("ȥ�ڼ� �����ϰ�",new Book("ȥ�ڼ� �����ϰ�","55555","�̼���",13500,"�϶�����"));
		
	}
	
}

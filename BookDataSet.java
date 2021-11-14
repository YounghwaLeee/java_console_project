package BookStorePackge;

import java.util.HashMap;

public class BookDataSet {

	public static HashMap<String,Book>bkList =new HashMap<String, Book>();
	
	public BookDataSet() {
	}
	
	
	public static void basicDataSet() {
		bkList.put("딸에 대하여",new Book("딸에대하여","11111","김혜진",15000,"민음사"));
		bkList.put("단순한 진심",new Book("단순한 진심","22222","조해진",17000,"믿음사"));
		bkList.put("소란",new Book("소란","33333","박연준",12500,"북노마드"));
		bkList.put("돈의 속성",new Book("돈의속성","44444","김승호",15500,"앤디퍼디킴"));
		bkList.put("혼자서 완전하게",new Book("혼자서 완전하게","55555","이숙영",13500,"북라이프"));
		
	}
	
}

package sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		//인터페이스     변수 = 구현객체; 자동형변환
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); //0
		list.add("JDBC"); //1
		list.add("Servlet/JSP"); //2->3->2->x
		list.add(2, "Database");//2->x
		list.add("iBATIS");//4->3->2->x

		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");		
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}


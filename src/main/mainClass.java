package main;

import queue.QueueList;

public class mainClass {

	public static void main(String[] args) {
		
		QueueList ql = new QueueList();
		
		String str = "가가가가";
		String str2 = "나나나나";
		String str3 = "다다다다";
		String str4 = "라라라라";
		
		ql.push(str);
		ql.push(str2);
		ql.push(str3);
		ql.push(str4);
		
		// 제일 나중에 넣은 데이터부터 출력.
		System.out.println("front : " + ql.pop() + " 제거");
		System.out.println("front : " + ql.pop() + " 제거");
		
		String str_a = (String)ql.peek();
		System.out.println("front : " + str_a);
		
		// 다른 데이터 입력.
		int num = 4;
		ql.push(num);
		
		// 맨 뒤에 있는 데이터를 출력하려면 앞에있는 데이터를 모두 제거해야한다.
		System.out.println("front : " + ql.pop() + " 제거");
		System.out.println("front : " + ql.pop() + " 제거");
		// 정수데이터를 출력.
		int num_a = (int)ql.peek();
		System.out.println("front : " + num_a);
	}

}

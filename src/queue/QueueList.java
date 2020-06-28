package queue;

import java.util.ArrayList;

public class QueueList {
	private ArrayList<Object> list = new  ArrayList<Object>();
	public QueueList() {}
	
	// 큐리스트가 비어있는지 확인.
	public boolean isEmpty() {
		
		boolean empty = false;		
		if(list.size() == 0) {
			empty =true;
		}
		return empty;
	}
	// 맨처음에 있는 데이터를 리턴한다.
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	// 큐리스트에 데이터 추가.
	public void push(Object obj) {
		list.add(obj);
	}
	// 큐리스트에서 제일 먼저 있는 데이터를 가져와서 제거하고 출력한다.
	public Object pop() {
		Object obj = peek();
		if(obj == null) {
			System.out.print("데이터가 없습니다 : ");
			return obj;
		}
		list.remove(obj);
		return obj;
	}
}

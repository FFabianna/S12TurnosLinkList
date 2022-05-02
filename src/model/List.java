package model;

public class List {
	
	NodeTurn head;
	NodeTurn tail;
	
	public void add() {
		NodeTurn nodeturn = new NodeTurn();
		if(head == null) {
			nodeturn.setValue(1);
			
			head=nodeturn;
			tail=nodeturn;
			head.setNext(head);
			head.setPrev(head);
			
		}else {
			
			int t = tail.getValue()+1;
			nodeturn.setValue(t);
			tail.setNext(nodeturn);
			
			nodeturn.setPrev(tail);
			
			head.setPrev(nodeturn);
			nodeturn.setNext(head);
			
			tail = nodeturn;
			
		}
	}
	
	
	public void print() {
		if(null==head) {
			System.out.println("No hay turnos en la lista");
			return;
		}
		
		System.out.println(head.getValue());
	}
	
	public void pass() {
		if(null==head) {
			System.out.println("No hay turnos en la lista");
			return;
		}
		
		head.setNum(head.getNum()+1);
		if(head.getNum()>=3) {
			delete();
		}else {
			NodeTurn t = head.getNext();
			tail=head;
			head=t;
		}
	}
	
	public boolean delete() {
		boolean out = false;
		if(head==null) {
			return false;
		}else {
			if(head==head.getNext()) {
				head=null;
				return true;
			}
			tail.setNext(head.getNext());
			head.getNext().setPrev(tail);
			head=head.getNext();
			out=true;
		}
		return out;
	}

}

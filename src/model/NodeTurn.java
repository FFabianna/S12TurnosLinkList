package model;

public class NodeTurn {
	
	private int value;
	private int num;
	
	

		//Enlaces
		private NodeTurn prev;
		private NodeTurn next;
		
		
		public NodeTurn () {
			this.num = 0;
		}

		
		
		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public NodeTurn getPrev() {
			return prev;
		}

		public void setPrev(NodeTurn prev) {
			this.prev = prev;
		}

		public NodeTurn getNext() {
			return next;
		}

		public void setNext(NodeTurn next) {
			this.next = next;
		}
		
		public int getValue() {
			return value;
		}

		
		public void setValue(int value) {
			this.value = value;
		}
		
		
		
		

}

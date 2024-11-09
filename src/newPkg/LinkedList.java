package newPkg;

public class LinkedList {
	Node head;
	Node tail;

	void basaEkle(int x) {
		Node eleman = new Node(x);
		if (head == null) {
			head = eleman;
			tail = eleman;
		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;

		}
	}

	void sonaEkle(int x) {
		Node eleman = new Node(x);
		if (head == null) {
			head = eleman;
			tail = eleman;
		} else {
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;

		}
	}

	void arayaEkle(int index, int x) {
		Node eleman = new Node(x);
		int n = 0;// liste boyutu
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			n++;
		}
		if (head == null && index == 0) {
			head = eleman;
			tail = eleman;
		} else if (head != null && index == 0) {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
		} else if (head != null && index == n) {
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
		} else if (head == null && index != 0) {
			System.out.println("Hatalı Index");
		} else {
			temp = head;
			Node temp2 = head;
			n = 0;
			while (temp != null) {
				temp2 = temp;
				temp = temp.next;
				n++;
				if (n == index) {
					temp2.next = eleman;
					eleman.next = temp;
					temp.prev = eleman;
					eleman.prev = temp2;
					break;
				}
			}
		}
	}

	void yazdir() {
		if (head == null) {
			System.out.println("Liste boş");
		} else {
			Node temp = head;
			System.out.print("Baş -> ");
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println("Son");
		}

	}

	void sondanYazdir() {
		if (head == null) {
			System.out.println("Liste boş");
		} else {
			Node temp = tail;
			System.out.print("Son <- ");
			while (temp != null) {
				System.out.print(temp.data + " <- ");
				temp = temp.prev;
			}
			System.out.println("Baş");
		}
	}

	void bastanSil() {
		if (head == null) {
			System.out.println("Liste boş silinecek eleman yok");
		} else if (head.next == null) {
			head = null;
			tail = null;
		}else {
			head=head.next;head.prev=null;
		}
	}
	void sondanSil() {
		if (head == null) {
			System.out.println("Liste boş silinecek eleman yok");
		} else if (head.next == null) {
			head = null;
			tail = null;
		}else {
			tail=tail.prev;
			tail.next=null;
		}
	}void aradanSil(int index){
		if(head!=null) {
			if(head.next==null && index<=0) {
				head=null;
				tail=null;
			}else if(head.next!=null && index==0) {
				head=head.next;
				head.prev=null;
			}else {
				int n=0;
				Node temp=head;
				while(temp!=null) {
					n++;
					temp=temp.next;
					
				}
				if(n-1==index) {
					tail=tail.prev;
					tail.next=null;
				}else {
					temp=head;
					int k=0;
					while(k<index) {
						k++;
						temp=temp.next;
					}
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
				}
			}
			
		}
	}

}

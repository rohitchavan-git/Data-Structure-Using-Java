package linkedList;

public class SLListMain {

	public static void main(String[] args) {

		SLList slList = new SLList();
		slList.add(10);
		slList.add(11);
		slList.add(12);
		slList.add(13);
		slList.add(14);
		slList.add(15);
		slList.add(16);
		slList.add(17);
		slList.showList();
		System.out.println("is 15 present in list :" + slList.search(10));
		System.out.println("Reverse Linked List");
		slList.revList();
		slList.showList();

		
		System.out.println("get First index =>"+slList.getFirst());
		System.out.println("get Node at 2 loc =>"+slList.get(2));
		System.out.println("get Last inserted Node data=>"+slList.getLast());
		System.out.println("Delete Node at index 2");
		slList.deleteNode(2);
		slList.showList();
		System.out.println("Delete Node at index 4");
		slList.deleteNode(4);
		slList.showList();
	}

}

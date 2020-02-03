package linkedList;

public class SLListMain {

	public static void main(String[] args) {

		SLList slList = new SLList();
		slList.add(10);
		slList.add(11);
		slList.add(12);
		slList.add(13);
		slList.showList();
		System.out.println("is 15 present in list :" + slList.search(10));
		System.out.println("Reverse Linked List");
		slList.revList();
		slList.showList();

		
		System.out.println("get at 3 index =>"+slList.get(2));
		
		
	}

}

package tree;

public class BSTreeMain {

	public static void main(String[] args) {
		BSTree bsTree = new BSTree();
		bsTree.add(10);
		bsTree.add(7);
		bsTree.add(8);
		bsTree.add(48);
		bsTree.add(18);
		bsTree.add(17);
		bsTree.add(88);
		bsTree.add(40);
		bsTree.add(100);
		bsTree.inorder();
		System.out.println();
		bsTree.preorder();
		System.out.println();
		bsTree.postorder();
		System.out.println();
		bsTree.preorderIte();
		System.out.println("is 18 present in tree ="+bsTree.search(18));
		System.out.println("is 100 present in tree ="+bsTree.search(100));
		System.out.println("is 900 present in tree ="+bsTree.search(900));
		
		System.out.println("getMin="+bsTree.getMin());
		System.out.println("getMax="+bsTree.getMax());
	}

}

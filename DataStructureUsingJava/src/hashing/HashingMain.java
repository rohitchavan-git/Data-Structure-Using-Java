package hashing;

public class HashingMain {

		public static void main(String[] args) {
			HashingChainTech table=new HashingChainTech();
			table.put(90);
			table.put(91);
			table.put(0);
			table.put(1);
			table.put(92);
			table.put(96);
			table.put(97);
			table.put(9);
			table.put(99);
			table.put(89);
			table.put(59);
			table.put(19);
			table.put(29);
			table.put(39);
			table.put(49);
			System.out.println("hello");
			
			if(table.contains(9))
				System.out.println("9 is present in table");
			else
				System.out.println("9 is not present in table");
			
			
			table.showHashTable();
			System.out.println("After removing 9.");
			table.remove(9);
			table.showHashTable();
			System.out.println("After removing 59.");
			table.remove(59);
			table.showHashTable();
		}
}

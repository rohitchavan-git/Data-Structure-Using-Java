package hashing;

public class HashMapCustomMain {
	public static void main(String[] args) {
	
		HashMapCustom hash=new HashMapCustom();
		hash.put("fname", "rohit");
		hash.put("lname", "chavan");
		hash.put("fname", "amol");
		hash.put("lname", "gade");
		
		
		System.out.println(hash.get("lname"));
		
		hash.printTable();
	}
}

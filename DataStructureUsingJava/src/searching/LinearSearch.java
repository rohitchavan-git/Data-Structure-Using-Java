package searching;

public class LinearSearch implements Search {

	@Override
	public boolean search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				System.out.println("Found");
				return true;
			}
		}
		return false;

	}

}

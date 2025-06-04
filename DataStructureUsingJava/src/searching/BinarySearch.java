package searching;

public class BinarySearch implements Search {

	@Override
        public boolean search(int[] array, int key) {
                int low=0,up=array.length-1;
                for(int mid=(low+up)/2;low<=up;mid=(low+up)/2) {
			if(array[mid] == key)
				return true;
			if(array[mid]<key)
				low=mid+1;
			else
				up=mid-1;
		}
		return false;
	}

}

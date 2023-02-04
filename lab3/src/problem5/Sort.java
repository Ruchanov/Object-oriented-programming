package problem5;

public class Sort implements Cloneable{
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	static <E> void swap(E [] array, int i, int j) {
		E temp = (E) array[i];
        array[i] = array[j];
        array[j] = temp;
        
	}
	static <E extends Comparable<E>> void bubbleSort(E [] array) {
		 int n = array.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (array[j].compareTo(array[j+1]) == 1) //array[j] > array[j+1] 
	                {
	                    swap(array,j,j+1);
	                }
	}
	static <E extends Comparable<E>> int partition(E [] arr, int low, int high)
    {
        E pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[high].compareTo(arr[j]) == 1) //arr[j] <= pivot
            {
                i++;
 
                // swap arr[i] and arr[j]
                swap(arr, i , j);
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        swap(arr, i + 1,high);
 
        return i+1;
    }
	static <E extends Comparable<E>> void quickSort(E [] array, int low, int high) {
//		int low = 0;
//		int high = array.length;
		if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(array, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
	}
	
}

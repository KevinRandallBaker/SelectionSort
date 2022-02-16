
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6, 8, 2, 1, 9};
		System.out.print("array before selectionSort:");
		printArray(array);
		
		array = selectionSort(array);
		
		System.out.print("array after selectionSort:");
		printArray(array);

	}
	
	public static int[] selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			
			int highest = Integer.MAX_VALUE;
			int highIdx = -1;
			
			for(int j = i; j < array.length; j++) {
				if(array[j] < highest) {
					highIdx = j;
					highest = array[j];
				}
			}
			
			swap(array, i , highIdx);
		}
		
		
		return array;
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void printArray(int[] array) {
		
		for(int elem : array) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

}

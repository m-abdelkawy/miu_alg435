package lab3.submittal;

/*
 * The running time is O(n) in the best case
 * for the worst case the running time is enhanced with every iteration
 * so that it skips one element from the last from comparison with every iteration
 * of the outer loop so that its running time reaches O(n * (n + 1)/2)
 */

public class BubbleSort2 {
	
	void sort(int[] arr) {
		boolean isSwapped;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			isSwapped = false;
			for (int j = 0; j < len - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					isSwapped = true;
				}
			}
			if(!isSwapped) break;
		}
	}
	
	void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	void display(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {9,7,3,1,2,5};
		BubbleSort2 bSort = new BubbleSort2();
		bSort.display(arr);
		bSort.sort(arr);
		bSort.display(arr);
		
		System.out.println();
		
		int[] arr2 = {10,20,30,40,50,60,70,80,90};
		bSort.display(arr2);
		bSort.sort(arr2);
		bSort.display(arr2);
	}

}

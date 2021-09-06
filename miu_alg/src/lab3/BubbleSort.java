package lab3;

public class BubbleSort {
	/*
	 * sort() running time: Theta(n2) - no best case
	 * sortImproved1() running time O(n) for best case (the input array is sorted)
	 * sortImproved1() running time O(n2/2) for worst case and O(n) for best case
	 */
	void sort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if(arr[j]> arr[j+1] ) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	void sortImproved1(int[] arr) {
		boolean isSwapped;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			isSwapped = false;
			for (int j = 0; j < len - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					isSwapped = true;
				}
			}
			if(!isSwapped) break;
		}
	}
	
	void sortImproved2(int[] arr) {
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
		BubbleSort bSort = new BubbleSort();
		bSort.display(arr);
		bSort.sort(arr);
		bSort.display(arr);
		
		System.out.println();
		
		int[] arr2 = {10,20,30,40,50,60,70,80,90};
		bSort.display(arr2);
		bSort.sortImproved1(arr2);
		bSort.display(arr2);
	}

}

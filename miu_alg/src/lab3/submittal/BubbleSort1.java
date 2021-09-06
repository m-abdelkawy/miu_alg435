package lab3.submittal;

import lab3.BubbleSort;

public class BubbleSort1 {

	void sort(int[] arr) {
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
		BubbleSort1 bSort = new BubbleSort1();
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

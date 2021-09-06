package lab3.submittal;

public class ZeroOneTwoSort {

	void sort(int[] arr) {
		int len = arr.length;
		int zeros = 0;
		int ones = 0;
		int twos = 0;

		for (int i = 0; i < len; i++) {
			if (arr[i] == 0)
				zeros++;
			else if (arr[i] == 1)
				ones++;
		}

		for (int i = 0; i < len; i++) {
			if (i < zeros)
				arr[i] = 0;
			else if (i < (zeros+ones))
				arr[i] = 1;
			else
				arr[i] = 2;
		}
	}
	
	void display(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]={0,2,1,2,0,1,0,2,0,1,0};
		ZeroOneTwoSort sorting = new ZeroOneTwoSort();
		System.out.println("Before Sorting: ");
		sorting.display(arr);
		
		sorting.sort(arr);
		System.out.println("After Sorting: ");
		sorting.display(arr);
	}

}



public class Sorter {

	public static void main(String[] args) {
		int[] arr = {11,2,12,22,10,99,0,1,50,25,0};
		System.out.print("Array before sorting ");
		Sort.printArray(arr);
		Sort.MergeSort(arr);
		System.out.print("Array after sorting ");
		Sort.printArray(arr);

	}

}

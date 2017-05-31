

public class Sort {
	
	public static void BubbleSort(int[] arr){
		System.out.println("Bubble sorting");
		for(int i=0;i<arr.length-1; i++){
			boolean swap = false;
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if (swap==false)
				break;
			printArray(arr);
		}
	}
	
	public static void SelectionSort(int[] arr){
		System.out.println("Selection sort");
		for(int i = 0; i < arr.length; i++){
			int iMin = i;
			for(int j=i; j < arr.length; j++){
				if(arr[j]<arr[iMin])
					iMin = j;
			}
			if(iMin!=i){
				int temp = arr[iMin];
				arr[iMin] = arr[i];
				arr[i] = temp;
			}
			printArray(arr);
		}
	}
	
	public static void InsertionSort(int[] arr){
		System.out.println("Insertion Sort");
		for(int i =1; i<arr.length;i++){
			int hole = i;
			int temp = arr[hole];
			for(int j=hole-1;j>=0;j--){
					if(arr[j]>temp){
						arr[hole] = arr[j];
						hole = j;	
					}
				}
			arr[hole]= temp;
		}
	}

	private static void merge(int[] arr, int l, int m, int r){
		int i=l;
		int j=m+1;
		int k=0;
		
		int[] temp = new int[r-l+1];
		
		
		while(i<=m && j<=r){
			if(arr[i]<arr[j])
			{
				temp[k] = arr[i];
				i++;
			}
			else{
				temp[k] = arr[j];
				j++;
				}
			k++;
		}
		while(i<=m){
			temp[k] = arr[i];
			i++;
			k++;
		}
		while(j<=r){
			temp[k] = arr[j];
			j++;
			k++;
		}
		int a=l;
		for(int item:temp){
			arr[a] = item;
			a++;
		}
		
	}
	
	public static void MergeSort(int[] arr){
		System.out.println("Merge Sort");
		MergeSort(arr, 0, arr.length-1);
	}
	
	private static void MergeSort(int[] arr, int l, int r){
		if(l>=r){
			return;
		}else{
		int m = l + (r-l)/2;
		MergeSort(arr, l, m);
		MergeSort(arr, m+1, r);
		merge(arr, l,m, r);
		}
		
	}
	
	private static int partition(int[] arr, int start, int end){
		int pivot = arr[end];
		int pIndex = start;
		//Choose the last element as pivot
		for(int i =start; i<=end-1;i++){
			if(arr[i]<=pivot){
				int temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				pIndex++;
			}
		}
		arr[end] = arr[pIndex];
		arr[pIndex] = pivot;
		return pIndex;
	}
	
	public static void QuickSort(int[] arr){
		System.out.println("Quick Sort");
		QuickSort(arr, 0, arr.length-1);
	}
	private static void QuickSort(int[] arr, int start, int end){
		if(start< end){
			int pIndex = partition(arr, start, end);
			QuickSort(arr, start, pIndex-1);
			QuickSort(arr, pIndex+1, end);
		}
	}
	
	public static void printArray(int[] arr){
		for(int i:arr){
		System.out.print(i+" ");
		}
		System.out.println();
	}
}

import java.util.*;
public class QuickSort {
	public static void main(String[] args) {
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
 
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int pivot = arr[high];
 
	    int left = low;
	    int right = high;

		while (left<right) 
		{
		while (arr[left] < pivot && left < right) {left++;}
		while (arr[right] >= pivot && right > left) {right--;}
		//if (left == right) {break;}
		swap(arr, left, right);
	    }
	    swap(arr, left, high);
 
		// recursively sort two sub parts
		quickSort(arr, low, left-1);
		quickSort(arr, left+1, high);
	}
	public static void swap(int[] arr, int n1, int n2) 
	{
	int tmp = arr[n1];
	arr[n1] = arr[n2];
	arr[n2] = tmp;
    }
}
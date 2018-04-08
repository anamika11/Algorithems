package com.algorithm.sort;

public class MergeSortApp {

	public static void sort(int a[]) {
		sort(a, 0, a.length-1);
	}
	
	public static void sort(int a[], int start, int end){
		if(end <= start){
			return;
		}
		int mid =(start+end)/2;
		sort(a, start, mid);
		sort(a, mid+1, end);
		mergeSort(a,start,mid,end);
	}

	private static void mergeSort(int[] a, int start, int mid, int end) {
		int tempArray[]=new int[end-start +1];
		
		int firstSlot=start;
		int secondSlot = mid+1;
		int k=0;
		
		while(firstSlot<= mid && secondSlot <= end){
			if(a[firstSlot]<a[secondSlot]){
				tempArray[k]=a[firstSlot];
				firstSlot=firstSlot+1;
			}else{
				tempArray[k]=a[secondSlot];
				secondSlot=secondSlot+1;
			}
			k=k+1;
		}
		
		if(firstSlot<=mid){
			while(firstSlot<=mid){
				tempArray[k]=a[firstSlot];
				firstSlot=firstSlot+1;
				k=k+1;
			}
		}
		else if(secondSlot<=end){
			while(secondSlot<=end){
				tempArray[k]=a[secondSlot];
				secondSlot=secondSlot+1;
				k=k+1;
			}
		}
		
		for (int i = 0; i < tempArray.length; i++) {
			a[start+i]=tempArray[i];
		}
		
	}

	

}

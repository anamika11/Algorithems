package com.algorithm.sort;

public class SelectionSort {

	public static void main(String[] args) {
		//int []n = {56,2,34,89,12,46};
		//selectionSort(n);
		int [] sortedArray = selectionSort(new int []{56,2,34,89,12,46});
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

	public static int[] selectionSort(int [] arrayToSort){
		
		for (int i = 0; i < arrayToSort.length; i++) {
			int minimum=i;
			for (int j = i+1; j < arrayToSort.length; j++) {
				if(arrayToSort[j]<arrayToSort[minimum]){
					minimum=j;
				}
			}
			int temp=arrayToSort[i];
			arrayToSort[i]=arrayToSort[minimum];
			arrayToSort[minimum]=temp;
		}
		
		return arrayToSort;
	}
}

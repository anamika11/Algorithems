package com.algorithm.sort;

public class InsertionSort {
public static void main(String[] args) {
int b[]=	insertionSort(new int[] {34,23,6,89,12,99});
for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);
}
}
	


public static int[] insertionSort(int []a){
	for (int i = 1; i < a.length; i++) {
		int element= a[i];
		int j=i-1;
		while(j>=0 && a[j]> element){
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=element;	
		}
	
	return a;
}
}

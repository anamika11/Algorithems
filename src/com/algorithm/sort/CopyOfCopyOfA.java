package com.algorithm.sort;

public class MergeSortMain {

	public static void main(String[] args) {
     int [] a = {8,5,78,56,99,12,45,65,34,25,9};
		MergeSortApp sorter= new MergeSortApp();
		sorter.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

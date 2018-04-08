package com.algorithm.search;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		int a[]={10,20,45,60,65,70,78,80,90,92,96};
		System.out.print(recursiveLinearSearch(a,0,a.length-1,45));
	}

	
	public static int recursiveLinearSearch(int[] search,int p,int r, int x){
		System.out.println("[ "+p+"..."+r+" ]");
		if(p>r){
			return -1;
		}else{
			int q=(p+r)/2;
			if(search[q]>x){
				return recursiveLinearSearch(search, p, q-1, x);
			}else if(search[q]<x){
				return recursiveLinearSearch(search, q+1, r, x);
			}else{
				return q;
			}
		}
	}
}

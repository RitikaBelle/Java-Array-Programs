package com.kn.utubeArrayPrograms;

public class FindSecondLargestSmallestNumber {

	public static void main(String[] args) {
		int temp;
		int[] a = {6,8,9,2,4,7,5};
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
//				finding second largest element
//				if(a[i]<a[j]) {
//					temp = a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//				}
//				finding second smallest element
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
//		System.out.println("second largest element is "+a[1]);
		System.out.println("second smallest element is "+a[1]);
	}
 
}

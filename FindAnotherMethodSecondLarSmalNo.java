package com.kn.utubeArrayPrograms;

public class FindAnotherMethodSecondLarSmalNo {

	public static void main(String[] args) {
		int[] a = {600,80,2,4,3,1,5,7,9,10};
//		int largest  = Integer.MIN_VALUE;
//		int second_largest = Integer.MIN_VALUE;
//		for(int i =0;i<a.length;i++) {
//			if(a[i]>largest) {
//				second_largest = largest;
//				largest=a[i];
//			}
//			else if(a[i]>second_largest && a[i] != largest) {
//				second_largest = a[i];
//			}
//		}
//		if(second_largest == Integer.MIN_VALUE) {
//			System.out.println("there is no second largest element");
//		}
//		else {
//			System.out.println("Second largest element is "+second_largest);
//		}
		
		int smallest  = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		for(int i =0;i<a.length;i++) {
			if(a[i]<smallest) {
				second_smallest = smallest;
				smallest=a[i];
			}
			else if(a[i]<second_smallest && a[i] != smallest) {
				second_smallest = a[i];
			}
		}
		if(second_smallest == Integer.MAX_VALUE) {
			System.out.println("there is no second largest element");
		}
		else {
			System.out.println("Second smallest element is "+second_smallest);
		}
	}

}
  
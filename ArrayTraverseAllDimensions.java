package com.kn.utubeArrayPrograms;

public class ArrayTraverseAllDimensions {

	public static void main(String[] args) {
		// ARRAY 1-D
		System.out.println("ARRAY 1-D");
		int a[] = { 10, 20, 30 };
		for (int i = 0; i <= 2; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("ARRAY 2-D");

//		ARRAY 2-D
		int b[][] = { { 10, 20 }, { 30, 40, 50 } };
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

//		ARRAY 3-D
		System.out.println("ARRAY 3-D");
		int c[][][] = { { { 10, 20 }, { 30, 40, 50 }, { 60, 70, 80 }, { 90, 100 } } };
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int k = 0; k < c[i][j].length; k++) {
					System.out.print(c[i][j][k] + " ");
				}
				System.out.println(" ");
			}
		}
		System.out.println(" ");

		// ARRAY 4-D
		System.out.println("ARRAY 4-D");
		int d[][][][] = { { { { 10, 20, 30 }, { 40, 50 }, { 60, 70 }, { 80, 90, 100 } } } };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				for (int k = 0; k < d[i][j].length; k++) {
					for (int l = 0; l < d[i][j][k].length; l++) {
						System.out.print(d[i][j][k][l]+" ");
					}
					System.out.println(" ");
				}
			}
		}

	}
}

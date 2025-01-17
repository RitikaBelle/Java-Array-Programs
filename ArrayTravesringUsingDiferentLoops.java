package com.kn.utubeArrayPrograms;

public class ArrayTravesringUsingDiferentLoops {

	public static void main(String[] args) {
//		Uisng only 1-D Array
//      Using FOR LOOP
		System.out.println("1-D ARRAY");
		System.out.println("USING FOR LOOP");
		int[] a = { 10, 20, 30 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		System.out.println(" ");

//     USING 2-D ARRAY
//     Using FOE EACH LOOP
		System.out.println("2-D ARRAY");
		System.out.println("USING FOR EACH LOOP");
		int b[][] = { { 10, 20 }, { 30, 40, 50 } };
		for (int[] i : b) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

//      USING 3-D ARRAY
//      USING WHILE LOOP		
		System.out.println(" ");
		System.out.println("3-D ARRAY");
		System.out.println("USING WHILE LOOP");
		int c[][][] = { { { 10, 20 }, { 30, 40, 50 }, { 60, 70, 80 }, { 90, 100 } } };
		int i = 0;
		while (i < c.length) {
			int j = 0;
			while (j < c[i].length) {
				int k = 0;
				while (k < c[i][j].length) {
					System.out.print(c[i][j][k] + " ");
					k++;
				}
				System.out.println();
				j++;
			}
			System.out.println();
			i++;
		}

		System.out.println(" ");
		System.out.println("4-D ARRAY");
		System.out.println("USING DO WHILE LOOP21");
		// Define the given 4D array
		int d[][][][] = { { // Block 0
				{ // Layer 0
						{ 10, 20, 30 }, // Row 0
						{ 40, 50 }, // Row 1
						{ 60, 70 }, // Row 2
						{ 80, 90, 100 } // Row 3
				} } };

		// Indices for the 4D array
		int bb = 0;
		do {
			int l = 0;
			do {
				int r = 0;
				do {
					int cc = 0;
					do {
						// Print each element
						System.out.print(d[bb][l][r][cc] + " ");
						cc++;
					} while (cc < d[bb][l][r].length); // Loop through columns
					System.out.println(); // Move to the next row
					r++;
				} while (r < d[bb][l].length); // Loop through rows
				System.out.println("---- End of Layer " + l + " ----");
				l++;
			} while (l < d[bb].length); // Loop through layers
			System.out.println("==== End of Block " + bb + " ====");
			bb++;
		} while (bb < d.length); // Loop through blocks
	}
}

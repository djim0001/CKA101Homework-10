package hw5;

import java.util.Arrays;

public class Work03 {

	public static void main(String[] args) {
	
	int[][] intArray = {
			{1, 6, 3},
			{9, 5, 2}
	};
	double[][] doubleArray = {
			{1.2, 3.5, 2.2},
			{7.4, 2.1, 8.2}
	};
	Work03 w = new Work03();	
	System.out.println(w.maxElement(intArray));
	System.out.println(w.maxElement(doubleArray));
	
	}
	
	int maxElement(int x[][]) {
		int element[] = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			element[i] = x[i][x[i].length - 1];
		}
		Arrays.sort(element);
		return element[element.length - 1];
		
	}
	double maxElement(double x[][]) {
		double element[] = new double[x.length];
		for(int i = 0; i < x.length; i++) {
			Arrays.sort(x[i]);
			element[i] = x[i][x[i].length - 1];
		}
		Arrays.sort(element);
		return element[element.length - 1];
		
	}
	
}

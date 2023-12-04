package interview;

import java.util.Arrays;

public class ArraysPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[3][3];
		
		array[0][0] = 2;
		array[0][1] = 3;
		array[0][2] = 4;
		
		array[1][0] = 5;
		array[1][1] = 6;
		array[1][2] = 7;
		
		array[2][0] = 2;
		array[2][1] = 4;
		array[2][2] = 9;
		
		System.out.println(Arrays.deepToString(array));
		
	}

}

package com.kh.run;

public class BubbleSortRun {

	public static void main(String[] args) {
		
		int[] arr = {22,99,30,68,87,1,3};
		int temp = 0 ;  // 대기실
		
		for (int j = 1; j < arr.length; j++) { // 앞뒤 숫자비교(전체반복)
			for( int i = 0; i< arr.length; i++) {
				if( arr[j-1]> arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

package com.example;

import java.util.Arrays;

public class Greetings {

	public static void main(String[] args) {
		System.out.println("Hello Ryzen 5.......");

		int arr[] = { 66, 77, 33, 44, 21, 23, 34, 55, 2, 3, 88, 99 };
		System.out.println("Array => " + Arrays.toString(arr));
		reverseArray(arr);
	}

	public static void reverseArray(int[] arr) {

		int length = arr.length;

		for (int pos = 0, revPos = length - 1; pos < (length/2); pos++, revPos--) {

			System.out.println("Before pos :" + pos + "===" + arr[pos]);
			System.out.println("After revPos :" + revPos + "===" + arr[revPos]);
			
			int temp = arr[pos];
			arr[pos] = arr[revPos];
			arr[revPos] = temp;

			System.out.println("pos :" + pos + "===" + arr[pos]);
			System.out.println("revPos :" + revPos + "===" + arr[revPos]);
		}
		System.out.println("Reverse array => " + Arrays.toString(arr));

	}
}

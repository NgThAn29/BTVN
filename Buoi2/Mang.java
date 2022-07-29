package Buoi2;

import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		//Cách xuất thứ 1:
//		for(int i = 0; i< n; i++) {
//			System.out.print(arr[i] + "   ");
//		}
		//Cách xuất thứ 2:
		for(int i : arr) {
			System.out.print(i + "   ");
		}
		
	}
}

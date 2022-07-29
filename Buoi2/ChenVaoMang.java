package Buoi2;

import java.util.Scanner;

public class ChenVaoMang {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao so luong phan tu mang: ");
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		for(int i : a) {
			System.out.print(i + "   ");
		}
		for(int i : newArr) {
			System.out.print(i + "   ");
		}
	}
		
	public static int[] Delete(int a[], int pos) {
		int newArr[] = new int[a.length - 1];
		for(int i = 0; i < pos - 1; i++) {
			newArr[i] = a[i];
		}
		for(int i = pos; i < a.length; i++) {
			newArr[i-1] = a[i];
		}
		return newArr;
	}
}
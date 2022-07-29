package Buoi2;

import java.util.Scanner;

public class HamTrongJava {
	public static void main(String[] args) {
//		//Cú pháp của hàm trong Java:
//		//		modifier returnType
//					nameMethod (Parameter) {
//						//body
//					}
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
		CheckPrime(a,n);
	}
	public static Boolean Check(int n) {
		if(n < 2) {
	        return false;
	    }
	    else {
	        for(int i = 2; i <= Math.sqrt(n); i++) {
	            if(n % i == 0) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	public static void CheckPrime(int a[], int n) {
		System.out.print("\nCac so nguyen to la : ");
		for(int i : a) {
			if(Check(i)) {
				System.out.print(i + "   ");
			}
		}
	}
}	

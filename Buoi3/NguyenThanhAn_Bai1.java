package Buoi3;

import java.util.Scanner;

public class NguyenThanhAn_Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap so phan tu co trong mang: ");
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		for(int i : a) {
			System.out.print(i + "   ");
		}
		TinhTBC(a);
		PosMin(a);
		SoCP(a);
		Prime(a);
		Sort(a);
		sc.close();
	}
	public static void TinhTBC(int a[]) {
		int tbc = 0, dem = 0;
		for(int i = 0; i < a.length; i++) {
			if(i % 2 == 0) {
				if(a[i] % 2 == 1) {
					tbc = tbc + a[i];
					dem = dem + 1;
				}
			}
		}
		float Value = tbc/dem;
		System.out.println("\nTrung binh cong cac so le o vi tri chan = "+ Value);
	}
	public static void PosMin(int a[]) {
		int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
            	min = a[i];
            }
        }
        System.out.print("Vi tri cac so nho nhat trong mang la: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
            	System.out.print(i+ " ");
            }
        }
        System.out.println();
	}
	public static void SoCP(int a[]) {
		int dem = 0;
	    int temp = 0;
	    for(int i = 0; i < a.length; i++) {
	        temp = (int)Math.sqrt(a[i]);
	        if(a[i] == Math.pow(temp,2)) {
	            dem++;
	           }
	       } 
	    if(dem==0) {
	       System.out.print("Mang khong co so chinh phuong !");
	    } else {
	        System.out.print("Trong mang co cac so chinh phuong la: ");
	    }
	    for(int i=0; i < a.length; i++) {
	        if((Math.sqrt((double)a[i]) % 1 == 0) && a[i] > 0) {
             System.out.print(a[i] + " ");
	         }
	    }
	    System.out.println();
	}
	public static void Prime(int a[]) {
		System.out.print("Cac so nguyen to trong mang la: ");
		int dem = 0, temp = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 1; j <= a[i]; j++) {
                if(a[i] >= 2 & a[i] % j == 0 ) {
                    dem++;
                }
            }
            if(dem==2) {
                System.out.print(a[i] + " ");
                temp++;
            }
            dem=0;
        }
        if (temp == 0 ) {
            System.out.print("Khong co so nguyen to nao! ");
        }
        System.out.println();
	}
	public static void Sort(int a[]) {
		int temp;
		for(int i = 0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Cac phan tu trong mang sau khi sap xep la: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " " );
        }
    }
}

package Buoi5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP SO PHONG MAY: ");
        int n = sc.nextInt();
        PhongMay phongmay[] = new PhongMay[n];
        for(int i = 0; i < n; i++) {
            System.out.println("----------------------------------------");
            System.out.println("NHAP THONG TIN PHONG MAY THU " + (i+1));
            phongmay[i] = new PhongMay();
            phongmay[i].input();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------------");
            System.out.println("THONG TIN PHONG MAY THU " + (i+1));
            phongmay[i].output();
        }
    }
}
package Buoi5;

import java.util.Scanner;

public class main {
    static int n;
    static Student s[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("NHAP SO SINH VIEN: ");
        n = sc.nextInt();
        s = new Student[n];
        for(int i = 0; i < n; i++) {
            System.out.println("--------------------------------------------");
            System.out.println("NHAP THONG TIN SINH VIEN THU " + (i+1));
            s[i] = new Student();
            s[i].input();
        }

        System.out.println("--------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------------------");
            System.out.println("THONG TIN SINH VIEN THU " + (i+1));
            s[i].output();
        }

        System.out.println("--------------------------------------------");
        System.out.println("NHAP ID SINH VIEN CAN TIM: ");
        int ID1 = sc.nextInt();
        searchID(s,ID1);

        System.out.println("--------------------------------------------");
        change(s);

        System.out.println("--------------------------------------------");
        System.out.println("NHAP ID SINH VIEN CAN XOA");
        int ID2 = sc.nextInt();
        deleteStudentByID(s, ID2);
    }

    public static void searchID(Student s[], int ID) {
        for(int i = 0 ; i < s.length; i++) {
            if(s[i].getId() == ID) {
                s[i].output();
            }else {
                System.out.println("KHONG TON TAI SV CO ID NAY");
            }
        }
    }

    public static void change(Student students[]) {
        for (int i = 0; i < s.length; i++) {
            if (students[i].getAddress().getProvince().equals("Thanh Hoa")) {
                students[i].getAddress().setProvince("Hai Phong");
            }
        }
    }

    public static void deleteStudentByID(Student s[], int ID) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == ID) {
                for (int j = i; j < s.length; j++) {
                    s[i] = s[i + 1];
                }
            }
        }
        for(int i = 0; i < s.length; i++) {
            s[i].output();
        }
    }
}
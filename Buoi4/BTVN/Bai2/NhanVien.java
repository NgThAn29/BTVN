package Buoi4;

import java.util.Scanner;

public class NhanVien {
	private static int temp = 1;
    private int maNv;
    private String ten;
    private int tuoi;
    private String diaChi;
    private String boPhan;
        
    public static Scanner sc = new Scanner(System.in);
    
    public void Input() {
    	maNv = temp++;
		System.out.println("Nhap ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		tuoi = sc.nextInt();
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhap bo phan: ");
		boPhan = sc.nextLine();
    }
    public void Output() {
        System.out.printf("%-10d%-10s%-10d%-10s%-10s\n", maNv, ten, tuoi, diaChi, boPhan);
    }
    
    public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		NhanVien nv2 = new NhanVien();
		NhanVien nv3 = new NhanVien();
		NhanVien nv4 = new NhanVien();
		NhanVien nv5 = new NhanVien();
		nv1.Input();
		nv2.Input();
		nv3.Input();
		nv4.Input();
		nv5.Input();
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "STT", "TenNV", "Tuoi", "DiaChi", "BoPhan");
        nv1.Output();
        nv2.Output();
        nv3.Output();
        nv4.Output();
        nv5.Output();
    }
}
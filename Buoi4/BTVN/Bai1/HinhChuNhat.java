package Buoi4;

import java.util.Scanner;

public class HinhChuNhat {
	private int ChieuDai;
	private int ChieuRong;

	public static Scanner sc = new Scanner(System.in);

	// Cách 1:
	public void Input() {
		System.out.print("Nhap chieu dai: ");
		ChieuDai = sc.nextInt();
		System.out.print("Nhap chieu rong: ");
		ChieuRong = sc.nextInt();
	}

	public void Output() {
		System.out.println("Dien tich cua hinh chu nhat la: " + ChieuDai * ChieuRong);
		System.out.println("Chu vi cua hinh chu nhat la: " + (ChieuDai + ChieuRong) * 2);
	}

	//Cách 2:
	public int getChieuDai() {
		return ChieuDai;
	}

	public void setChieuDai(int chieuDai) {
		ChieuDai = chieuDai;
	}

	public int getChieuRong() {
		return ChieuRong;
	}

	public void setChieuRong(int chieuRong) {
		ChieuRong = chieuRong;
	}
	public static void main(String[] args) {
		HinhChuNhat mot = new HinhChuNhat();
		mot.Input();
		mot.Output();
		HinhChuNhat hai = new HinhChuNhat();
		hai.setChieuDai(5);
		System.out.println("Chieu dai la: " + hai.getChieuDai());
		hai.setChieuRong(4);
		System.out.println("Chieu rong la: " + hai.getChieuRong());
		System.out.println("Dien tich cua hinh chu nhat la: " + hai.getChieuDai()*hai.getChieuRong());
		System.out.println("Chu vi cua hinh chu nhat la: " + (hai.getChieuDai() + hai.getChieuRong()) * 2);
	}
}

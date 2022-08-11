package Buoi5;

import java.util.Scanner;

public class DiaChi {
	
	private static Scanner sc = new Scanner(System.in);
	
	private String quan;
	private String huyen;
	private String tinh;
	
	
	public String getQuan() {
		return quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public String getHuyen() {
		return huyen;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	
	public void Input() {
		System.out.println("Nhap vao quan: ");
		quan = sc.nextLine();
		System.out.println("Nhap vao huyen: ");
		huyen = sc.nextLine();
		System.out.println("Nhap vao tinh: ");
		tinh = sc.nextLine();
	}
	public void Output() {
		System.out.println("Quan: " +quan);
		System.out.println("Huyen: " +huyen);
		System.out.println("Tinh: " +tinh);
	}
	
	public static void main(String[] args) {
		DiaChi diaChi = new DiaChi();
		diaChi.Input();
		diaChi.Output();
	}
}

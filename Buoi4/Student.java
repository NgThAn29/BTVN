package Buoi4;

import java.util.Scanner;

public class Student {
	private long MaSV;
	private int Age;
	private int Khoa;
	private String Nganh;
	
	public static Scanner sc = new Scanner(System.in);
	//Cach 1:
	public void Input() {
		System.out.println("Nhap ma SV: ");
		MaSV = sc.nextLong();
		System.out.println("Nhap so tuoi: ");
		Age = sc.nextInt();
		System.out.println("Nhap khoa hoc: ");
		Khoa = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap nganh dang hoc: ");
		Nganh = sc.nextLine();
	}
	public void Output( ) {
		System.out.printf("%-20s%-20s%-20s%-20s\n", "Ma Sinh Vien", "Tuoi", "Khoa", "Nganh");
		System.out.printf("%-20d%-20d%-20d%-20s", MaSV, Age, Khoa, Nganh);
	}
	
	//Cach 2:
	public long getID() {
		return MaSV;
	}
	public void setID(long ID) {
		MaSV = ID;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Tuoi) {
		Age = Tuoi;
	}
	public int getKhoa() {
		return Khoa;
	}
	public void setKhoa(int Khoa1) {
		Khoa = Khoa1;
	}
	public String getNganh() {
		return Nganh;
	}
	public void setNganh(String Nganh1) {
		Nganh = Nganh1;
	}
	public static void main(String[] args) {
		Student mot = new Student();
		mot.Input();
		mot.Output();
		Student hai = new Student();
		hai.setID(2021605088);
		System.out.println("\nMa SV: " + hai.getID());
		hai.setAge(19);
		System.out.println("Tuoi: " + hai.getAge());
		hai.setKhoa(16);
		System.out.println("Khoa hoc: " + hai.getKhoa());
		hai.setNganh("CNTT");
		System.out.println("Nganh dang hoc: " + hai.getNganh());
	}
}

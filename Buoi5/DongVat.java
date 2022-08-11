package Buoi5;

import java.util.Scanner;

public class DongVat {
	private static Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private String gioitinh;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public void Input() {
		System.out.println("Nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gioitinh = sc.nextLine();
	}
	
	public void Output() {
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("GioiTinh: " +gioitinh);
	}
	
	public static void main(String[] args) {
		DongVat a = new DongVat();
		
		DongVat obj[] = new DongVat[3];
		
		obj[0] = new DongVat(); 
		obj[1] = new DongVat(); 
		obj[2] = new DongVat(); 
		
//		obj[0].Input();
//		obj[1].Input();
//		obj[2].Input();
//		
//		obj[0].Output();
//		obj[1].Output();
//		obj[2].Output();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Nhap doi tuong thu " +(i+1));
			obj[i].Input();
		}
		for(int i = 0; i < 3; i++) {
			obj[i].Output();
			System.out.println("*************");
		}
	}
	
}

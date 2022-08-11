package Buoi5;

import java.util.Scanner;

public class Nguoi {
	private static Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private DiaChi diaChi = new DiaChi();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DiaChi getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(DiaChi diaChi) {
		this.diaChi = diaChi;
	}

	public void Input() {
		System.out.println("Nhap vao ten: ");
		name = sc.nextLine();
		System.out.println("Nhap vao tuoi");
		age = sc.nextInt();
		sc.nextLine();
		diaChi.Input();
	}
	
	public void Output() {
		System.out.println("Ten: " + name);
		System.out.println("Tuoi: " + age);
		diaChi.Output();
	}
	public static void main(String[] args) {
		Nguoi a = new Nguoi();
		a.Input();
		a.Output();
	}	
}

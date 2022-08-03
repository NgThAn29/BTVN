package Buoi4;

import java.util.Scanner;

public class Animal {	
	private static Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private String gender;
	
	//modifer: mức độ truy cập: private public protected default
	
//	Animal(String names, int ages, String gender) {
//		name = names;
//		age = ages;
//		gender = genders;
//	}
	public void input() {
		
		System.out.println("Nhap ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gender = sc.nextLine();
	}
	public void eat() {
		System.out.println("An");
	}
	public void sleep() {
		System.out.println("Ngu");
	}
	public void play() {
		System.out.println("Di choi");
	}
	public String getName() {
		return name;
	}
	public void setName(String names) {
		name = names;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int ages) {
		age = ages;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String genders) {
		name = genders;
	}
	public void Output() {
		System.out.printf("%-10s%-10s%-10s\n" , "Name" , "Age" , "Gender");
		System.out.printf("%-10s%-10d%-10s" , name , age , gender);
	}
	public static void main(String[] args) {
		Animal cat = new Animal();
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
		cat.input();
		cat.Output();
//		Animal dog = new Animal();
//		System.out.println("Nhap vao ten cua con vat: ");
//		dog.setName("Milu");
//		System.out.println("Name: " +dog.getName());
//		dog.setAge(2);
//		System.out.println("Age: " +dog.getAge());
		
	}
}


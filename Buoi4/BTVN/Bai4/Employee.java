package Buoi4;

import java.util.Scanner;

public class Employee {

	public static Scanner sc = new Scanner(System.in);

	private String id;
	private String name;
	private int age;
	private int workingDay;
	private double salary;
	private static int PRICE = 50;
	
	Employee(String id, String name, int age, int workingDay){
		this.id = id;
		this.name = name;
		this.age = age;
		this.workingDay = workingDay;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public int getWorkingDay() {
		return workingDay;
	}
	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}
	public double getSalary1() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getWorkingsDay() {
		return workingDay;
	}
	public double getSalary() {
		return workingDay*PRICE;
	}
	
	public void Input() {
		System.out.print("Nhap id: ");
		id = sc.nextLine();
		System.out.print("Nhap ten: ");
		name = sc.nextLine();
		System.out.print("Nhap tuoi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap so ngay lam viec: ");
		workingDay = sc.nextInt();
	}
	public void Output() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("WorkingDay: " + workingDay);
		System.out.println("Salary: " + getSalary() + " Dola :>>>>> :3");
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("1","An",11,4); 
		e1.Output();
		Employee e2 = new Employee();
		e2.Input();
		e2.Output();
	}
}

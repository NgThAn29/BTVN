package Buoi4;

import java.util.Scanner;

public class PtBac2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	private int a;
	private int b;
	private int c;
	
	public void Input() {
		System.out.println("Nhap lan luot 3 nghiem a, b, c = ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
	}
	private void Output() {
		int Delta = (b*b) - (4*a*c);
		if(Delta == 0) {
			System.out.println("Phuong trinh nay co nghiem duy nhat: x = " + (-b/(2*a)));
		} else if(Delta > 0) {
			System.out.println("Phuong trinh nay co 2 nghiem phan biet: " );
            System.out.println("x1 = " + ((-b + Math.sqrt(Delta))/(2*a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(Delta))/(2*a)));
		} else {
            System.out.println("Phuong trinh nay vo nghiem !");
        }
	}
	public static void main(String[] args) {
		PtBac2 PtBac2a = new PtBac2();
		PtBac2a.Input();
		PtBac2a.Output();
	}
}

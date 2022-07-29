package Buoi3;

import java.util.Scanner;

import Buoi4.main;

public class ChuaBai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap: ");
		String s = sc.nextLine();
		System.out.println("Chuoi sau khi nhap: " + s);
		// Xóa các khoảng trống thừa đầu và cuối chuỗi.
		s =s.trim();
		//In thường các kí tự.
		s = s.toLowerCase();
		System.out.println("Chuoi sau khi fix: " + s);
		//Thay thế các khoảng trắng ở giữa.
		s = s.replace(0, 0);
		//Tách chuỗi thành các mảng của chuỗi
		String[] temp = s.split();
		//Gắn chuỗi s thành rỗng
		s = "";
		//Viết hoa các chữ cái đầu của mọi từ
		for(int i = 0; i < temp.length; i++) {
			s += String.valueOf(temp[i].charAt(0) + temp[i].substring(i));
		}
		//Xóa kí tự khoảng trắng thừa ở cuối
		s = s.trim();
		//Xóa các ký tự số
		for(int i = 0; i < )
	}
}

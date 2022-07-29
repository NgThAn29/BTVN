
package Buoi2;

import java.util.Locale;
import java.util.Scanner;

import javax.lang.model.util.Elements.Origin;

public class StringTrongJava {
	public static void main(String[] args) {
		//Có 2 kiểu khai báo
		//Cách 1:
//		String str = "Hello moi nguoi";
//		//Cách 2:
//		String str11 = new String("Hello moi nguoi2");
//		System.out.println("Str = " + str);
//		System.out.println("Str2 = " + str11);
		//Nhập dữ liệu:
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao chuoi a: ");
//		String a = sc.nextLine();
//		System.out.println("Chuoi a = " +a);
		//độ dài của chuỗi name.length()
		//Gọi vị trí trong String: name.charAt()
//		System.out.println(a.charAt(2));
		//Nối các String: names1.concat.name2
//		String str1 = "Hello";
//		String str2 = "Moi Nguoi!";
//		str1 = str1.concat(str2);
//		System.out.println("Str1 = " + str1);
		//Substring(int index, int length) : lấy độ dài từ index đến ....
		String str3 = "Hello moi nguoi";
		str3 = str3.substring(2, 8);
		System.out.println("Str3 = " + str3);
		//Viết thường các chữ cái  name.toLowerCase(Locale.ROOT)
		String str = "HeLLo";
		String vt = str.toLowerCase(Locale.ROOT);
		System.out.println("str = " +vt);
		//Viết hoa các chữ cái name.toUpperCase(locale.ROOT)
		String str1 = "hello";
		String vh = str1.toUpperCase(Locale.ROOT);
		System.out.println("str1 = " +vh);
		//CompareTo() : mã ASCCI
		String s1 = "a";
		String s2 = "b";
		int c = s1.compareTo(s2);
		if(c > 0) {
			System.out.println("s1 > s2");
		} else {
			System.out.println("s1 < s2");
		}
	}
}

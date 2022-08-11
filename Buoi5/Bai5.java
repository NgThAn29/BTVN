package Buoi5;

public class Bai5 {
	
    private int a;
    private int b;
    private int c;
    
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	
    
	//**************overloading: 
//	+ số lượng tham số truyền vào phải bằng nhau
//	+ kiểu dữ liệu truyền vào phải khác nhau
	public static void Tong(int a, int b) {
		System.out.println("a + b = " +(a+b));
	}
	
	public static void Tong(int a, float b) {
		System.out.println("a + b = " +(a+b));
	}
	
//	public int Fn(int ...x) {
//		int sum = 0;
//		for(int i : x) {
//			sum = sum + i;
//		}
//		return sum;
//	}
	
	public static void main(String[] args) {
		Tong(3, 2);
		Tong(3, 2.3f);
		Bai5 test = new Bai5();
		System.out.println("Test = " +test.Fn(1,2,3,4,5));
	}
}
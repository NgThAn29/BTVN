import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Buoi1Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        long n = sc.nextLong();
        long t = n;
        for(int i = 1; sqrt(n) >= i; i++) {
            if (n % i == 0) {
            	t += i;
            }
        }
        System.out.println("Tong cac uoc cua n la: " + t);
    } 
}
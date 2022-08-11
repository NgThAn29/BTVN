package Buoi5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        isPrime a = new isPrime();
        System.out.println("So 7 la so nguyen to: " + a.isPrime(7));
        System.out.println("So 11111 la so nguyen to: " + a.isPrime(11111));
        System.out.println("So 2.9 la so nguyen to: " + a.isPrime(2.9));
        System.out.println("So 0.3 la so nguyen to: " + a.isPrime(0.3));
    }
}

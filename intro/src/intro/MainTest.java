package intro;

import java.util.Scanner;

public class MainTest {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// sumOfTwoNumbersAlgorithm1();
		// sumOfTwoNumbersAlgorithm2();
		// sumOfTwoNumbersAlgorithm3();
		// sumOfTwoNumbersSquaresAlgorithm1();
		// sumOfTwoNumbersSquaresAlgorithm2();
		sumOfTwoNumbersSquaresAlgorithm3();
	}

	public static void sumOfTwoNumbersAlgorithm1() {
		// int num1 = 20;
		byte num1 = 20;
		byte num2 = 25;
		// byte num1 = 20, num2 = 25;
		int sum = num1 + num2;
		System.out.println(sum);
		// System.out.println(num1 + num2);
	}
	
	public static void sumOfTwoNumbersAlgorithm2() {
		System.out.print("1. Sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("2. Sayı: ");
		int num2 = scanner.nextInt();
		System.out.println("Sayıların toplamı: " + (num1 + num2));
	}
	
	public static void sumOfTwoNumbersAlgorithm3() {
		int num1 = 0, num2 = 0;
		System.out.print("1. Sayı: ");
		try {
			num1 = scanner.nextInt();
			System.out.print("2. Sayı: ");
			num2 = scanner.nextInt();
			System.out.println(String.format("%d + %d = %d", num1, num2, (num1 + num2)));
		} catch (Exception e) {
			System.out.println("Geçerli bir sayı girilmedi!");
		}
	}
	
	public static void sumOfTwoNumbersSquaresAlgorithm1() {
		System.out.print("1. Sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("2. Sayı: ");
		int num2 = scanner.nextInt();
		System.out.println("Sayıların kareleri toplamı: " + (num1 * num1 + num2 * num2));
	}
	
	public static void sumOfTwoNumbersSquaresAlgorithm2() {
		System.out.print("1. Sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("2. Sayı: ");
		int num2 = scanner.nextInt();
		System.out.println("Sayıların kareleri toplamı: " + (int)(Math.pow(num1, 2) + Math.pow(num2, 2)));
	}
	
	public static void sumOfTwoNumbersSquaresAlgorithm3() {
		System.out.print("1. Sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("2. Sayı: ");
		int num2 = scanner.nextInt();
		int square = (int)(Math.pow(num1, 2) + Math.pow(num2, 2));
		System.out.println(String.format("Sayıların kareleri toplamı: \n%d² + %d² = \n%d + %d = %d", num1, num2, (int)Math.pow(num1, 2), (int)Math.pow(num2, 2), square));
	}
}

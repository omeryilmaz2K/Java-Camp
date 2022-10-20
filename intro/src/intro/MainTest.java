package intro;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MainTest {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// sumOfTwoNumbersAlgorithm1();
		// sumOfTwoNumbersAlgorithm2();
		// sumOfTwoNumbersAlgorithm3();
		// sumOfTwoNumbersSquaresAlgorithm1();
		// sumOfTwoNumbersSquaresAlgorithm2();
		// sumOfTwoNumbersSquaresAlgorithm3();
		// sumOfTwoNumbersSquaresAlgorithm4();
		// sumOfCubesNumbersFrom1to100Algorithm1();
		// sumOfCubesNumbersFrom1to100Algorithm2();
		// sumOfCubesNumbersFrom1to100Algorithm3();
		// sumOfCubesNumbersFrom1to100Algorithm4();
		// calculateDateOfBirth();
		// calculateFactorial();
		// calculateFactorial2();
		// calculateFactorial3();
		// calculateFactorial4();
		// calculateFactorial5();
		// sumInsteadOfMultiplyAlgorithm1();
		// sumInsteadOfMultiplyAlgorithm2();
		// subtractionInsteadOfDivisionAlgorithm1();
		// subtractionInsteadOfDivisionAlgorithm2();
		// subtractionInsteadOfDivisionAlgorithm3();
		// findingTheNumberOfDigitsAlgorithm1();
		// findingTheNumberOfDigitsAlgorithm2();
		// findingTheNumberOfDigitsAlgorithm3();
		sumOfTheCubesOfDigitsOf3DigitNumberAlgorithm1();
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
		System.out.println("Sayıların kareleri toplamı: " + (int) (Math.pow(num1, 2) + Math.pow(num2, 2)));
	}

	public static void sumOfTwoNumbersSquaresAlgorithm3() {
		System.out.print("1. Sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("2. Sayı: ");
		int num2 = scanner.nextInt();
		int square = (int) (Math.pow(num1, 2) + Math.pow(num2, 2));
		System.out.println(String.format("Sayıların kareleri toplamı: \n%d² + %d² = \n%d + %d = %d", num1, num2,
				(int) Math.pow(num1, 2), (int) Math.pow(num2, 2), square));
	}

	public static void sumOfTwoNumbersSquaresAlgorithm4() {
		System.out.println("Karelerininin toplamını bulmak istediğiniz 2 sayıyı da enter'a basarak giriniz...");
		System.out.println("Sayıların kareleri toplamı: "
				+ (int) (Math.pow(scanner.nextInt(), 2) + Math.pow(scanner.nextInt(), 2)));
	}

	public static void sumOfCubesNumbersFrom1to100Algorithm1() {
		// 1 + 8 + 27 + 64 + 125 + 216 + 343 + 512 + 729 + 1000 = 3025
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			// sum += (i+1) * (i+1) * (i+1);
			sum += Math.pow(i + 1, 3);
		}
		System.out.println(sum);
	}

	public static void sumOfCubesNumbersFrom1to100Algorithm2() {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += Math.pow(i, 3);
			i++;
		}
		System.out.println(sum);
	}

	public static void sumOfCubesNumbersFrom1to100Algorithm3() {
		int sum = 0;
		int i = 1;
		do {
			sum += Math.pow(i, 3);
			i++;
		} while (i <= 10);
		System.out.println(sum);
	}

	public static void sumOfCubesNumbersFrom1to100Algorithm4() {
		int i = 1, j = 1;
		int sum = 0, sumj = 0;
		while (i <= 10) {
			System.out.print(String.format("%d³", i) + (i != 10 ? " + " : " = "));
			sum += Math.pow(i, 3);
			i++;
		}
		System.out.println(sum);
		while (j <= 10) {
			System.out.print((int) Math.pow(j, 3) + (j != 10 ? " + " : " = "));
			sumj += Math.pow(j, 3);
			j++;
		}
		System.out.println(sumj);
	}

	public static void calculateDateOfBirth() {
		System.out.print("Doğum tarihinizin yıl bilgisini giriniz: ");
		int year = scanner.nextInt();
		System.out.print("Doğum tarihinizin ay bilgisini giriniz: ");
		int month = scanner.nextInt();
		System.out.print("Doğum tarihinizin gün bilgisini giriniz: ");
		int day = scanner.nextInt();
		LocalDate birthDate = LocalDate.of(year, month, day);
		LocalDate now = LocalDate.now();
		System.out.println("Yaşınız: " + Period.between(birthDate, now).getYears());
	}

	public static void calculateFactorial() {
		System.out.print("Faktöriyelini hesaplamak istediğiniz sayı: ");
		int num = scanner.nextInt();
		int i = num - 1;
		while (i > 0) {
			num *= i;
			i--;
		}
		System.out.println("Sayınızın faktöriyeli: " + num);
	}

	public static void calculateFactorial2() {
		System.out.print("Faktöriyelini hesaplamak istediğiniz sayı: ");
		int num = scanner.nextInt();
		System.out.print(num + "! = ");
		int i = num;
		while (i > 0) {
			System.out.print(i + (i == 1 ? " = " : " * "));
			i--;
			if (i == 0)
				break;
			num *= i;
		}
		System.out.print(num);
	}

	public static void calculateFactorial3() {
		System.out.print("Faktöriyelini hesaplamak istediğiniz sayı: ");
		int num = scanner.nextInt();
		System.out.print(num + "! = ");
		int fact = 1;
		while (num > 0) {
			fact *= num;
			System.out.print(num + (num == 1 ? " = " : " * "));
			num--;
		}
		System.out.println(fact);
	}

	public static void calculateFactorial4() {
		System.out.print("Faktöriyelini hesaplamak istediğiniz sayı: ");
		int num = scanner.nextInt();
		System.out.println(calculateFactorialRecursive(num));
	}

	static int fact = 1;

	public static int calculateFactorialRecursive(int num) {
		fact *= num;
		System.out.print(num + (num == 1 ? " = " : " * "));
		num--;
		if (num > 0)
			calculateFactorialRecursive(num);
		return fact;
	}

	public static void calculateFactorial5() {
		System.out.print("Faktöriyelini hesaplamak istediğiniz sayı: ");
		int num = scanner.nextInt();
		System.out.println(calculateFactorialRecursive2(num) == 0 ? 1 : calculateFactorialRecursive2(num));
	}

	public static int calculateFactorialRecursive2(int num) {
		if (num > 1)
			return num *= calculateFactorialRecursive2(--num);
		return num;
	}

	public static void sumInsteadOfMultiplyAlgorithm1() {
		System.out.print("1. Sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("2. Sayı: ");
		int num2 = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < num2; i++) {
			sum += num1;
		}
		System.out.println(MessageFormat.format("{0} * {1} = {2}", num1, num2, sum));
	}

	public static void sumInsteadOfMultiplyAlgorithm2() {
		System.out.print("1. Sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("2. Sayı: ");
		int num2 = scanner.nextInt();
		System.out.println(sumInsteadOfMultiplyRecursive(num1, num2));
	}

	public static int sumInsteadOfMultiplyRecursive(int num1, int num2) {
		if (num2 > 1)
			return num1 + sumInsteadOfMultiplyRecursive(num1, --num2);
		return num1;
	}
	
	public static void subtractionInsteadOfDivisionAlgorithm1() {
		System.out.print("Bölünen sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("Bölen sayı: ");
		int num2 = scanner.nextInt();
		int dividend = num1, divider = num2;
		int counter = 0;
		while (num1 >= num2) {
			num1 -= num2;
			counter++;
		}
		System.out.println(MessageFormat.format("{0} / {1} = {2} | Kalan = {3}", dividend, divider, counter, num1));
	}
	
	public static void subtractionInsteadOfDivisionAlgorithm2() {
		System.out.print("Bölünen sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("Bölen sayı: ");
		int num2 = scanner.nextInt();
		int counter = 0;
		System.out.print(MessageFormat.format("{0} / {1} = ", num1, num2));
		subtractionInsteadOfDivisionRecursive(num1, num2, counter);
	}
	
	public static void subtractionInsteadOfDivisionRecursive(int num1, int num2, int counter) {
		if (num1 >= num2) {
			num1 -= num2;
			counter++;
			subtractionInsteadOfDivisionRecursive(num1, num2, counter);
		} else {
			System.out.print(MessageFormat.format("{0} | Kalan: {1}", counter, num1));
		}
	}
	
	public static void subtractionInsteadOfDivisionAlgorithm3() {
		System.out.print("Bölünen sayı: ");
		int num1 = scanner.nextInt();
		System.out.print("Bölen sayı: ");
		int num2 = scanner.nextInt();
		System.out.println(MessageFormat.format("{0} / {1} = {2} | Kalan: {3}", num1, num2, subtractionInsteadOfDivisionRecursive2(num1, num2), num1 % num2));
	}
	
	public static int subtractionInsteadOfDivisionRecursive2(int num1, int num2) {
		num1 -= num2;
		if (num1 >= num2) 
			return 1 + subtractionInsteadOfDivisionRecursive2(num1, num2);
		return 1;
	}
	
	public static void findingTheNumberOfDigitsAlgorithm1() {
		System.out.print("Basamak sayısını bulmak istediğiniz sayı: ");
		int num = scanner.nextInt();
		int i = 10;
		int counter = 1;
		while (num >= i) {
			num /= i;
			counter++;
		}
		System.out.println(counter);
	}
	
	public static void findingTheNumberOfDigitsAlgorithm2() {
		System.out.print("Basamak sayısını bulmak istediğiniz sayı: ");
		int num = scanner.nextInt();
		System.out.println(findingTheNumberOfDigitsRecursive(num));
	}
	
	public static int findingTheNumberOfDigitsRecursive(int num) {
		if (num >= 10)
			return 1 + findingTheNumberOfDigitsRecursive(num /= 10);
		return 1;
	}
	
	public static void findingTheNumberOfDigitsAlgorithm3() {
		System.out.print("Basamak sayısını bulmak istediğiniz sayı: ");
		String num = scanner.next();
		System.out.println(MessageFormat.format("{0} sayısının, basamak sayısı: {1}", num, num.length()));
	}
	
	public static void sumOfTheCubesOfDigitsOf3DigitNumberAlgorithm1() {
		System.out.print("3 basamaklı bir sayı giriniz: ");
		int num = scanner.nextInt();
		int sum = 0;
		if (num > 99 && num < 1000) {
			int cubeOfHundreds = (int) Math.pow(num / 100, 3);
			int cubeOfTens = (int) Math.pow((num % 100) / 10, 3);
			int cubeOfOnes = (int) Math.pow((num % 100) % 10, 3);
			sum = cubeOfHundreds + cubeOfTens + cubeOfOnes;
			System.out.print(num + " sayısı, basamaklarının küpleri toplamına ");
			System.out.print(num == sum ? "eşittir." : "eşit değildir.");
		} else 
			System.out.println("3 basamaklı bir sayı girilmelidir!");
	}
}

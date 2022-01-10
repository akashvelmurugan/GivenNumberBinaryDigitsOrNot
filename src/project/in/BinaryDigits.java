package project.in;

import java.util.Scanner;

public class BinaryDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Value :");

		int number = scanner.nextInt();
		int copyNumber=number;
		boolean isBinary=true;

		while (copyNumber>0) {
			int remainder=copyNumber%10;
			if (remainder>1) {
				isBinary=false;
			}
			copyNumber=copyNumber/10;
		}
		if (isBinary) {
			System.out.println(number+" Is Binary Digits");
		}else {
			System.out.println(number+" Is Not Binary Number");
		}
	}
}

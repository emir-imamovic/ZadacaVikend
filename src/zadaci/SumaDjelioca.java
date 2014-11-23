package zadaci;

import java.util.*;

public class SumaDjelioca {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Unesite prirodan broj n!");
			int n = TextIO.getlnInt();
			int djelioci = 0;
			int i = 1;
			if (n < 0) {
				System.out.println("Unijeli ste broj koji nije prirodan!");
				System.out.println("Unesite prirodan broj n!");
				n = TextIO.getlnInt();
			}
			while (i <= n) {

				if (n == 0) {
					return;
				}
				if (n % i == 0) {
					djelioci += i;
					i++;
				}
				if (n % i != 0) {
					i++;
				}
			}
			System.out.println("Suma djelioca prirodnog broja " + n + " je "
					+ djelioci);
		}
	}

}

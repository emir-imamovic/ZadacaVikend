package zadaci;

import java.util.*;

public class Pravougaonik {
	public static void main(String[] args) {
		System.out.println("Unesite visinu pravougaonika.");
		int a = TextIO.getlnInt();
		System.out.println("Unesite sirinu pravougaonika");
		int b = TextIO.getlnInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if ((j == 1 && i == 1) || (j == b && i == a)
						|| (j == b && i == 1) || (j == 1 && i == a)) {
					System.out.print("+");
				} else if ((j == 1 && i > 1 && i < a)
						|| (j == b && i < a && i > 1)) {
					System.out.print("|");
				} else if (i > 1 && i < a && j > 1 && j < b) {
					System.out.print(" ");
				} else
					System.out.print("-");
			}
			System.out.println("");
		}
	}
}

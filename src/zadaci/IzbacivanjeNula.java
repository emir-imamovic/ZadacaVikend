package zadaci;

import java.util.*;

public class IzbacivanjeNula {
	public static void main(String[] args) {
		System.out.println("Unesi neki golem broj sa nulama");
		int broj = TextIO.getlnInt();
		int cifra = 0;
		int k = 1;
		while (broj != 0) {
			if (broj % 10 != 0) {
				cifra = cifra + broj % 10 * k;
				k *= 10;
			}
			broj /= 10;
		}
		System.out.println(cifra);

	}
}

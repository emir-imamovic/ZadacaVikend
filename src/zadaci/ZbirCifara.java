package zadaci;

import java.util.*;

public class ZbirCifara {
	public static void main(String[] args) {
		System.out.println("Unesite neki visecifren broj.");
		int broj = TextIO.getlnInt();
		int suma = 0;
		int cifra = 0;
		int k = 10;
		while (broj != 0) {
			cifra = broj % k;
			suma += cifra;
			broj /= 10;
		}
		System.out.println("Suma cifara unesenog broja je " + suma);
	}
}

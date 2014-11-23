package zadaci;

import java.util.*;

public class FibonacijevNiz {
	public static void main(String[] args) {
		System.out.println("Unesite neki broj od 0 do 50.");
		int broj = TextIO.getlnInt();
		int i = 0;
		int a = 1;
		int b = 1;

		int fibonaci = 0;
		if (broj > 50 || broj < 0) {
			System.out
					.println("Broj koji ste unijeli nije u zadanom intervalu.");
			return;
		}

		if (broj == 1) {
			fibonaci = 1;
			System.out.println(fibonaci);
			return;
		}
		if (broj == 2) {
			fibonaci = 1;
			System.out.println(fibonaci);
			return;
		}
		if (broj == 3) {
			fibonaci = a + b;
			System.out.println(fibonaci);
			return;
		}
		i = 4;
		while (i <= broj) {
			if (broj > 3) {
				b = a + b;
				a = b - a;
				fibonaci = a + b;
				++i;
			}
		}

		System.out.println(broj + ". broj u Fibonacijevom nizu je " + fibonaci);
	}
}

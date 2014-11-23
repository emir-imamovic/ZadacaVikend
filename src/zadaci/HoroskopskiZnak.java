package zadaci;

import java.util.*;

public class HoroskopskiZnak {
	public static void main(String[] args) {
		System.out.println("Unesite dan rodjenja!");
		int dan = TextIO.getlnInt();
		System.out.println("Unesite mjesec rodjenja!");
		int mjesec = TextIO.getlnInt();

		if ((dan >= 21 && mjesec == 3) || (dan <= 19 && mjesec == 4)) {
			System.out.println("Vas horoskopski znak je OVAN.");
		}
		if ((dan >= 20 && mjesec == 4) || (dan <= 20 && mjesec == 5)) {
			System.out.println("Vas horoskopski znak je BIK.");
		}
		if ((dan >= 21 && mjesec == 5) || (dan <= 20 && mjesec == 6)) {
			System.out.println("Vas horoskopski znak je BLIZANCI.");
		}

		if ((dan >= 21 && mjesec == 6) || (dan <= 22 && mjesec == 7)) {
			System.out.println("Vas horoskopski znak je RAK.");

		}
		if ((dan >= 23 && mjesec == 7) || (dan <= 22 && mjesec == 8)) {
			System.out.println("Vas horoskopski znak je LAV.");

		}
		if ((dan >= 23 && mjesec == 8) || (dan <= 22 && mjesec == 9)) {
			System.out.println("Vas horoskopski znak je DJEVICA.");
		}

		if ((dan >= 23 && mjesec == 9) || (dan <= 22 && mjesec == 10)) {
			System.out.println("Vas horoskopski znak je VAGA.");

		}
		if ((dan >= 23 && mjesec == 10) || (dan <= 21 && mjesec == 11)) {
			System.out.println("Vas horoskopski znak je SKORPIJA.");
		}

		if ((dan >= 22 && mjesec == 11) || (dan <= 21 && mjesec == 12)) {
			System.out.println("Vas horoskopski znak je STRIJELAC.");
		}

		if ((dan >= 22 && mjesec == 12) || (dan <= 19 && mjesec == 1)) {
			System.out.println("Vas horoskopski znak je JARAC.");
		}
		if ((dan >= 20 && mjesec == 1) || (dan <= 18 && mjesec == 2)) {
			System.out.println("Vas horoskopski znak je VODOLIJA.");
		}
		if ((dan >= 19 && mjesec == 2) || (dan <= 20 && mjesec == 3)) {
			System.out.println("Vas horoskopski znak je RIBE.");
		}
	}
}
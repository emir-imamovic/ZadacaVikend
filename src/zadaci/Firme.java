package zadaci;

import java.util.*;

public class Firme {
	public static void main(String[] args) {
		System.out.println("Unesite broj sati.");
		int h = TextIO.getlnInt();
		double prvaFirma = 10 + (0.50 * h);
		double drugaFirma = 0.80 * h;
		if (prvaFirma < drugaFirma) {
			double razlika = drugaFirma - prvaFirma;
			System.out
					.println("Za uneseni broj sati isplatnija vam je prva firma za "
							+ razlika + " km.");
		}
		if (drugaFirma < prvaFirma) {
			double razlika1 = prvaFirma - drugaFirma;
			System.out
					.println("Za uneseni broj sati isplatnija vam je druga firma za "
							+ razlika1 + " km.");
		}
		if (prvaFirma == drugaFirma) {
			System.out
					.println("Za uneseni broj sati nema razlike u firmama,izaberite koju zelite");
		}
	}
}

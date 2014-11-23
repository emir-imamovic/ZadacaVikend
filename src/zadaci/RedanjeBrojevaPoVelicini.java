package zadaci;

import java.util.*;

public class RedanjeBrojevaPoVelicini {
	public static void main(String[] args) {
		System.out.println("Unesite prvi broj u intervalu od 50 do 200!");
		int broj1 = TextIO.getlnInt();
		System.out.println("Unesite drugi broj u istom intervalu!");
		int broj2 = TextIO.getlnInt();
		System.out.println("Unesite treci broj u istom intervalu!");
		int broj3 = TextIO.getlnInt();

		if (broj1 != broj2 && broj2 != broj3) {
			if (broj1 >= 50 && broj1 <= 200) {
				if (broj1 <= broj2 && broj1 <= broj3) {
					if (broj2 < broj3) {
						System.out.println(broj1 + " " + broj2 + " " + broj3);
					} else if (broj2 >= broj3) {
						System.out.println(broj1 + " " + broj3 + " " + broj2);
					}
				}
			} else {
				System.out
						.println("Unijeli ste broj koji nije u zadanom intervalu!");
				System.exit(0);
			}
			if (broj2 >= 50 && broj2 <= 200) {
				if (broj2 <= broj1 && broj2 <= broj3) {
					if (broj1 < broj3) {
						System.out.println(broj2 + " " + broj1 + " " + broj3);
					} else if (broj3 >= broj1) {
						System.out.println(broj2 + " " + broj3 + " " + broj1);
					}
				}
			} else {
				System.out
						.println("Unijeli ste broj koji nije u zadanom intervalu!");
				System.exit(0);
			}
			if (broj3 >= 50 && broj3 <= 200) {
				if (broj3 <= broj1 && broj3 <= broj2) {
					if (broj2 < broj1) {
						System.out.println(broj3 + " " + broj2 + " " + broj1);
					} else if (broj2 >= broj1) {
						System.out.println(broj3 + " " + broj1 + " " + broj2);
					}
				}
			} else {
				System.out
						.println("Unijeli ste broj koji nije u zadanom intervalu!");
				System.exit(0);
			}
		}

		if (broj1 == broj2 && broj2 == broj3) {
			System.out.println("Unijeli ste jedan isti broj tri puta a to je "
					+ broj1);
		}
		if (broj1 != broj2 && broj1 != broj3 && broj2 != broj3) {
			System.out.println("Unijeli ste tri razlicita broja!");
		}
		if (broj1 == broj2 && broj1 < broj3) {
			System.out
					.println("Unijeli ste dva ista odnosno dva razlicita broja! "
							+ broj1 + " i " + broj3);
		}
		if (broj2 == broj3 && broj2 < broj1) {
			System.out
					.println("Unijeli ste dva ista odnosno dva razlicita broja! "
							+ broj2 + " i " + broj1);
		}
		if (broj1 == broj3 && broj1 < broj2) {
			System.out
					.println("Unijeli ste dva ista odnosno dva razlicita broja! "
							+ broj1 + " i " + broj2);
		}
	}

}

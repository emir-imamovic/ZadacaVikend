package zadaci;

import java.util.*;

public class IzbacivanjeSlova {
	public static void main(String[] args) {
		System.out.println("Ispisite recenicu po zelji.");
		String unos = TextIO.getlnString().toLowerCase();
		System.out.println("Unesite slovo.");
		String slovo = TextIO.getln().toLowerCase();
		String novaRecenica = unos.replaceAll(slovo, "");
		System.out.println(novaRecenica);
	}
}

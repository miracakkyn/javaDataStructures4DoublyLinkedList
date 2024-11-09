package newPkg;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList liste = new LinkedList();
		Scanner scanner = new Scanner(System.in);
		int secim = -1;
		System.out.println("Hoşgeldiniz");
		System.out.println("-----------------------------------------");
		while (true) {

			System.out.println("-----------------------------------------");
			System.out.println("1-Başa eleman ekleme");
			System.out.println("2-Sona eleman ekleme");
			System.out.println("3-Araya eleman ekleme");
			System.out.println("4-Baştan eleman sil");
			System.out.println("5-Sondan eleman sil");
			System.out.println("6-Aradan eleman sil");
			System.out.println("7-Baştan sona yazdır");
			System.out.println("8-Sondan başa yazdır");
			System.out.println("0-Çıkış");
			System.out.println("-----------------------------------------");
			System.out.print("Seçiminiz:");
			secim = scanner.nextInt();
			System.out.println();
			if (secim == 1) {
				System.out.print("Listeye eklenecek değeri giriniz: ");
				int k = scanner.nextInt();
				liste.basaEkle(k);
			} else if (secim == 2) {
				System.out.print("Listeye eklenecek değeri giriniz: ");
				int k = scanner.nextInt();
				liste.sonaEkle(k);
			} else if (secim == 3) {
				System.out.print("Listeye eklenecek değeri giriniz: ");
				int k = scanner.nextInt();
				System.out.println();
				System.out.print("İndex giriniz:");
				int l = scanner.nextInt();
				liste.arayaEkle(l, k);
			} else if (secim == 4) {
				liste.bastanSil();
			} else if (secim == 5) {
				liste.sondanSil();
			} else if (secim == 6) {
				System.out.print("İndex giriniz:");
				int l = scanner.nextInt();
				liste.aradanSil(l);
			} else if (secim == 7) {
				liste.yazdir();
			} else if (secim == 8) {
				liste.sondanYazdir();
			} else if (secim == 0) {
				System.out.println("\nProgramdan çıkılıyor iyi günler...");
				break;
			} else {
				System.out.println("Hatalı seçim lütfen tekrar deneyiniz!!!");
			}

		}

	}

}

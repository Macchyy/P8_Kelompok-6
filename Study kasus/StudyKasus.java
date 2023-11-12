/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;

import java.util.Scanner;

public class StudyKasus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Kalkulator Bangun Datar ===");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Trapesium");
            System.out.println("6. Jajar Genjang");
            System.out.println("0. Keluar");
            System.out.print("Pilih bangun datar (0-6): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Terima kasih telah menggunakan kalkulator ini. Selamat tinggal!");
                    System.exit(0);
                case 1:
                    hitungPersegi();
                    break;
                case 2:
                    hitungPersegiPanjang();
                    break;
                case 3:
                    hitungSegitiga();
                    break;
                case 4:
                    hitungLingkaran();
                    break;
                case 5:
                    hitungTrapesium();
                    break;
                case 6:
                    hitungJajarGenjang();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void hitungPersegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        double sisi = scanner.nextDouble();

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas persegi: " + luas+"cm");
        System.out.println("Keliling persegi: " + keliling+"cm");
    }

    private static void hitungPersegiPanjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang: " + luas+"cm");
        System.out.println("Keliling persegi panjang: " + keliling+"cm");
    }

    private static void hitungSegitiga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;

        double sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));

        double keliling = alas + 2 * sisiMiring;

        System.out.println("Luas segitiga: " + luas+"cm");
        System.out.println("Keliling segitiga: " + keliling+"cm");
    }

    private static void hitungLingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran: " + luas+"cm");
        System.out.println("Keliling lingkaran: " + keliling+"cm");
    }

    private static void hitungTrapesium() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi atas: ");
        double sisiAtas = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi bawah: ");
        double sisiBawah = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi kiri: ");
        double sisiKiri = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi kanan: ");
        double sisiKanan = scanner.nextDouble();

        double luas = 0.5 * (sisiAtas + sisiBawah) * tinggi;
        double keliling = sisiAtas + sisiBawah + sisiKiri + sisiKanan;

        System.out.println("Luas trapesium: " + luas+"cm");
        System.out.println("Keliling trapesium: " + keliling+"cm");
    }

    private static void hitungJajarGenjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi miring: ");
        double sisiMiring = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi lainnya: ");
        double sisiLain = scanner.nextDouble();

        double luas = alas * tinggi;
        double keliling = 2 * (alas + sisiLain);

        System.out.println("Luas jajar genjang: " + luas+"cm");
        System.out.println("Keliling jajar genjang: " + keliling+"cm");
    }
}


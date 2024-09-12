import java.util.Scanner;

public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiAkhir;

        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukan nilai kuis: ");
        nilaikuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaitugas = sc.nextDouble();
        System.out.print("Masukan nilai ujian: ");
        nilaiujian = sc.nextDouble();

        nilaiAkhir = (nilaikuis * 20/100) + (nilaitugas * 15/100) + (nilaiujian * 30/100) + (nilaiujian * 35/100)

        System.out.println("Nama: " + nama + "Nim: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}
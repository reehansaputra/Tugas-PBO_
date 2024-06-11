/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo.rehan.saputra;

/**
 *
 * @author USER
 */
import CRUD.BukuTamu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan BukuTamu
        try (Scanner scanner = new Scanner(System.in)) {
            // Contoh penggunaan BukuTamu
            System.out.println("Masukkan data untuk Buku Tamu:");
            System.out.print("ID: ");
            int bukuTamuId = scanner.nextInt();
            scanner.nextLine(); // Membuang newline
            System.out.print("Nama: ");
            String bukuTamuNama = scanner.nextLine();
            System.out.print("Pesan: ");
            String bukuTamuPesan = scanner.nextLine();
            
            BukuTamu bukuTamu = new BukuTamu(bukuTamuId, bukuTamuNama, bukuTamuPesan);
            
            // Output hasil input
            System.out.println("\nData yang dimasukkan:");
            System.out.println("Buku Tamu:");
            System.out.println("ID: " + bukuTamu.getId() + ", Nama: " + bukuTamu.getNama() + ", Pesan: " + bukuTamu.getPesan());
        }
    }
}



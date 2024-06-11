/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author USER
 */
public class BukuTamu {
    private final int id;
    private String nama;
    private String pesan;

    public BukuTamu(int id, String nama, String pesan) {
        this.id = id;
        this.nama = nama;
        this.pesan = pesan;
    }

    // Getter untuk id
    public int getId() {
        return id;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk pesan
    public String getPesan() {
        return pesan;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk pesan
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}



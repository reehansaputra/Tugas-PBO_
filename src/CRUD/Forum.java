/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

/**
 *
 * @author USER
 */
public class Forum {
    private final int id;
    private final String judul;
    private final String isiPesan;
    private final String penulis;

    public Forum(int id, String judul, String isiPesan, String penulis) {
        this.id = id;
        this.judul = judul;
        this.isiPesan = isiPesan;
        this.penulis = penulis;
    }

    // Tambahkan getter dan setter sesuai kebutuhan

    public String getJudul() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


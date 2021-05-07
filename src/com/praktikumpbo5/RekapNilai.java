package com.praktikumpbo5;

public class RekapNilai {
    private int nilai;
    private String matkul;
    private String nama;

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        try {
            this.nilai = nilai;
            System.out.println(nilai);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        try {
            this.matkul = matkul;
            System.out.println(matkul.toString());
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        try {
            this.nama = nama;
            System.out.println(nama.toString());
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}

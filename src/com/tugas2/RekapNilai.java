package com.tugas2;

public class RekapNilai {
    private int nilai;
    private String matkul;
    private String nama;

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;

    }

//    public String rekapNilai(){
//        String hasil = String.format(getNama()+","+getMatkul()+","+getNilai());
//        return hasil;
//    }
    public void rekapNilai(){
        String hasil = String.format(getNama()+"\t\t"+getMatkul()+"\t\t\t"+getNilai());
        ReadWrite readWrite = new ReadWrite();
        readWrite.writeData(hasil);
    }
}

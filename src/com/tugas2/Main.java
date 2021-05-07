package com.tugas2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        RekapNilai rekap = new RekapNilai();
        ArrayList arr = new ArrayList();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("masukan jumlah siswa : ");
            int jumlah_siswa = Integer.parseInt(bf.readLine());
//            System.out.println(jumlah_siswa);
            int[] nilai = new int[2];
            String[] data = new String[2];
            String[] matkul = new String[2];
            String[] nama = new String[2];

            for (int i = 0; i < jumlah_siswa; i++) {
                System.out.print("masukan nama : ");
                try {
                    nama[i] = bf.readLine();
//                    System.out.println(nama[i]);
                    rekap.setNama(nama[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
                System.out.print("masukan nilai : ");
                try {
                    nilai[i] = Integer.parseInt(bf.readLine());
                    rekap.setNilai(nilai[i]);
                } catch (NumberFormatException e) {
                    System.out.println(e);
                }
                System.out.print("masukan matkul : ");
                try {
                    matkul[i] = bf.readLine();
                    rekap.setMatkul(matkul[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
//                data[i] = (rekap.getNama()+","+rekap.getMatkul()+","+rekap.getNilai()+"\n");
//                arr.add(data[i]);
                ReadWrite readWrite = new ReadWrite();
//                readWrite.writeData(arr);
                rekap.rekapNilai();
                   readWrite.readDate();
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println(e);
        }finally {
            System.out.println("data berhasil ditambahkan");
        }
    }
}
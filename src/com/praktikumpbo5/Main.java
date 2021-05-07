package com.praktikumpbo5;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RekapNilai rekap = new RekapNilai();
        int[] nilai = new int[2];
        String[] matkul = new String[2];
        String[] nama = new String[2];
        try {
            nilai[0] = 12;
            matkul[0] = null;
            nama[0] = null;
            nilai[1] = 19;
            matkul[1] = null;
            nama[1] = null;
//            nilai[2] = 19;
//            matkul[2] = null;
//            nama[2] = null;

            rekap.setNilai(nilai[0]);
            rekap.setMatkul(matkul[0]);
            rekap.setNama(nama[0]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("rekap nilai : ");
        System.out.println("Nama : "+rekap.getNama()+" | Matkul : "+rekap.getMatkul()+" | Nilai : "+rekap.getNilai());
    }
}

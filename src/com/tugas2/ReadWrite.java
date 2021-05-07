package com.tugas2;

import java.io.*;
import java.util.ArrayList;

public class ReadWrite{
//    public void writeData(ArrayList<String> hasil){
//        File file = new File("test.txt");
//        System.out.println(hasil);
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
//            bw.write(String.valueOf(hasil));
//        }catch (FileNotFoundException exception){
//            exception.printStackTrace();
//        }catch (IOException exception) {
//            exception.printStackTrace();
//        }
//
//    }
    public void writeData(String hasil){
        File file = new File("test.txt");
//        System.out.println(hasil);
        try{
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(hasil);
            bw.flush();
            bw.newLine();
            bw.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public void readDate(){
        File file = new File("test.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String barisData;
            System.out.println("\nrekap nilai : ");
            System.out.println("nama\t|\tmatkul\t|\tnilai");
            while ((barisData = br.readLine())!=null){
                System.out.println(barisData);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("file tidak dapat dibaca");
        }

    }

}

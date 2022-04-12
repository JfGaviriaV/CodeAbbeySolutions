package com.co.juridico.codeabbey.solutions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) throws FileNotFoundException {

        InputStream ins = new FileInputStream("C:\\Users\\Usuario\\Desktop\\Java\\FilesDocumentos\\MinNum.txt");
        Scanner obj = new Scanner(ins);
        List<String> nl =  new ArrayList<>();

        while (obj.hasNextLine()) {
            nl.add(obj.nextLine());
        }

        nl.stream().map(min ->{
            String[] arr1 = min.split(" ");

            int size = arr1.length;
            int [] intArr = new int [size];
            for(int i=0; i<size; i++) {
                intArr[i] = Integer.parseInt(arr1[i]);
            }

            int max = 0;
            for (int i = 0; i < size; i++) {
                max = (intArr[max] < intArr[i]) ? max : i;
            }
            return intArr[max];
        }).forEach(u -> System.out.print(" " + u));


    }


    public static void PutoFdy(String arr) {


        String[] arr1 = arr.split(" ");

        int size = arr1.length;
        int [] intArr = new int [size];
        for(int i=0; i<size; i++) {
            intArr[i] = Integer.parseInt(arr1[i]);
        }

        int max = 0;
        for (int i = 0; i < size; i++) {
            max = (intArr[max] < intArr[i]) ? max : i;
        }

        System.out.print(intArr[max]);

    }

}










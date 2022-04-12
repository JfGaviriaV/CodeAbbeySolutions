package com.co.juridico.codeabbey.solutions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class wsd {
    public static void main(String[] args) throws FileNotFoundException {

        InputStream ins = new FileInputStream("C:\\Users\\Usuario\\Desktop\\Java\\FilesDocumentos\\wsd.txt");
        Scanner obj = new Scanner(ins);
        String tmp = "";
        while (obj.hasNextLine()) {
            tmp += obj.nextLine();
        }

    }

    public static void PutoFdy(String arr) {

        String[] splited = arr.split(" ");

        int singleSize = 0;
        int parse = 0;
        int sum = 0;

        for (int i = 0; i < splited.length; i++) {

            String capturado = splited[i];
            singleSize = capturado.length();

            for (int j = 0; j < singleSize; j++) {
                parse = Character.getNumericValue(capturado.charAt(j));
                sum = sum + (j + 1) * parse;
            }
            System.out.print(" " + sum);
            sum = 0;
        }
    }
}








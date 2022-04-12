package com.co.juridico.codeabbey.solutions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) throws IOException {

        InputStream ins = new FileInputStream("C:\\Users\\Usuario\\Desktop\\Java\\FilesDocumentos\\MaxArray.txt");
        Scanner obj = new Scanner(ins);
        String tmp = "";
        while (obj.hasNextLine()) {
            tmp += obj.nextLine();
        }

        String[] a = tmp.split(" ");

        int size = a.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }

        int contadorMax = 0;
        int contadorMin = 0;


        for (int i = 1; i < arr.length; i++){
                contadorMax = (arr[contadorMax] > arr[i])? contadorMax: i;
            }
        for (int i = 0; i < arr.length; i++){
            contadorMin = (arr[contadorMin] < arr[i])? contadorMin: i;
        }

        System.out.println("Máximo " + a[contadorMax]);
        System.out.println("Mínimo " + a[contadorMin]);
        }
    }





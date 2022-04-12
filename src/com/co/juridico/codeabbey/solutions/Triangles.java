package com.co.juridico.codeabbey.solutions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) throws FileNotFoundException {

        InputStream ins = new FileInputStream("C:\\Users\\Usuario\\Desktop\\Java\\FilesDocumentos\\Triangles.txt");
        Scanner obj = new Scanner(ins);
        String tmp = "";
        while (obj.hasNextLine()) {

            tmp += PutoFdy(obj.nextLine()).concat(" ");

        }
        System.out.println(tmp);


    }

    public static String PutoFdy(String arr) {

        String[] arr1 = arr.split(" ");

        double a = Integer.parseInt(arr1[0]);
        double b = Integer.parseInt(arr1[1]);
        double c = Integer.parseInt(arr1[2]);

        double sp = (a + b + c) / 2;

        double area = Math.sqrt(sp * (sp - a)
                * (sp - b) * (sp - c));

        if (area >= 0) return "1";
         else {
            return "0";
        }

    }
}






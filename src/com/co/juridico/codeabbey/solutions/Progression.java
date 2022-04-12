package com.co.juridico.codeabbey.solutions;

public class Progression {
    public static void main(String[] args) {

        String a = "8";
        String b = "5 2 3";
        String c = "7 7 76";
        String d = "11 8 36";
        String e = "10 10 57";
        String f = "8 13 88";
        String g = "27 14 77";
        String h = "17 0 56";
        String i = "12 12 66";

        PutoFdy(b);
        PutoFdy(c);
        PutoFdy(d);
        PutoFdy(e);
        PutoFdy(f);
        PutoFdy(g);
        PutoFdy(h);
        PutoFdy(i);

    }

    public static void PutoFdy(String arr) {

        String[] arr1 = arr.split(" ");
        int a1 = Integer.parseInt(arr1[0]);
        int d = Integer.parseInt(arr1[1]);
        int n = Integer.parseInt(arr1[2]);
        int posicionN = a1 + (n - 1) * d;
        int Suma = ((a1 + posicionN)*n)/2;
        System.out.println("posicionN: " + arr1[2]+ " = " + (posicionN));
        System.out.println("Suma de los valores = " + Suma);
        }
    }






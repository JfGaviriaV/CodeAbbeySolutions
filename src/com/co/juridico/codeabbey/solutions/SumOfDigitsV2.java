package com.co.juridico.codeabbey.solutions;

public class SumOfDigitsV2 {
    public static void main(String[] args) {

        String a = "390 251 148";
        String b = "110 268 22";
        String c = "397 210 117";
        String d = "124 254 102";
        String e = "247 99 27";
        String f = "358 274 28";
        String g = "94 249 64";
        String h = "264 214 10";
        String i = "204 153 18";
        String j = "346 273 28";
        String k = "277 250 92";
        String l = "307 27 24";
        String m = "127 37 171";
        String n = "393 293 31";
        String o = "359 3 106";

        PutoFdyV2(a);
        PutoFdyV2(b);
        PutoFdyV2(c);
        PutoFdyV2(d);
        PutoFdyV2(e);
        PutoFdyV2(f);
        PutoFdyV2(g);
        PutoFdyV2(h);
        PutoFdyV2(i);
        PutoFdyV2(j);
        PutoFdyV2(k);
        PutoFdyV2(l);
        PutoFdyV2(m);
        PutoFdyV2(n);
        PutoFdyV2(o);

    }

    public static void PutoFdyV2(String arr) {
        String[] arr1 = arr.split(" ");

        int a = Integer.parseInt(arr1[0]);
        int b = Integer.parseInt(arr1[1]);
        int c = Integer.parseInt(arr1[2]);

        int operacion = a * b + c;

        int control = 0;
        String temp = Integer.toString(operacion);

        for (int i = 0; i < temp.length(); i++) {

            control = control + Integer.parseInt(temp.charAt(i) + "");
        }
        System.out.print(" " + control);
    }
}






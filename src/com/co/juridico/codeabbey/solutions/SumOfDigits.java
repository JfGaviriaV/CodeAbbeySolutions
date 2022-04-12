package com.co.juridico.codeabbey.solutions;
public class SumOfDigits {
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

        PutoFdy(a);
        PutoFdy(b);
        PutoFdy(c);
        PutoFdy(d);
        PutoFdy(e);
        PutoFdy(f);
        PutoFdy(g);
        PutoFdy(h);
        PutoFdy(i);
        PutoFdy(j);
        PutoFdy(k);
        PutoFdy(l);
        PutoFdy(m);
        PutoFdy(n);
        PutoFdy(o);

    }

    public static void PutoFdy(String arr) {
        String[] arr1 = arr.split(" ");

        int a = Integer.parseInt(arr1[0]);
        int b = Integer.parseInt(arr1[1]);
        int c = Integer.parseInt(arr1[2]);

        double operacion = a * b + c;


        //v2 no usar no lo que está dentro del while
        int control = 0;
        while (operacion > 0.5){
            operacion = (operacion / 10);
            String numberD = String.valueOf(operacion);
            numberD = numberD.substring (numberD.indexOf ( "." ));
            char ch1 = numberD.charAt(1);

            int capturado = Character.getNumericValue(ch1);
            control = control + capturado;

        }
        //v3 no usar soutv y tener todas las repuestas en una variable
        System.out.print(" " +control);

    }
}






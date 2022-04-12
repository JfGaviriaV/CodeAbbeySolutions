package com.co.juridico.codeabbey.solutions;

public class SumInLoop {
    public static void main(String[] args) {

       String cantidad = "38";
       String arreglo="336 252 511 317 827 900 1116 126 437 574 947 1278 1151 1060 256 674 812 734 115 411 205 48 879 1050 694 291 989 474 692 74 749 893 539 571 111 668 310 45";
       String[] dividido = arreglo.split(" ");

       int control = 0;
       for (int i =0; i<dividido.length;i++){
              int parseado = Integer.parseInt(dividido[i]);

              control+=parseado;
               System.out.println("control = " +control);
           }
       }
       
       //String notBlank = arreglo.replaceAll(" ","");
       //String spaced = notBlank.replaceAll(",","+");



       //int num = Integer.valueOf(notBlank);

        //System.out.println("spaced = " + num);


        //String notBlank2 = cantidad.replaceAll(" ",",");
        //System.out.println(notBlank);


        //int control2 = Integer.parseInt(notBlank2);
        //System.out.println("control2 = " + control2);
       /*int control= Integer.parseInt(notBlank);
       System.out.println(control);*/


    }




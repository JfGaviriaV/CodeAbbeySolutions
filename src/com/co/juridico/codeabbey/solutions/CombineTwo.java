package com.co.juridico.codeabbey.solutions;

public class CombineTwo {
    public static void main(String[] args) {

        String[] a = {"a","b","c"}, b = {"v","w","x","y","z"};

        PutoCristian(a, b);



    }
    public static void PutoCristian (String[] arr1,String[] arr2) {

        int largo =arr2.length;
        String[] arrFi = new String[largo];
        for (int i = 0; i < arrFi.length; i++){
            if (arr1.length > i){
            arrFi[i] = arr1[i] + arr2[i];
            } else {
                arrFi[i] = arr2[i];
            }
            System.out.println(arrFi[i]);
        }

    }
}

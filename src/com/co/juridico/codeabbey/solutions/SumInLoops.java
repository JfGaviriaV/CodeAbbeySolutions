package com.co.juridico.codeabbey.solutions;

public class SumInLoops {
    public static void main(String[] args) {


        String a = "14";
        String b = "355500 224149";
        String c = "627187 188281";
        String d = "80740 198988";
        String e = "46276 609368";
        String f = "488052 391008";
        String g = "683186 207636";
        String h = "44600 896893";
        String i = "46277 786891";
        String j = "676066 23769";
        String k = "285538 168417";
        String l = "779665 951466";
        String m = "14958 223271";
        String n = "600717 549876";
        String o = "192516 250305";


        PutoCristian(b);
        PutoCristian(c);
        PutoCristian(d);
        PutoCristian(e);
        PutoCristian(f);
        PutoCristian(g);
        PutoCristian(h);
        PutoCristian(i);
        PutoCristian(j);
        PutoCristian(k);
        PutoCristian(l);
        PutoCristian(m);
        PutoCristian(n);
        PutoCristian(o);




        /*StringBuilder sb = new StringBuilder(a).append(b).append(c).append(d)
                .append(e).append(f).append(g).append(h).append(i).append(j)
                .append(k).append(l).append(m).append(n).append(o);*/

        String concat = b+" "+ c + " "+d+" "+ e +" "+ f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "
                +m+" "+n+" "+o;
        String[] dividido = concat.split(" ");

        //int parseado = Integer.parseInt(dividido);
        //System.out.println("concat = " + parseado);



        //System.out.println(dividido);

        /*int control = 0;
        for (int z = 0; z < dividido.length; z++) {
            int parseado = Integer.parseInt(dividido[z]);
            int total = control+=parseado;
            if (total >= parseado) {
                System.out.println(total);
            } else break;


            //System.out.println(" total = " + control);
        }*/


    }
    public static void PutoCristian (String a) {

        String concat = a;
        String[] dividido = concat.split(" ");

        int control =0;
        for (int i = 0; i < dividido.length; i++){
            int parseado = Integer.parseInt(dividido[i]);
            control+=parseado;

            System.out.println(control);
        }

    }

}

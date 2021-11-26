package com.saygrey;

public class Writer {
    public static void writeArrToConsole(String[][] in){
        for(String[]x:in) {
            for (String y : x)
                System.out.printf("%3s ",y);
            System.out.println();
        }
        System.out.println();
    }
}

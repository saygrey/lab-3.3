package com.saygrey;

import java.io.File;


public class Main {
    static File inFile = new File("C:\\Users\\Dima\\Desktop\\test\\testIn.csv");

    public static void main(String[] args) {
        StringWorks works = new StringWorks(Reader.getStringsFromFile(inFile));
        Writer.writeArrToConsole(works.getMatrix());
        Writer.writeArrToConsole(works.getTransMatrix());
    }
}

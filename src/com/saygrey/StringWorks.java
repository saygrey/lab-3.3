package com.saygrey;

import java.util.List;

//класс строковых операций
public class StringWorks {
    List<String> notFormattedStringList;
    String[][] matrix;
    String[][] transMatrix;

    public StringWorks(List<String> inStringList) {
        notFormattedStringList = inStringList;
    }

    public String[][] getMatrix(){
        matrix=new String[notFormattedStringList.size()][notFormattedStringList.size()];
        int i=0;
        for (String x : notFormattedStringList) {
            matrix[i]=x.split(",");
            i++;
        }
        return matrix;
    }
    public String[][] getTransMatrix(){
        transMatrix=matrix;
        for (int i = 0; i < transMatrix.length; i++) {
            for (int j = i+1; j < transMatrix.length; j++) {
                String temp = transMatrix[i][j];
                transMatrix[i][j] = transMatrix[j][i];
                transMatrix[j][i] = temp;
            }
        }
        return transMatrix;
    }
}

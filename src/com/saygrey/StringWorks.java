package com.saygrey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//класс строковых операций
public class StringWorks {
    List<String> notFormattedStringList;

    public StringWorks(List<String> inStringList) {
        notFormattedStringList = inStringList;
    }

    public List<String> getPublicToPrivateStrList(){
        List<String> out=new ArrayList<>();
        notFormattedStringList.stream().forEach((x)->out.add(x.replaceAll("public ","private ")));
        return out;
    }
}

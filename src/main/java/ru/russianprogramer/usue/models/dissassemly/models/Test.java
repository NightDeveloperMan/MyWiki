package ru.russianprogramer.usue.models.dissassemly.models;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


public class Test {

    private ArrayList<Kit> complectArrayList = new ArrayList<Kit>();

    public Test() {
        complectArrayList.add(new Kit(1,"комплект1","123456/1", 12321.5D));
        complectArrayList.add(new Kit(2,"комплект2","123456/2", 12321.5D));
        complectArrayList.add(new Kit(3,"комплект3","123456/3", 12321.5D));
        complectArrayList.add(new Kit(4,"комплект4","123456/4", 12321.5D));
        complectArrayList.add(new Kit(5,"комплект5","123456/5", 12321.5D));
        complectArrayList.add(new Kit(6,"комплект6","123456/6", 12321.5D));
    }

    public void addNewComplectArray()
    {
        this.complectArrayList.add(new Kit());
    }

    public ArrayList<Kit> getComplectArrayList() {
        return complectArrayList;
    }
}

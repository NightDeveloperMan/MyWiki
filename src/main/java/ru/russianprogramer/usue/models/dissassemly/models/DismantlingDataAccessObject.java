package ru.russianprogramer.usue.models.dissassemly.models;

import java.util.ArrayList;

public class DismantlingDataAccessObject {

    private final ArrayList<Kit> kitList = new ArrayList<Kit>();

    {
        kitList.add(new Kit());
    }
    public void addEmptyKit()
    {
        kitList.add(new Kit());
    }

    public void editKit(Kit kit)
    {
        kitList.set(kitList.indexOf(kit),kit);
    }

    public ArrayList<Kit> getKitList() {
        return kitList;
    }
}

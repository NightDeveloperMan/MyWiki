package ru.russianprogramer.usue.models.dissassemly.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class DismantlingDataAccessObject {

    private final ArrayList<Kit> kitList = new ArrayList<Kit>();
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String username = "postgres";
    private final String password = "Fynfhrnblf";
   // private Connection connection = DriverManager.getConnection(url, username, password);



    public DismantlingDataAccessObject() throws SQLException {
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

    public void saveKit()
    {
       // kitList.indexOf();
    }
}

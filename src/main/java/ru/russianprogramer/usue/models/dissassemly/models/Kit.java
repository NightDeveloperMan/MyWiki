package ru.russianprogramer.usue.models.dissassemly.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Scope("prototype")
public class Kit {

    private int id;
    private String kitName;   // название комплекта

    private String inventoryNumber;  // инвентарный номер

    private Double kitCost; // стоимость комплекта

    private HashMap<String,Device> diviceMap = new HashMap<String, Device>(); // устройства

    public Kit(int id, String kitName, String inventoryNumber, Double KitCost) {
        this.id = id;
        this.kitName = kitName;
        this.inventoryNumber = inventoryNumber;
        this.kitCost = KitCost;
    }

    public Kit() {
        this.id = 0;
        this.kitName = "Пустой комплект";
        this.inventoryNumber = "";
        this.kitCost = 0.0D;
    }

    public HashMap<String, Device> addDevice(Device device)
    {
        this.diviceMap.put(device.getDeviceName(),device);
        return diviceMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getKitName() {
        return kitName;
    }

    public void setKitName(String kitName) {
        this.kitName = kitName;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public Double getKitCost() {
        return kitCost;
    }

    public void setKitCost(Double kitCost) {
        this.kitCost = kitCost;
    }
    public HashMap<String, Device> getDiviceMap() {
        return diviceMap;
    }
    public void setDiviceMap(HashMap<String, Device> diviceMap) {
        this.diviceMap = diviceMap;
    }
}

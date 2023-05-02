package ru.russianprogramer.usue.models.dissassemly.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Scope("prototype")
public class Kit {

    private int id;
    private String complectName;   // название комплекта

    private String inventoryNumber;  // инвентарный номер

    private Double complectCost; // стоимость комплекта

    private HashMap<String,Device> diviceMap = new HashMap<String, Device>(); // устройства

    public Kit(int id, String complectName, String inventoryNumber, Double complectCost) {
        this.id = id;
        this.complectName = complectName;
        this.inventoryNumber = inventoryNumber;
        this.complectCost = complectCost;
    }

    public Kit() {
        this.id = 0;
        this.complectName = "тест";
        this.inventoryNumber = "";
        this.complectCost = 0.0D;
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
    public String getComplectName() {
        return complectName;
    }

    public void setComplectName(String complectName) {
        this.complectName = complectName;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public Double getComplectCost() {
        return complectCost;
    }

    public void setComplectCost(Double complectCost) {
        this.complectCost = complectCost;
    }
    public HashMap<String, Device> getDiviceMap() {
        return diviceMap;
    }
    public void setDiviceMap(HashMap<String, Device> diviceMap) {
        this.diviceMap = diviceMap;
    }
}

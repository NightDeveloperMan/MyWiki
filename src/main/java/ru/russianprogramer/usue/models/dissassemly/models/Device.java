package ru.russianprogramer.usue.models.dissassemly.models;

public class Device {
    private enum DeviceType {

        MONITOR("монитор"),
        SYSTEMBLOCK("системный блок");

        private final String type;
        DeviceType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }
    }

    private int id;
    private DeviceType type; // тип оборудования
    private String deviceName;  // название оборудования
    private Double deviceCost; // стоимость оборудования


    public Device(int id, String type, String deviceName, Double deviceCost) {
        this.id = id;
        this.type = DeviceType.valueOf(type);
        this.deviceName = deviceName;
        this.deviceCost = deviceCost;
    }

    public Device() {
        this.type = null;
        this.deviceName = "";
        this.deviceCost = 0.0D;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeviceType getType() {
        return type;
    }

    public void setType(String type) {
        this.type = DeviceType.valueOf(type);
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Double getDeviceCost() {
        return deviceCost;
    }
    public void setDeviceCost(Double deviceCost) {
        this.deviceCost = deviceCost;
    }
}

package com.main;

class DeliveryAgent extends User {
    private String vehicleNumber;

    public DeliveryAgent(int id, String name, String vehicleNumber) {
        super(id, name);
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
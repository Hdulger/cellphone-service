package com.pluralsight;

public class CellPhone {
    //Fields
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber=0;
        this.model="";
        this.carrier="";
        this.phoneNumber="";
        this.owner="";

    }

    public int getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNum){
        this.serialNumber=serialNum;
    }

    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model=model;
    }

    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carr){
        this.carrier=carr;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNum){
        this.phoneNumber=phoneNum;
    }

    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner1){
        this.owner=owner1;
    }

}

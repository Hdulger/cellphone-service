package com.pluralsight;

import java.util.Scanner;

public class CellphoneService {
    public static void main(String[] args) {

        CellPhone myPhone;
        myPhone= new CellPhone();
        Scanner scanner= new Scanner(System.in);


        System.out.print("What is the serial number?");
        String serialNum= scanner.nextLine();
        int serNum=Integer.parseInt(serialNum);
        myPhone.setSerialNumber(serNum);

        System.out.print("What model is the phone?");
        String model= scanner.nextLine();
        myPhone.setModel(model);



        System.out.print("Who is the carrier?");
        String carrier=scanner.nextLine();
        myPhone.setCarrier(carrier);


        System.out.print("What is your phone number?");
        String phoneNum= scanner.nextLine();
        myPhone.setPhoneNumber(phoneNum);


        System.out.print("Who is the owner of the phone?");
        String owner=scanner.nextLine();
        myPhone.setOwner(owner);


        System.out.println("The serial number is : "+myPhone.getSerialNumber());
        System.out.println("Model is : "+myPhone.getModel());
        System.out.println("Carrier is : "+myPhone.getCarrier());
        System.out.println("Phone number is : "+myPhone.getPhoneNumber());
        System.out.println("Owner is : "+myPhone.getOwner());











    }
}

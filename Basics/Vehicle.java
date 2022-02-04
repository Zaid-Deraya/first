package Basics;

import java.util.Scanner;

enum VehicleType {
    SUV, HATCHBACK, SEDAN, EV
}

public class Vehicle {
    private String VehicleNumber;
    private short numberOfSeats; // 2bytes vs 4 bytes
    private VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public Vehicle(String VehicleNumber, VehicleType type) {
        this(type);
        this.VehicleNumber = VehicleNumber;
    }

    public Vehicle(String VehicleNumber, short numberOfSeats, VehicleType type) {
        this(VehicleNumber, type);
        this.numberOfSeats = numberOfSeats;
    }

    public Vehicle(Vehicle obj) {
        this.numberOfSeats = obj.numberOfSeats;
        this.type = obj.type;
        System.out.println("Please enter vehicle number: ");
        Scanner sc = new Scanner(System.in);
        this.VehicleNumber = sc.nextLine();
        sc.close();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH14G2627", VehicleType.SEDAN);
        Vehicle v2 = new Vehicle("65849", (short) 4, VehicleType.SUV);
        Vehicle v3 = new Vehicle(VehicleType.EV);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }

    public String getVehicleNumber() {
        return this.VehicleNumber;
    }

    public void setVehicleNumber(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public short getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(short numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public VehicleType getType() {
        return this.type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                " VehicleNumber='" + getVehicleNumber() + "'" +
                ", numberOfSeats='" + getNumberOfSeats() + "'" +
                ", type='" + getType() + "'" +
                "}";
    }
}

package org.example.Serialization;
//Implement a Vehicle class that has attributes make, model, and year.
// Instead of the usual Serializable interface, this time use the Externalizable
// interface. Implement the necessary methods (writeExternal and readExternal) to
// manage the serialization process. Serialize a Vehicle instance, then deserialize
// it, ensuring the data is correctly recovered.

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.IOException;
import java.io.*;

public class Vehicle implements Externalizable{
    private String make;
    private String model;
    private int year;

    public Vehicle(){

    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(make);
        out.writeObject(model);
        out.writeInt(year);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        make = (String) in.readObject();
        model = (String) in.readObject();
        year = in.readInt();

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Mini", "Countryman", 2022);
        try {

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("vehicle.ser"));
            Vehicle serializedVehicle = vehicle;
            out.writeObject(vehicle);
            out.close();


            ObjectInputStream in = new ObjectInputStream(new FileInputStream("vehicle.ser"));
            Vehicle deserializedVehicle = (Vehicle) in.readObject();
            in.close();

            System.out.println("Serialized Vehicle: " + serializedVehicle);
            System.out.println("Deserialized Vehicle: " + deserializedVehicle);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

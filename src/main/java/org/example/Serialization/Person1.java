package org.example.Serialization;
import java.io.*;
import java.io.Serializable;

public class Person1 implements Serializable {
    public static long serialVersionUID = 1L;

    private String name = null;
    private int age = 0;
    private String address = null;

    public Person1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void serialize(Person1 person, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
            System.out.println("Serialization complete: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person1 deserialize(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Person1 deserializedPerson1 = (Person1) objectInputStream.readObject();
            System.out.println("Deserialization complete: " + deserializedPerson1);
            return deserializedPerson1;
        } catch (InvalidClassException ice) {
            System.err.println("InvalidClassException: Version mismatch during deserialization. The serialized class is not compatible.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "}";
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1("Sai", 39, " Norwalk blvd , Cerritos ");
        serialize(person1, "person.ser");


        Person1.serialVersionUID = 2L;

        Person1 deserializedPerson = deserialize("person.ser");

        if (deserializedPerson != null) {
            System.out.println("Deserialized Person: " + deserializedPerson);
        }
    }
}

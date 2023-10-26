package org.example.Serialization;

import java.io.*;

public class PersonCustomSerialization implements Serializable {
    private String name = null;
    private int age = 0;
    private String address = null;

    public PersonCustomSerialization(String name, int age, String address) {
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


    private void writeObject(ObjectOutputStream out) throws IOException {

        String encryptedName = new StringBuilder(name).reverse().toString();
        out.defaultWriteObject();
        out.writeObject(encryptedName);
    }


    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        try {
            in.defaultReadObject();
            String encryptedName = (String) in.readObject();

            name = new StringBuilder(encryptedName).reverse().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address='" + address + "'";
    }

    public static void main(String[] args) {
        PersonCustomSerialization person = new PersonCustomSerialization("Nancy", 40, "294 Alondra blvd , Berlin");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
            out.writeObject(person);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            PersonCustomSerialization deserializedPerson = (PersonCustomSerialization) in.readObject();
            in.close();

            System.out.println("Serialized Person: " + person);
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


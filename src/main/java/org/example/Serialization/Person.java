package org.example.Serialization;
import java.io.*;
import java.time.LocalDateTime;


public class Person implements Serializable {
   String name = null;
   int age = 0;
   String address = null;
   public LocalDateTime currentDateTime = LocalDateTime.now();

   public Person(String name, int age, String address) {
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

   public static void serialize(Person person, String fileName) {
      try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
         objectOutputStream.writeObject(person);
         System.out.println("Serialization complete: " + person);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static Person deserialize(String fileName) {
      try (FileInputStream fileInputStream = new FileInputStream(fileName);
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
         Person person = (Person) objectInputStream.readObject();
         System.out.println("Deserialization complete: " + person);
         return person;
      } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
         return null;
      }
   }

   @Override
   public String toString() {
      return "Person{name='" + name + "', age=" + age + ", address='" + address + "', currentDateTime=" + currentDateTime + "}";
   }

   public static void main(String[] args) {
      Person person = new Person("Sai", 39, "Berliner str. 20 , Berlin");
      serialize(person, "person.ser");
      Person deserializedPerson = deserialize("person.ser");

      if (deserializedPerson != null) {
         System.out.println("Deserialized Person: " + deserializedPerson);
      }
   }
}

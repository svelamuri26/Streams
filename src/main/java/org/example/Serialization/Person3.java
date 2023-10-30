package org.example.Serialization;
import java.io.*;


     public class DeserializePerson {
        public static void main(String[] args) throws IOException {
            FileReader fileReader = new FileReader("person.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            String name = bufferedReader.readLine();
            int age = Integer.parseInt(bufferedReader.readLine());

            bufferedReader.close();
            fileReader.close();

            Person2 deserializedPerson = new Person2("Sai", 39);

            System.out.println("Deserialized Person:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        }
    }



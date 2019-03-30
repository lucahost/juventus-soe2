package ch.juventus.serialization;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;

public class SerializationExercise {

    public static void main(String[] args) {
        HashSet<Car> cars = new HashSet<>(3);
        cars.add(new Car("ZG 1", new CarBrand("Aston Martin")));
        cars.add(new Car("GR 55678", new CarBrand("Subaru")));
        cars.add(new Car("ZH 12345", new CarBrand("VW")));
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cars.ser"))) {
            out.writeObject(cars);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashSet<Car> readCars;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("cars.ser"))) {
            readCars = (HashSet<Car>) in.readObject();
            readCars.forEach(car -> System.out.println(car.getRegistration()));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    private static class Car implements Serializable {
        String registration;
        CarBrand brand;

        public Car(String registration, CarBrand brand) {
            this.registration = registration;
            this.brand = brand;
        }

        public String getRegistration() {
            return registration;
        }

        public CarBrand getBrand() {
            return brand;
        }
    }

    private static class CarBrand implements Serializable {
        String name;

        public CarBrand(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

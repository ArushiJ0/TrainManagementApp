import java.util.List;
import java.util.ArrayList;

public class TrainManagementApp {

    public static void addBogie(List<String> bogies, String bogieName) {
        bogies.add(bogieName);
        System.out.println("Bogie " + bogieName + " added to the train.");
    }

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train");
        System.out.println("=======================================================");

        List<String> passengerBogies = new ArrayList<>();

        addBogie(passengerBogies, "B1");
        addBogie(passengerBogies, "B2");
        addBogie(passengerBogies, "B3");

        System.out.println("\nCurrent Bogies in Train:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}
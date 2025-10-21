package Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed, speedLimit;
        String vehicleType;

        while(true){
            System.out.print("Enter vehicle type(Car, Bus, Bike): ");
            vehicleType = sc.nextLine();

            System.out.print("Enter speed: ");
            speed = sc.nextInt();
            sc.nextLine();

            if(speed < 0){
                System.out.println("Exiting system...");
                break;
            }

            speedLimit = switch (vehicleType) {
                case "Car" -> 100;
                case "Bus" -> 80;
                case "Bike" -> 60;
                default -> 0;
            };

            if(vehicleType.equals("Car") || vehicleType.equals("Bus") || vehicleType.equals("Bike")) {
                if (speed < speedLimit) {
                    System.out.println("Speed OK ");
                } else {
                    System.out.println("Speeding ");
                }
            } else {
                System.out.println("Unknown vehicle type ");
            }
        }
    }
}

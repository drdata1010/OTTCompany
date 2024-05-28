package org.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        CustomerPlan customerPlan = new CustomerPlan();

        StreamingService netflix = new Netflix();
        StreamingService amazonPrime = new Prime();
        StreamingService hotstar = new Hotstar();

        System.out.print("Viewing hours for Netflix: ");
        int netflixHours = scanner.nextInt();
        customerPlan.addServiceHours(netflix, netflixHours);

        System.out.print("Viewing hours for Amazon Prime: ");
        int amazonPrimeHours = scanner.nextInt();
        customerPlan.addServiceHours(amazonPrime, amazonPrimeHours);

        System.out.print("Viewing hours for Hotstar: ");
        int hotstarHours = scanner.nextInt();
        customerPlan.addServiceHours(hotstar, hotstarHours);

        int totalCost = customerPlan.calculateTotalCost();
        System.out.println("Total amount should be paid: Rs." + totalCost);

        scanner.close();
    }
}
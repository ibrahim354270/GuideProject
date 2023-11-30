package controller;

import config.HibernateUtils;

import java.util.Scanner;

public class GuideManagementSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void displayGuideManagementSystem() {
        boolean exit = false;
        while (!exit) {

            System.out.println("====== Guide Management System Menu ======");
            System.out.println("1. People Operations");
            System.out.println("2. Communication Operations");
            System.out.println("0. Return to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 0:
                    exit = true;
                    System.out.println("Good bye...");
                    HibernateUtils.shutDown();
                    break;
                default:
                    System.out.println("Invalid choice, Please try again");
                    break;

            }
        }
    }
}

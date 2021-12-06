package pl.maciek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isWorking = true;
        while (isWorking) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = sc.nextLine();
            switch (option) {
                case "buy":
                    System.out.println();
                    CoffeeMachine.buyCoffee();
                    CoffeeMachine.isBuying = true;
                    System.out.println();
                    break;
                case "fill":
                    System.out.println();
                    CoffeeMachine.fillTheCoffeeMachine();
                    System.out.println();
                    break;
                case "take":
                    System.out.println();
                    CoffeeMachine.withdrawMoney();
                    System.out.println();
                    break;
                case "remaining":
                    System.out.println();
                    CoffeeMachine.printSupplies();
                    System.out.println();
                    break;
                case "exit":
                    isWorking = false;
                    break;
                default:
                    System.out.println("Incorrect instruction");
                    break;
            }

        }
    }
}

package pl.maciek;

import java.util.Scanner;

public class CoffeeMachine {
    public static int waterAmount = 400;
    public static int milkAmount = 540;
    public static int coffeeBeansAmount = 120;
    public static int cupsAmount = 9;
    public static int cashAmount = 550;
    static boolean isBuying = true;
    public static Scanner sc = new Scanner(System.in);
    public static void printSupplies () {
        System.out.println("The coffee machine has: \n" +
                + waterAmount + " ml of water \n" +
                + milkAmount + " ml of milk \n" +
                + coffeeBeansAmount + " g of coffee beans \n" +
                + cupsAmount + " disposable cups \n" +
                "$" + cashAmount + " of money");
    }

    public static void buyCoffee () {
        while (isBuying) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String coffeeOption = sc.nextLine();
            switch (coffeeOption) {
                case "1":
                    espresso();
                    isBuying = false;
                    break;
                case "2":
                    latte();
                    isBuying = false;
                    break;
                case "3":
                    cappuccino();
                    isBuying = false;
                    break;
                case "back":
                    isBuying = false;
                    break;
                default:
                    System.out.println("Incorrect instruction");
                    break;
            }
        }
    }

    public static void fillTheCoffeeMachine (){
        System.out.println("Write how many ml of water you want to add:");
        waterAmount += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkAmount += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeansAmount += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cupsAmount += sc.nextInt();
    }

    public static void withdrawMoney () {
        System.out.println("I gave you $" + cashAmount);
        cashAmount = 0;
    }

    public static void enoughResources (int water, int milk, int coffeeBeans, int cost) {
        if (waterAmount < water) {
            System.out.println("Sorry, not enough water!");
        } else if (milkAmount < milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeansAmount < coffeeBeans) {
            System.out.println("Sorry, not enough coffee!");
        } else if (cupsAmount == 0) {
            System.out.println("Sorry, no cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            waterAmount -= water;
            milkAmount -= milk;
            coffeeBeansAmount -= coffeeBeans;
            cashAmount += cost;
            cupsAmount--;
        }
    }


    // Coffee list
    public static void espresso () {
        final int WATER = 250;
        final int COFFEE = 16;
        final int COST = 4;
        enoughResources(WATER, 0, COFFEE, COST);
    }
    public static void latte () {
        final int WATER = 350;
        final int MILK = 75;
        final int COFFEE = 20;
        final int COST = 7;
        enoughResources(WATER, MILK, COFFEE, COST);
    }
    public static void cappuccino () {
        final int WATER = 200;
        final int MILK = 100;
        final int COFFEE = 12;
        final int COST = 6;
        enoughResources(WATER, MILK, COFFEE, COST);
    }
}

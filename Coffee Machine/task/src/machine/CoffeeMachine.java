package machine;
import java.util.Scanner;


public class CoffeeMachine {


    public static void main(String[] args) {
        int milk;
        int milkNeeded;
        int milkNeededTotal;
        int water;
        int waterNeeded;
        int waterNeededTotal;
        int beans;
        int beansNeeded;
        int beansNeededTotal;
        int cups;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:" );
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();

        milkNeeded = 50;
        waterNeeded = 200;
        beansNeeded = 15;

        milkNeededTotal = cups * milkNeeded;
        waterNeededTotal = cups * waterNeeded;
        beansNeededTotal = cups * beansNeeded;


        boolean EnoughIngredients = (milkNeededTotal <= milk) && (waterNeededTotal <= water) && (beansNeededTotal <= beans);

        int milkRemaining = milk - milkNeededTotal;
        int waterRemaining =  water - waterNeededTotal;
        int beansRemaining = beans - beansNeededTotal;

        boolean MoreCups = (milkRemaining >= milkNeeded ) && (waterRemaining >= waterNeeded) &&
                (beansRemaining  >= beansNeeded);

        if (EnoughIngredients){
            if (MoreCups) {
                int onlyCups;
                int waterCups = waterRemaining / waterNeeded;
                int beansCups = beansRemaining / beansNeeded;
                onlyCups = Math.min(waterCups, beansCups);
                int milkCups = milkRemaining / milkNeeded;
                onlyCups = Math.min(onlyCups, milkCups);
                System.out.println("Yes, I can make that amount of coffee (and even" + onlyCups + "more than that" );
            }
            else {
                System.out.println("Yes, I can make that amount of coffee");
            }

        }
        else{
            int onlyCups;
            int waterCups = water / waterNeeded;
            int beansCups = beans / beansNeeded;
            onlyCups = Math.min(waterCups, beansCups);
            int milkCups = milk / milkNeeded;
            onlyCups=  Math.min(onlyCups,milkCups);

            System.out.println("No, I can make only" + onlyCups + " cup(s) of coffee");
        }


    }
}

package Pizza;

import java.util.ArrayList;
import java.util.Scanner;
// I was unable to get the porgram to print out any important information. it loops the command  when you try to get it to run a method

public class Pizzeria {
    // 2.New field var named pies that is an array list of pizzaslice Objects.
    static ArrayList<PizzaSlice> pies;

    // Create a Constructor and intialize the pies array to a new array list
    Pizzeria() {
        pies = new ArrayList<>();
    }

    // 3.Create a method called addPizza that will add a PizzaSlice object to the
    // pies ArrayList.
    public void addpizza(PizzaSlice pizzas) {
        pies.add(pizzas);
        System.out.println(pies);

    }

    // 5. Create a method called eatPizza that consume a PizzaSlice
    public void eatPizza() {

        PizzaSlice.eatAPizzaSlice();
        System.out.println("you ate a pizza:");
        PizzaSlice.getEaten();
        PizzaSlice.getName();
        PizzaSlice.getDescription();

        System.out.println(pies);

    }

    // 6. Create a method called printSlices that will print out all of the
    // PizzaSlice objects in the arraylist.
    public static void printslices() {
        for (PizzaSlice pz : pies) {
            pz.getDescription();
            PizzaSlice.getName();
            pz.getPrice();
            System.out.println(pz);
        }
    }

    // 7. Create a method called totalSlicesEaten that will return the total number
    // of Pizza slices eaten
    public static void totalSlicesEaten() {

        System.out.println("Name of pizza");
        PizzaSlice.getName();

        System.out.println("Amount of Pizza eaten ");
        PizzaSlice.getEaten();
        System.out.println(pies);

        System.out.println("Amount of pizza left");
        System.out.println(pies);

    }

    // 8. Create a method called printOptions that will print out the Menu options.
    public static void printOptions() {
        String printMenu = "Pizza Eating Program:\n" + "1. See all slice of Pizza\n" + "2. Add a new pizza Slice\n"
                + "3.Eat a Pizza Slice\n" + "4.see Total Slices eaten\n" + "5.Reset Pizza Eaten\n"
                + "6.Exit the program\n";

        System.out.println(printMenu);
    }

    // Bonus: Reset method to restart amount of pizza
    public void resetTotal() {
        System.out.println("reseting amount of pizzas eatten\n");
        PizzaSlice.resetEaten();
        System.out.println("amount eaten is: " + pies);

    }

    public static void main(String[] args) {
        printOptions();
        // 10. Inside the main method, create a new Pizzeria object.
        Pizzeria pza = new Pizzeria();
        Scanner sc = new Scanner(System.in);
        // Choice set to nextint To look for User input for menu selection
        int choice = sc.nextInt();

        // Print's menu for use, Menu selection will be handeled below
        // 12. Inside the main method and inside the loop, call the printOptions method

        // 13. Inside the main method and inside the loop, prompt and retrieve the
        // user's menu selection.
        do {

            if (choice == 1) {

                pza.printslices();
            } else if (choice == 2) {
                System.out.println("Adding pizza Slice");
                Double pizza = sc.nextDouble();
                pza.addpizza(new PizzaSlice());

            } else if (choice == 3) {
                System.out.println("Eat a pizza");
                pza.eatPizza();
            } else if (choice == 4) {
                pza.totalSlicesEaten();
            } else if (choice == 5) {
                pza.resetTotal();
            } else if (choice == 6) {
                System.out.println("Ending Program");
                System.exit(0);
                sc.close();
            }
        } while (choice != 5);
        ;
    }
}

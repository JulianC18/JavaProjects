package Pizza;

/*
 * This class will be used for Lab 3 - Exam.
 * 
 * Please place your answers to the Question here:
 *
 */

/**
 * The pizza slice will contain some details on it
 * and a count of the number of pizza slices consumed.
 * @author 
 */
public class PizzaSlice {
    
    //Field Variables
    private static String name;       //Pizza's name
    private double price;           //Pizza's price
    private static String description;     //Short description of the Pizza
    //#1 - Create field variable for # pizza slices eaten
    private static int eaten;
    
    public PizzaSlice()
    {
        name = "";
        price = 0;
        description = "";
        //#2 - Default field to 0
        eaten = 0;
    }
    
    //#3 - Create a constructor that allows you to set all 3 values
    PizzaSlice(String pizzaName, double price, String description)
    {
        name = pizzaName;
        this.price = price;
        this.description = description;
        eaten = 0;
    }

    /**
     * @return PizzaSlice Name
     */
    public static String getName() {
        return name;
    }

    /**
     * Set the PizzaSlice Name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return PizzaSlice's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the PizzaSlice's price
     * @param price 
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return The PizzaSlice's description
     */
    public static String getDescription() {
        return description;
    }

    /**
     * Set the PizzaSlice's description.
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    //#4 - Create a method to get the # of pizza slices eaten
    public static int getEaten() {
        return eaten;
    }
    
    //#5 - Create the eatAPizzaSlice method
    public static void eatAPizzaSlice() {
        eaten = eaten + 1;
    }
    
    //#6 - Create the toString method
    public String toString() {
        return "PizzaSlice:\n" +
                "Name: " + name + "\n" +
                "Price: $" + price + "\n" +
                "Description: " + description + "\n" +
                "# of eaten slices: " + eaten + "\n";
    }
    
    public static int resetEaten() {
        int current = eaten;
        eaten = 0;
        return current;
    }
    
    public static void main(String[] args) {
        PizzaSlice theHut = new PizzaSlice();
        theHut.setName("Bacon Pan Pizza");
        theHut.setDescription("Dogs don't know its not bacon!");
        theHut.setPrice(8.95);
        System.out.println(theHut.toString());
        theHut.eatAPizzaSlice();
        theHut.eatAPizzaSlice(); 
        System.out.println(theHut.toString());
        
        PizzaSlice papaJohns = new PizzaSlice("Hawaiian Pizza", 7.99, "Cowabunga!");
        System.out.println(papaJohns.toString());
        
        papaJohns.eatAPizzaSlice();
        papaJohns.eatAPizzaSlice();
        papaJohns.eatAPizzaSlice();
        papaJohns.eatAPizzaSlice();
        if (papaJohns.getEaten() <= 2) {
            System.out.println("Pizza is just started");
        }
        else if (papaJohns.getEaten() >= 4) {
            System.out.println("Pizza is " + (papaJohns.getEaten() >= 8 ? "" : "almost" )+ " gone");
        } else {
            
            System.out.println(papaJohns.toString());
        }
        
        switch(papaJohns.getEaten()) {
            case 1://if eaten == 1
                ;
            case 2:
                ;//else if eaten == 2
            case 3://else if eaten == 3
                break;
            case 4://else if eaten == 4
                ;
            default://else
                ;
        }
        
    }
}

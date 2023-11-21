
package builderpattren;

import java.util.Scanner;


public class Builderpattren {


    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = new Meal();

        Scanner scanner = new Scanner(System.in);

        System.out.println("...Meal Builder...!");
        System.out.println("Select The Option");

        System.out.println("a) Veg Meal");
        System.out.println("b) Non-Veg Meal");
        System.out.println("c) Custom Tea");
        System.out.println("d) Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                meal = mealBuilder.prepareVegMeal();
                break;
            case 2:
                meal = mealBuilder.prepareNonVegMeal();
                break;
            case 3:
                System.out.println("Do you want toCustomize your Tea:");
                System.out.println("Enter sweetness level (0-10):");
                int sweetnessLevel = scanner.nextInt();

                System.out.println("Do you want cream? (true/false):");
                boolean withCream = scanner.nextBoolean();

                System.out.println("Enter spoons count:");
                int spoonsCount = scanner.nextInt();

                meal.addItem(new Tea(sweetnessLevel, withCream, spoonsCount));
                break;
            case 4:
                System.out.println("Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(0);
        }

        System.out.println("Your meal:");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
    }
    
}

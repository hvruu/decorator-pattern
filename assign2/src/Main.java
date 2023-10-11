import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Coffee Menu:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("0. Exit");

            System.out.print("Select a coffee type (1/2) or 0 to exit: ");
            int choice = scanner.nextInt();

            Coffee coffee = null;

            switch (choice) {
                case 1:
                    coffee = new Espresso();
                    break;
                case 2:
                    coffee = new Latte();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            while (true) {
                System.out.println("\nAdd-ons Menu:");
                System.out.println("1. Milk");
                System.out.println("2. Sugar");
                System.out.println("3. Done (Place Order)");

                System.out.print("Select an add-on (1/2/3): ");
                int addonChoice = scanner.nextInt();

                switch (addonChoice) {
                    case 1:
                        coffee = new MilkDecorator(coffee);
                        break;
                    case 2:
                        coffee = new SugarDecorator(coffee);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

                if (addonChoice == 3) {
                    break;
                }
            }

            System.out.println("Your Order: " + coffee.getDescription());
            System.out.println("Total Cost: $" + coffee.cost());
            return;
        }
    }
}

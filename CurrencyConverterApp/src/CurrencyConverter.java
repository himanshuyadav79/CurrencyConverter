import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rates
        double usdToEur = 0.91; // Example: 1 USD = 0.91 EUR
        double usdToInr = 83.0; // Example: 1 USD = 83.0 INR
        double usdToGbp = 0.79; // Example: 1 USD = 0.79 GBP

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Select the currency you want to convert from USD:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. INR (Indian Rupee)");
        System.out.println("3. GBP (British Pound)");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount in USD: ");
        double amountInUsd = scanner.nextDouble();

        double convertedAmount = 0;
        String targetCurrency = "";

        switch (choice) {
            case 1:
                convertedAmount = amountInUsd * usdToEur;
                targetCurrency = "EUR";
                break;
            case 2:
                convertedAmount = amountInUsd * usdToInr;
                targetCurrency = "INR";
                break;
            case 3:
                convertedAmount = amountInUsd * usdToGbp;
                targetCurrency = "GBP";
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
                System.exit(0);
        }

        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);
        scanner.close();
    }
}

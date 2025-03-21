import Easy.TowSum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int choice;

                do {
                        System.out.println("\n==== Leetcode practice ====");
                        System.out.println("1. Two Sum");
                        System.out.println("2. Palindrome Number");
                        System.out.println("3. Roman To Integer");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice: ");

                        while (!scanner.hasNextInt()) {
                                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                                scanner.next();
                        }

                        choice = scanner.nextInt();

                        switch (choice) {
                                case 1:
                                        System.out.println("You selected Two Sum problem.");
                                        TowSum tsProblem = new TowSum(new int[]{3,2,4}, 6);

                                        int[] res = tsProblem.offerSolution();
                                        System.out.println(Arrays.toString(res));
                                        break;
                                case 2:
                                        System.out.println("You selected Palindrome Number problem.");
                                        break;
                                case 3:
                                        System.out.println("You selected Roman To Integer problem.");
                                        break;
                                case 4:
                                        System.out.println("Exiting the program...");
                                        break;
                                default:
                                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                        }
                } while (choice != 4);

                scanner.close();
        }
}
package com.kenzie.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            System.out.println("Welcome to the Kenzie Stock Exchange");
            Scanner in = new Scanner(System.in);
            System.out.println("What is the Stock's name?");
            String name = in.nextLine();
            System.out.println("What is the Stock's ticker symbol?");
            String ticker = in.nextLine();
            System.out.println("What is the Stock's current price?");
            double price = Double.parseDouble(in.nextLine());


        // Create your StockHolding using the values above
        StockHolding newStock = new StockHolding(name, ticker, price);
        // Create your Execution Loop
            // print the menu
        try {

            int selection = 0;
            while (selection != 4) {
                System.out.println("Enter a selection (1-4)");
                System.out.println("1. Check your Balance");
                System.out.println("2. Buy");
                System.out.println("3. Sell");
                System.out.println("4. Exit");
                // collect which option they chose from Scanner
                selection = in.nextInt();
                // perform the operation: Check your balance, buy, sell, or exit
                switch (selection){
                    case 1:
                        System.out.println("You own " + newStock.getNumShares() + " shares of " + newStock.getName() + " ("
                                                                        + newStock.getTicker() + ")");
                        System.out.println("Your balance is: $" + newStock.getBalance());
                        break;
                    case 2:
                        int numShares = 0;
                        System.out.println("How many shares would you like to buy?");
                        numShares = in.nextInt();
                        newStock.buy(numShares);
                        System.out.println("You bought " + numShares + " shares for $" + numShares * newStock.getPrice());
                        break;
                    case 3:
                        System.out.println("How many shares would you like to sell?");
                        int sellingShares = in.nextInt();
                        newStock.sell(sellingShares);
                        if(newStock.getNumShares() >= sellingShares) {
                            System.out.println("You sold " + sellingShares + " shares for $" + newStock.getPrice() * sellingShares);
                            break;
                        }
                        else {
                            System.out.println("You do not have enough shares!");
                        }
                }
                // repeat!
            }
        }
            catch (Exception e){
                System.out.println("error");
            }
        }
        catch (NumberFormatException e){
            System.out.println("A wrong character was entered for one of the selections");
        }

        System.out.println("Goodbye!");
    }
}

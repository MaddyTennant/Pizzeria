/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatime;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author maddy
 */
public class PizzeriaTime {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        console();
    }

    public static void console() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scanner.next();
        System.out.print("Please enter a contact number: ");
        int number = scanner.nextInt();
        System.out.print("Would you like your pizza delivered? (Y/N)");
        String delivery = scanner.next();
        String address = null;
        if (delivery != null && delivery.equalsIgnoreCase("Y")){
            System.out.print("Enter your address: ");
            address = scanner.next();
        }
        System.out.println(String.format("%s, please check the below details "
                + "are correct \r\n"
                + "Contact Number: %d \r\n"
                + "Address: %s \r\n", username, number, (delivery.equalsIgnoreCase("Y")?address:" NA \r\n")));
        
        System.out.println("GOURMET PIZZAS:");
        System.out.println(getGourmetPizza());
        System.out.println("CLASSIC PIZZAS:");
        System.out.println(getClassicPizza());
        
        System.out.println("Please select a pizza from the list (i.e. enter 1 if you would like a Venison Pizza)");
        int pizza = scanner.nextInt();
        String pizzaString = null;
        switch (pizza) {
            case 1:  pizzaString = "Venison Pizza";
                     break;
            case 2:  pizzaString = "Goat Pizza";
                     break;
            case 3:  pizzaString = "Snake Pizza";
                     break;
            case 4:  pizzaString = "Pepperoni Pizza";
                     break;
            case 5:  pizzaString = "Cheese Pizza";
                     break;
            case 6:  pizzaString = "Ham Pizza";
                     break;  
        }
        System.out.println(String.format("Thank you for your selection, how would you like to pay for your %s",
                pizzaString));
        
//        Runtime runtime = Runtime.getRuntime();
//        Process process = runtime.exec("ipconfig"); // you might need the full path
//        InputStream is = process.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
//        String line;
//        String login = br.readLine("Enter your login: ");
//        char[] oldPassword = br.readPassword("Enter your old password: ");
//        while ((line = br.readLine()) != null) {
//        System.out.println(line);
    }
    
    public static Map<Integer,String> getGourmetPizza(){
        Map<Integer,String> setGourmetPizzaList = new HashMap<>();
        setGourmetPizzaList.put(1, "Venison Pizza");
        setGourmetPizzaList.put(2, "Goat Pizza");
        setGourmetPizzaList.put(3, "Snake Pizza");
        return setGourmetPizzaList;
    }
    
    public static Map<Integer,String> getClassicPizza(){
        Map<Integer,String> setClassicPizzaList = new HashMap<>();
        setClassicPizzaList.put(4, "Pepperoni Pizza");
        setClassicPizzaList.put(5, "Cheese Pizza");
        setClassicPizzaList.put(6, "Ham Pizza");
        return setClassicPizzaList;
    }
    
}


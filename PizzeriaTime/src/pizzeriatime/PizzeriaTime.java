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
import java.util.Scanner;

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
        String delivery = scanner.findInLine("Y");
        String address = null;
        if (delivery != null){
            System.out.print("Enter your address: ");
            address = scanner.next();
        }
        System.out.println(String.format("%s, please check the below details "
                + "are correct \r\n"
                + "Contact Number: %d \r\n"
                + "Address: %s \r\n", username, number, (address==null?address:" NA")));

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
}


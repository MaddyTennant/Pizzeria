/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author maddy
 */
public class PizzeriaTime {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
        console();
    }

    private static void console() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{
//        Scanner scanner = new Scanner(System.in);
        JFrame frame = new JFrame();
        UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        SwingUtilities.updateComponentTreeUI(frame);
        String nameInput = JOptionPane.showInputDialog(frame, "Enter your name: ");
        String numberInput = JOptionPane.showInputDialog(frame, "Please enter a contact number: ");
        String addressInput = null;
        int deliveryCost = 0;
        String cardInput = null;
        int pizzaDelivered = JOptionPane.showConfirmDialog(frame,
                "Would you like your pizza delivered? (delivery fee is $5)",
                "Pizzeria",
                JOptionPane.YES_NO_OPTION);
        if (pizzaDelivered == JOptionPane.YES_OPTION) {
            addressInput = JOptionPane.showInputDialog(frame, "Please enter delivery address");
            deliveryCost = 5;
            String paymentSelection = (String) JOptionPane.showInputDialog(frame, "Please select your payment type",
                    "Pizzeria", JOptionPane.QUESTION_MESSAGE, null, getPaymentType(), getPaymentType()[1]);
            if (paymentSelection.equalsIgnoreCase("Visa") || paymentSelection.equalsIgnoreCase("Master Card")){
                cardInput = JOptionPane.showInputDialog(frame, "Please enter your card number ");
                JOptionPane.showMessageDialog(frame, "processing payment...");
                JOptionPane.showMessageDialog(frame, "accepted...");
            } else{
                addressInput = "NA";
                cardInput = "NA";
            }
        }
        JOptionPane.showConfirmDialog(frame, nameInput + "\n" + numberInput + "\n"
                + addressInput + "\n" + cardInput, "Are the below details correct?", JOptionPane.YES_NO_OPTION);
        String pizzaSelection = (String) JOptionPane.showInputDialog(frame, "Please select your pizza",
                "Pizzeria", JOptionPane.QUESTION_MESSAGE, null, getPizza(), getPizza()[1]);
        int pizzaPrice = (20 + deliveryCost);
        JOptionPane.showMessageDialog(frame, "Your " + pizzaSelection + " comes to $" + pizzaPrice
                + " see you soon");
        System.exit(0);
    }

    
    private static String[] getPizza(){
        String setPizzaList[] = {"Venison Pizza", "Goat Pizza", "Snake Pizza", "Pepperoni Pizza", "Cheese Pizza", "Ham Pizza"};
        return setPizzaList;
    }

    private static String[] getPaymentType(){
        String setPaymentTypeList[] = {"Visa", "Master Card", "Cash on delivery"};
        return setPaymentTypeList;
    }
    
}


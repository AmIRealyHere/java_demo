package Bro;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;

public class MakeGUI2 {
    public static void main(String[] args) {
        // Setting font size
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 18)); // Change font and size as needed

        // Setting dialog box size
        UIManager.put("OptionPane.minimumSize", new java.awt.Dimension(400,200)); // Adjust width and height as needed

        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello : " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
    }
}

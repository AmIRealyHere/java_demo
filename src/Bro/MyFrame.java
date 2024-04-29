package Bro;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame Title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(78, 14, 138));
    }
}

package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    Panel container;
    public MainWindow(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        container = new Panel();
        container.setSize(new Dimension(1200, 700));
        container.setBackground(Color.BLUE);
        this.add(container);
        buttons();
        mockHardWork();
    }
    public void buttons() {
        JButton button = new JButton("enter");
        button.setLayout(null);
        container.add(button);
    }
    public void mockHardWork () {
        Integer limit = 100000;
        
        for (Integer i = 0; i < limit; i++) {
            for (Integer j = 0; j < limit; j++) {
                Double random =(double) (Math.random() * 10);
                Double data = Math.pow(2.0, random);
                System.out.println("--> "+ data);
            }
        }
    }
}

package swings;

import javax.swing.*;
import java.awt.*;

public class frame  {
    public static void addVIews(){
        JFrame jFrame = new JFrame();
        jFrame.setSize(1000,800);
        jFrame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setSize(10,10);
        panel.setBackground(Color.blue);
        JLabel jLabel = new JLabel("123",JLabel.CENTER);
        jLabel.setBounds(20,20,40,40);
        jFrame.add(jLabel);
        jFrame.add(panel);
    }


    public static void main(String[] args) {
        addVIews();
    }

}

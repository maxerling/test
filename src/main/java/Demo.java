import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Max Erling
 * Date: 2020-10-19
 * Copyright: MIT
 * Class: Java20B
 */
public class Demo extends JFrame {
    private JPanel mainPanel = new JPanel();
    private JPanel checkBoxPanel = new JPanel();
    private JCheckBox red = new JCheckBox("red", false);
    private JCheckBox yellow = new JCheckBox("yellow", false);
    private JCheckBox blue = new JCheckBox("blue", false );
    private JLabel displayArea = new JLabel("");
    private JFrame frame = new JFrame("Check Box Test");


    /*class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (red.isSelected() && blue.isSelected() && yellow.isSelected()) {
                displayArea.setText("purple");
            } else if (red.isSelected() && blue.isSelected()) {
                displayArea.setText("brown");
            } else if (yellow.isSelected()) {
                displayArea.setText("yellow");
            } else if (!red.isSelected() && !blue.isSelected() && !yellow.isSelected()) {
                displayArea.setText("no color");
            }


        }

    }*/
    Demo() {
        //MyListener l = new MyListener();
        mainPanel.add(checkBoxPanel);
        mainPanel.add(displayArea);
        //more comments
        //ooo
        checkBoxPanel.add(red);
        checkBoxPanel.add(yellow);
        checkBoxPanel.add(blue);

        red.addActionListener(l -> {if (red.isSelected()) displayArea.setText("hi"); if (!red.isSelected()) { displayArea.setText("do");};});
        //yellow.addActionListener(l);
        //blue.addActionListener(l);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setLocation(500,500);
        frame.setVisible(true);
        frame.add(mainPanel);
    }

    public static void main(String[] args) {
        Demo j = new Demo();
    }


}

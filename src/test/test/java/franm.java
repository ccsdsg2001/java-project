package test.test.java;

import javax.swing.*;

public class franm {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JTable table =new JTable(new kcbdata());
        JScrollPane pane =new JScrollPane(table);
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(table);
        frame.pack();
        frame.setVisible(true);
    }

}

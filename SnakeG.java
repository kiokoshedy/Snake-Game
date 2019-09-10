package com.example.java;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SnakeG extends JFrame {

    public SnakeG() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setResizable(true);
        pack();

        setTitle("SnakeGame ~ Kioko");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new SnakeG();
            ex.setVisible(true);
        });
    }
}

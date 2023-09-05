package com.generalassmbly;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsGUI extends JFrame implements ActionListener {
    private JButton rockButton, paperButton, scissorsButton;
    private JLabel resultLabel;

    public RockPaperScissorsGUI() {
        // Set up the JFrame
        setTitle("Rock, Paper, Scissors Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");

        // Create result label
        resultLabel = new JLabel("");

        // Add action listeners to buttons
        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        // Add components to the JFrame
        add(rockButton);
        add(paperButton);
        add(scissorsButton);
        add(resultLabel);

        // Make the JFrame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rockButton) {
            // Handle Rock button click
            // Call your game logic here and update the resultLabel accordingly
            resultLabel.setText("You chose Rock.");
        } else if (e.getSource() == paperButton) {
            // Handle Paper button click
            // Call your game logic here and update the resultLabel accordingly
            resultLabel.setText("You chose Paper.");
        } else if (e.getSource() == scissorsButton) {
            // Handle Scissors button click
            // Call your game logic here and update the resultLabel accordingly
            resultLabel.setText("You chose Scissors.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RockPaperScissorsGUI());
    }
}

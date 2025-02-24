package com.mycompany.mavenproject.classes;

import javax.swing.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Cliente");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Nome");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 50, 80, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 50, 165, 25);
        panel.add(emailText);

        JLabel phoneLabel = new JLabel("Telefone");
        phoneLabel.setBounds(10, 80, 80, 25);
        panel.add(phoneLabel);

        JTextField phoneText = new JTextField(20);
        phoneText.setBounds(100, 80, 165, 25);
        panel.add(phoneText);

        JButton registerButton = new JButton("Registrar");
        registerButton.setBounds(10, 110, 150, 25);
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para registrar o cliente
            }
        });
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividade;

import java.awt.*;
import javax.swing.*;

public class Questao1 extends JFrame{

    public Questao1(){
        super("Login");
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,2));
        c.add(new JLabel("E-Mail"));
        c.add(new JTextField());
        c.add(new JLabel("Senha"));
        c.add(new JPasswordField());
        c.add(new JButton("Login"));
        c.add(new JButton("Cancel"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(700,200);
        
    }
    public static void main(String[] args) {
        new Questao1();
    }
    
}

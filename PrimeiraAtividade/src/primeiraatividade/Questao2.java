/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividade;

import java.awt.*;

import javax.swing.*;


public class Questao2 extends JFrame{
    
    public Questao2(){
    super("Mensagem de confirmação");
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    Container c = getContentPane();
    Container n = new JPanel();
    n.setLayout(new FlowLayout());
    c.add(BorderLayout.NORTH, n);
    n.add(new JLabel("Deseja realmente cadastrar essas informações?"));
    c.add(BorderLayout.CENTER, n);
    n.add(new JButton("OK"));
    n.add(new JButton("Cancel"));
    
    pack();

}
    
    public static void main(String[] args) {
        new Questao2();
    }
}

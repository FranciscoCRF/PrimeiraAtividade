/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividade;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Questao2 extends JFrame{
    
    public Questao2(){
    super("Mensagem de confirmação");
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,200);
    setVisible(true);
    
    Container c = getContentPane();
    Container n = new JPanel();
    n.setLayout(new FlowLayout());
    c.add(BorderLayout.NORTH, n);
    n.add(new JLabel("Deseja realmente cadastrar essas informações?"));
    c.add(BorderLayout.CENTER, n);
    n.add(new JButton("OK"));
    n.add(new JButton("Cancel"));

}
    
    public static void main(String[] args) {
        new Questao2();
    }
}

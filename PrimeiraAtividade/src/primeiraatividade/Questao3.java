/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraatividade;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Francisco
 */
public class Questao3 extends JFrame{
    
    JComboBox<String> combo;
    
    
    public Questao3(){
        super("Cadastro");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        Container c2 = new JPanel();
        JTextField texto = new JTextField();
        combo = new JComboBox<String>();
        combo.addItem("Masculino");
        combo.addItem("Feminino");
        
        JTextArea texto2 = new JTextArea();
        JScrollPane scroll = new JScrollPane(texto2);
        
        c.setLayout(new BorderLayout());
        c2.setLayout(new GridLayout(12,1));

        c2.add(new JLabel("Nome:"));
        c2.add(texto);
        c2.add(new JLabel("Sexo:"));
        c2.add(combo);
        c2.add(new JLabel("Disciplinas: "));
        c2.add(new JCheckBox("POO II"));
        c2.add(new JCheckBox("Redes II"));
        c2.add(new JCheckBox("TCC I"));
        c2.add(new JCheckBox("Auditoria e Segurança da Informação"));
        c2.add(new JCheckBox("Circuitos Digitais"));
        c2.add(new JLabel("Deixe sua opnião sobre o sistema: "));
        c2.add(scroll);
        c.add(BorderLayout.CENTER, new JButton("Cadastrar"));
        
        c.add(BorderLayout.NORTH, c2);
        
        pack();
    }
    
    public static void main(String[] args) {
        new Questao3();
    }
    
}

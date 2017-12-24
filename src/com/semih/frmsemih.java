package com.semih;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.bind.ParseConversionEvent;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmsemih {

	private JFrame frmAna;
	private JTextField textField;
	private JButton Btn1;
	private JButton Btn2;
	private JButton Btn3;
	private JButton Btn4;
	private JButton Btn5;
	private JButton Btn6;
	private JButton Btn7;
	private JButton Btn8;
	private JButton Btn9;
	private JButton Btn0;
	private JButton BtnTopla;
	private JButton BtnCarp;
	private JButton BtnCikar;
	private JButton BtnBol;
	private JButton BtnClear;
	HMIslemler islem = new HMIslemler();
	private int s1=1,s2=1;
	private String op="+";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmsemih window = new frmsemih();
					window.frmAna.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmsemih() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAna = new JFrame();
		frmAna.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmAna.setForeground(new Color(220, 20, 60));
		frmAna.getContentPane().setBackground(new Color(34, 139, 34));
		frmAna.setBackground(new Color(0, 0, 0));
		frmAna.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\vektorel\\Downloads\\calculator.png"));
		frmAna.setTitle("Ana Forum");
		frmAna.setBounds(100, 100, 450, 326);
		frmAna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAna.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0130\u015Flemler");
		lblNewLabel.setBounds(10, 11, 62, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmAna.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(71, 8, 361, 20);
		textField.setBackground(new Color(248, 248, 255));
		frmAna.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton Btnesittir = new JButton("=");
		Btnesittir.setBounds(330, 190, 80, 80);
		Btnesittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				switch (op) {
				case "+":textField.setText(islem.toplam(s1,s2)+"");    break;
				case "-":     break;
				case "*":     break;
				case "/":     break;

				default:
					break;
				}
			}
		});
		Btnesittir.setBackground(new Color(248, 248, 255));
		frmAna.getContentPane().add(Btnesittir);
		
		Btn1 = new JButton("1");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("1");
				textField.setText(textField.getText()+Btn1.getText());
				
			}
		});
		Btn1.setBackground(new Color(248, 248, 255));
		Btn1.setBounds(10, 50, 50, 50);
		frmAna.getContentPane().add(Btn1);
		
		Btn2 = new JButton("2");
		Btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("2");
				textField.setText(textField.getText()+Btn2.getText());
			}
		});
		Btn2.setBackground(new Color(248, 248, 255));
		Btn2.setBounds(70, 50, 50, 50);
		frmAna.getContentPane().add(Btn2);
		
		Btn3 = new JButton("3");
		Btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("3");
				textField.setText(textField.getText()+Btn3.getText());
			}
		});
		Btn3.setBackground(new Color(248, 248, 255));
		Btn3.setBounds(130, 50, 50, 50);
		frmAna.getContentPane().add(Btn3);
		
		Btn4 = new JButton("4");
		Btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("4");
				textField.setText(textField.getText()+Btn4.getText());
			}
		});
		Btn4.setBackground(new Color(248, 248, 255));
		Btn4.setBounds(10, 110, 50, 50);
		frmAna.getContentPane().add(Btn4);
		
		Btn5 = new JButton("5");
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("5");
				textField.setText(textField.getText()+Btn5.getText());
			}
		});
		Btn5.setBackground(new Color(248, 248, 255));
		Btn5.setBounds(70, 110, 50, 50);
		frmAna.getContentPane().add(Btn5);
		
		Btn6 = new JButton("6");
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("6");
				textField.setText(textField.getText()+Btn6.getText());
			}
		});
		Btn6.setBackground(new Color(248, 248, 255));
		Btn6.setBounds(130, 110, 50, 50);
		frmAna.getContentPane().add(Btn6);
		
		Btn7 = new JButton("7");
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("7");
				textField.setText(textField.getText()+Btn7.getText());
			}
		});
		Btn7.setBackground(new Color(248, 248, 255));
		Btn7.setBounds(10, 170, 50, 50);
		frmAna.getContentPane().add(Btn7);
		
		Btn8 = new JButton("8");
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("8");
				textField.setText(textField.getText()+Btn8.getText());
			}
		});
		Btn8.setBackground(new Color(248, 248, 255));
		Btn8.setBounds(70, 170, 50, 50);
		frmAna.getContentPane().add(Btn8);
		
		Btn9 = new JButton("9");
		Btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("9");
				textField.setText(textField.getText()+Btn9.getText());
			}
		});
		Btn9.setBackground(new Color(248, 248, 255));
		Btn9.setBounds(130, 170, 50, 50);
		frmAna.getContentPane().add(Btn9);
		
		Btn0 = new JButton("0");
		Btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//textField.setText("0");
				textField.setText(textField.getText()+Btn0.getText());
			}
		});
		Btn0.setBackground(new Color(248, 248, 255));
		Btn0.setBounds(70, 230, 50, 50);
		frmAna.getContentPane().add(Btn0);
		
		BtnTopla = new JButton("Topla");
		BtnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				op = "+";
				
			}
		});
		BtnTopla.setBackground(new Color(248, 248, 255));
		BtnTopla.setBounds(230, 50, 70, 40);
		frmAna.getContentPane().add(BtnTopla);
		
		BtnCarp = new JButton("\u00C7arp");
		BtnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				op = "*";
			}
		});
		BtnCarp.setBackground(new Color(248, 248, 255));
		BtnCarp.setBounds(230, 170, 70, 40);
		frmAna.getContentPane().add(BtnCarp);
		
		BtnCikar = new JButton("\u00C7\u0131kar");
		BtnCikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				op = "-";
			}
		});
		BtnCikar.setBackground(new Color(248, 248, 255));
		BtnCikar.setBounds(230, 110, 70, 40);
		frmAna.getContentPane().add(BtnCikar);
		
		BtnBol = new JButton("B\u00F6l");
		BtnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				op = "/";
			}
		});
		BtnBol.setBackground(new Color(248, 248, 255));
		BtnBol.setBounds(230, 230, 70, 40);
		frmAna.getContentPane().add(BtnBol);
		
		BtnClear = new JButton("C");
		BtnClear.setBackground(new Color(248, 248, 255));
		BtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BtnClear.setBounds(330, 50, 80, 80);
		frmAna.getContentPane().add(BtnClear);
	}
}

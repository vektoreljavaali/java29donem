package com.Hocam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAnaSayfa {

	private JFrame frmAnaForm;
	private JTextField textField;
	HMIslemler islem = new HMIslemler();
	 int s1=1,s2=1;
	 String opr="+";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAnaSayfa window = new frmAnaSayfa();
					window.frmAnaForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmAnaSayfa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnaForm = new JFrame();
		frmAnaForm.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\vektorel\\Downloads\\if_calculator_103862.png"));
		frmAnaForm.setTitle("Ana form");
		//frmAnaForm.setUndecorated(true);
		frmAnaForm.setBounds(100, 100, 258, 292);
		frmAnaForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAnaForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0130\u015Flem");
		lblNewLabel.setBounds(10, 11, 25, 14);
		frmAnaForm.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(49, 8, 184, 20);
		frmAnaForm.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.setBounds(171, 199, 62, 48);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				s2 = Integer.parseInt(textField.getText());
				switch (opr) {
				case "+":textField.setText(islem.toplama(s1, s2)+"");	break;
				case "-":				break;
				case "*":				break;
				default:				break;
				}
				
			}
		});
		frmAnaForm.getContentPane().add(btnNewButton);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1") ;
			}
		});
		btn1.setBounds(10, 56, 41, 23);
		frmAnaForm.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
			}
		});
		btn2.setBounds(56, 56, 41, 23);
		frmAnaForm.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
			}
		});
		btn3.setBounds(102, 56, 41, 23);
		frmAnaForm.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
			}
		});
		btn4.setBounds(10, 92, 41, 23);
		frmAnaForm.getContentPane().add(btn4);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
			}
		});
		btn8.setBounds(56, 126, 41, 23);
		frmAnaForm.getContentPane().add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		btn0.setBounds(10, 156, 41, 23);
		frmAnaForm.getContentPane().add(btn0);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("7");
			}
			
		});
		btn7.setBounds(10, 126, 41, 23);
		frmAnaForm.getContentPane().add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
			}
		});
		btn6.setBounds(102, 92, 41, 23);
		frmAnaForm.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
			}
		});
		btn5.setBounds(56, 92, 41, 23);
		frmAnaForm.getContentPane().add(btn5);
		
		JButton btnTopla = new JButton("Topla");
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				opr = "+";
				textField.setText("+");
			}
		});
		btnTopla.setBounds(10, 190, 62, 23);
		frmAnaForm.getContentPane().add(btnTopla);
		
		JButton btnCikart = new JButton("\u00C7\u0131kart");
		btnCikart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				opr = "-";
			}
		});
		btnCikart.setBounds(77, 190, 66, 23);
		frmAnaForm.getContentPane().add(btnCikart);
		
		JButton btnCarp = new JButton("\u00C7arp");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				opr = "*";
			}
		});
		btnCarp.setBounds(10, 224, 62, 23);
		frmAnaForm.getContentPane().add(btnCarp);
		
		JButton btnBol = new JButton("B\u00F6l");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1 = Integer.parseInt(textField.getText());
				opr = "/";
			}
		});
		btnBol.setBounds(77, 224, 66, 23);
		frmAnaForm.getContentPane().add(btnBol);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
			}
		});
		btn9.setBounds(102, 126, 41, 23);
		frmAnaForm.getContentPane().add(btn9);
		
		JButton btnNewButton_1 = new JButton("C");
		btnNewButton_1.setBounds(171, 56, 62, 53);
		frmAnaForm.getContentPane().add(btnNewButton_1);
	}
}

package com.rifatcan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAnaSayfa {

	private JFrame frame;
	private JTextField textField;
	HMIslemler islem = new HMIslemler();
	double s1 , s2,sonuc1;
	String opr="+";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAnaSayfa window = new frmAnaSayfa();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIslem = new JLabel("\u0130slem");
		lblIslem.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblIslem);
		
		textField = new JTextField();
		textField.setBounds(55, 8, 160, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				sayigir("1");
			}
		});
		btn1.setBounds(10, 49, 89, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("2");
			}
		});
		btn2.setBounds(109, 49, 89, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("3");
			}
		});
		btn3.setBounds(208, 49, 89, 23);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("4");
			}
		});
		btn4.setBounds(10, 85, 89, 23);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("5");
			}
		});
		btn5.setBounds(109, 85, 89, 23);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("6");
			}
		});
		btn6.setBounds(208, 85, 89, 23);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("7");
			}
		});
		btn7.setBounds(10, 119, 89, 23);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("8");
			}
		});
		btn8.setBounds(109, 119, 89, 23);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("9");
			}
		});
		btn9.setBounds(208, 119, 89, 23);
		frame.getContentPane().add(btn9);
		
		JButton btn10 = new JButton("C");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField.setText("");
				s1=1;
				s2=1;
			}
		});
		btn10.setBounds(10, 153, 89, 23);
		frame.getContentPane().add(btn10);
		
		JButton btn11 = new JButton("0");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				sayigir("0");
			}
		});
		btn11.setBounds(109, 153, 89, 23);
		frame.getContentPane().add(btn11);
		
		JButton btn12 = new JButton("=");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				s2 = Double.parseDouble(textField.getText());
				switch (opr) 
				{
				case "+": 
					textField.setText(islem.toplama(s1, s2) + "");
					sonuc1=islem.toplama(s1, s2);
					break;
				case "-":
					textField.setText(islem.cıkartma(s1, s2) + "");
					sonuc1=islem.toplama(s1, s2);
					break;
				case "*":
					textField.setText(islem.carpma(s1, s2) + "");
					sonuc1=islem.toplama(s1, s2);
					break;
				case "/":
					textField.setText(islem.bolme(s1, s2) + "");
					sonuc1=islem.toplama(s1, s2);
					break;
				case "%":
					textField.setText(islem.bolme(s1, s2) + "");
					sonuc1=islem.toplama(s1, s2);
					break;
				default:
					break;
				}
				opr="=";
			}
		});
		btn12.setBounds(109, 187, 89, 23);
		frame.getContentPane().add(btn12);
		
		JButton btnTopla = new JButton("TOPLA");
		btnTopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				s1 = Double.parseDouble(textField.getText());
				opr = "+";
				textField.setText("+");
			}
		});
		btnTopla.setBounds(307, 49, 89, 23);
		frame.getContentPane().add(btnTopla);
		
		JButton btnCikart = new JButton("CIKART");
		btnCikart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				s1 = Double.parseDouble(textField.getText());
				opr = "-";
				textField.setText("-");
			}
		});
		btnCikart.setBounds(307, 85, 89, 23);
		frame.getContentPane().add(btnCikart);
		
		JButton btnCarp = new JButton("CARP");
		btnCarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				s1 = Double.parseDouble(textField.getText());
				opr = "*";
				textField.setText("*");
			}
		});
		btnCarp.setBounds(307, 119, 89, 23);
		frame.getContentPane().add(btnCarp);
		
		JButton btnBol = new JButton("BOL");
		btnBol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				s1 = Double.parseDouble(textField.getText());
				opr = "/";
				textField.setText("/");
			}
		});
		btnBol.setBounds(307, 153, 89, 23);
		frame.getContentPane().add(btnBol);
		
		JButton btnnokta = new JButton(".");
		btnnokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField.setText(textField.getText() + ".");
			}
		});
		btnnokta.setBounds(208, 153, 89, 23);
		frame.getContentPane().add(btnnokta);
		
		JButton btnmod = new JButton("%");
		btnmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				s1 = Double.parseDouble(textField.getText());
				opr = "%";
				textField.setText("%");
			}
		});
		btnmod.setBounds(307, 187, 89, 23);
		frame.getContentPane().add(btnmod);
		
		JButton btnkareal = new JButton("√");
		btnkareal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				s1 = Double.parseDouble(textField.getText());
				opr = "√";
				textField.setText("√");
			}
		});
		btnkareal.setBounds(307, 221, 89, 23);
		frame.getContentPane().add(btnkareal);
	}
	
	public void sayigir(String sayi)
	{
		String ekrantext = textField.getText();
		if(textField.getText().equals("+") || ekrantext.equals("-") || ekrantext.equals("*") || ekrantext.equals("/"))
		ekrantext = "";
		if(opr.equals("=")) 
		{
			opr="+" ;
			textField.setText("");
			ekrantext="";
			s1=sonuc1;
		}
		textField.setText(ekrantext + sayi);
	}
}

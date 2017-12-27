package com.rifatcan;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmBaglanti {

	private JFrame frame;
	private JTextField kullanici_adi;
	private JTextField sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBaglanti window = new frmBaglanti();
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
	public frmBaglanti() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 272, 163);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKullancAd = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblKullancAd.setBounds(10, 11, 87, 14);
		frame.getContentPane().add(lblKullancAd);
		
		JLabel lblifre = new JLabel("\u015Eifre :");
		lblifre.setBounds(10, 36, 87, 14);
		frame.getContentPane().add(lblifre);
		
		kullanici_adi = new JTextField();
		kullanici_adi.setBounds(91, 5, 144, 20);
		frame.getContentPane().add(kullanici_adi);
		kullanici_adi.setColumns(10);
		
		sifre = new JTextField();
		sifre.setColumns(10);
		sifre.setBounds(91, 33, 144, 20);
		frame.getContentPane().add(sifre);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(146, 64, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
	
	public static void baglantiadaptoru()
	{
		Connection conn1 = null ;
		try 
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) 
			{
			
				e.printStackTrace();
			}
			conn1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SID","kod","bpps");
			if(conn1 != null)
			{
				System.out.println("DB baðlantýsý Baþarýlý.");
			}
			conn1.close();
		} catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
	}
}

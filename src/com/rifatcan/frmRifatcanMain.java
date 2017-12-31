package com.rifatcan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;

import com.Hocam.frmMusteriKayit;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;

public class frmRifatcanMain extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRifatcanMain window = new frmRifatcanMain();
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
	public frmRifatcanMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		frame.setBounds(100, 100, 666, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(10, 11, 174, 467);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("M\u00FC\u015Fteri Kay\u0131t");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmRifatcanMusteriKayit frame = new com.rifatcan.frmRifatcanMusteriKayit();
				frame.main(null);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\vektorel\\Downloads\\if_contact-new_23203.png"));
		btnNewButton.setBounds(10, 11, 154, 23);
		panel.add(btnNewButton);
		
		JButton btnyelikKayt = new JButton("\u00DCyelik Kay\u0131t");
		btnyelikKayt.setBounds(10, 45, 154, 23);
		panel.add(btnyelikKayt);
		
		JButton btnEitimKart = new JButton("E\u011Fitim Kart\u0131");
		btnEitimKart.setBounds(10, 79, 154, 23);
		panel.add(btnEitimKart);
		
		JButton btnSalonKayt = new JButton("Salon Kay\u0131t");
		btnSalonKayt.setBounds(10, 126, 154, 23);
		panel.add(btnSalonKayt);
		
		JButton btnEiticiKat = new JButton("E\u011Fitici Kart\u0131");
		btnEiticiKat.setBounds(10, 160, 154, 23);
		panel.add(btnEiticiKat);
		
		JButton btnAletKayt = new JButton("Alet Kay\u0131t");
		btnAletKayt.setBounds(10, 194, 154, 23);
		panel.add(btnAletKayt);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 113, 154, 2);
		panel.add(separator);
		
		JButton btnGdaIecek = new JButton("G\u0131da - \u0130\u00E7ecek Kay\u0131t");
		btnGdaIecek.setBounds(10, 228, 154, 23);
		panel.add(btnGdaIecek);
		
		JButton btnalanKayd = new JButton("\u00C7al\u0131\u015Fan Kayd\u0131");
		btnalanKayd.setBounds(10, 262, 154, 23);
		panel.add(btnalanKayd);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 296, 154, 2);
		panel.add(separator_1);
		
		JButton btnMteriTakipKart = new JButton("M\u00FC\u015Fteri Takip Kart\u0131");
		btnMteriTakipKart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmRifatcanMusteriTakip frameTakip = new frmRifatcanMusteriTakip();
				frameTakip.main(null);
			}
		});
		btnMteriTakipKart.setBounds(10, 309, 154, 23);
		panel.add(btnMteriTakipKart);
		
		JButton btnGenelRaporlar = new JButton("Genel Raporlar");
		btnGenelRaporlar.setBounds(10, 343, 154, 23);
		panel.add(btnGenelRaporlar);
		
		JButton btnk = new JButton("   \u00C7IKI\u015E");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
			}
		});
		btnk.setIcon(new ImageIcon("C:\\Users\\vektorel\\Downloads\\if_Log Out_27856.png"));
		btnk.setBounds(10, 400, 154, 55);
		panel.add(btnk);
	}
}

package com.Hocam.SporMerkezi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;



import java.awt.Color;
import java.awt.event.WindowStateListener;
import java.text.ParseException;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMain extends JFrame{

	private JFrame frame;
	JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain window = new frmMain();
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
	public frmMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				panel.setBounds(0, 0, 156, frame.getHeight()-28);
			}
		});
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 156, frame.getHeight()-28);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("M\u00FC\u015Fteri Kay\u0131t");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					frmMusteriKayit frmmusterikayit = new frmMusteriKayit();
					frmmusterikayit.setVisible(true);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\vektorel\\Downloads\\if_contact-new_23203.png"));
		btnNewButton.setBounds(10, 11, 136, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u00DCyelik Kay\u0131t");
		btnNewButton_1.setBounds(10, 45, 136, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("E\u011Fitim Kart\u0131");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEgitimKarti frmegitimkarti = new frmEgitimKarti();
				frmegitimkarti.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 79, 136, 23);
		panel.add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 113, 136, 10);
		panel.add(separator);
		
		JButton btnNewButton_3 = new JButton("Salon Kay\u0131t");
		btnNewButton_3.setBounds(10, 134, 136, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("E\u011Fitici Kay\u0131t");
		btnNewButton_4.setBounds(10, 168, 136, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Alet Kay\u0131t");
		btnNewButton_5.setBounds(10, 202, 136, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("G\u0131da - \u0130\u00E7ecek Kayd\u0131");
		btnNewButton_6.setBounds(10, 236, 136, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\u00C7al\u0131\u015Fan Kayd\u0131");
		btnNewButton_7.setBounds(10, 270, 136, 23);
		panel.add(btnNewButton_7);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 304, 136, 10);
		panel.add(separator_1);
		
		JButton btnNewButton_8 = new JButton("M\u00FC\u015Fteri Takip Kart\u0131");
		btnNewButton_8.setBounds(10, 322, 136, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Genel Raporlar");
		btnNewButton_9.setBounds(10, 354, 136, 23);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u00C7IKI\u015E");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_10.setForeground(Color.RED);
		btnNewButton_10.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_10.setIcon(new ImageIcon("C:\\Users\\vektorel\\Downloads\\if_Log Out_27856.png"));
		btnNewButton_10.setBounds(10, 517, 136, 44);
		panel.add(btnNewButton_10);
	}
}

package com.Hocam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class frmAnaSayfa {

	private JFrame frmAnaForm;

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
		frmAnaForm.setBounds(100, 100, 480, 448);
		frmAnaForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

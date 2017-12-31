 package com.rifatcan;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmCollections {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCollections window = new frmCollections();
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
	public frmCollections() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnIlemYap = new JButton("ArrayList");
		btnIlemYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			
			}
		});
		btnIlemYap.setBounds(10, 11, 194, 23);
		frame.getContentPane().add(btnIlemYap);
		
		JList txtlist = new JList();
		txtlist.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtlist.setBounds(221, 11, 194, 390);
		frame.getContentPane().add(txtlist);
		
	}
}

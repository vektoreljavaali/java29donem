package com.sezgin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SporcuKarti {

	private JFrame frmEitimKart;
	private JTextField txtGun;
	private JTextField txtAletID1;
	private JTextField txtSet1;
	private JTextField txtTekrar1;
	private JTextField txtAletID2;
	private JTextField txtSet2;
	private JTextField txtTekrar2;
	private JTextField txtAletID3;
	private JTextField txtSet3;
	private JTextField txtTekrar3;
	private JTextField txtMusteriID;
	JFormattedTextField ftxtTarih;
	JFormattedTextField ftxtSaat;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SporcuKarti window = new SporcuKarti();
					window.frmEitimKart.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public SporcuKarti() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmEitimKart = new JFrame();
		frmEitimKart.setTitle("E\u011E\u0130T\u0130M KARTI");
		frmEitimKart.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sezz\\Desktop\\trainer.gif"));
		frmEitimKart.setBounds(0, -12, 383, 292);
		frmEitimKart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEitimKart.getContentPane().setLayout(null);
		
		JLabel lblTarih = new JLabel("Tarih           :");
		lblTarih.setBounds(10, 36, 66, 14);
		frmEitimKart.getContentPane().add(lblTarih);
		
		JLabel lblGn = new JLabel("G\u00FCn             :");
		lblGn.setBounds(10, 61, 66, 14);
		frmEitimKart.getContentPane().add(lblGn);
		
		JLabel lblSaat = new JLabel("Saat            :");
		lblSaat.setBounds(10, 86, 66, 14);
		frmEitimKart.getContentPane().add(lblSaat);
		
		JLabel lblAletId = new JLabel("Alet ID        :");
		lblAletId.setBounds(10, 111, 66, 14);
		frmEitimKart.getContentPane().add(lblAletId);
		
		JLabel lblSet = new JLabel("Set              :");
		lblSet.setBounds(10, 136, 66, 14);
		frmEitimKart.getContentPane().add(lblSet);
		
		JLabel lblTekrar = new JLabel("Tekrar        :");
		lblTekrar.setBounds(10, 161, 66, 14);
		frmEitimKart.getContentPane().add(lblTekrar);
		
		txtGun = new JTextField();
		txtGun.setColumns(10);
		txtGun.setBounds(86, 58, 86, 20);
		frmEitimKart.getContentPane().add(txtGun);
		
		txtAletID1 = new JTextField();
		txtAletID1.setColumns(10);
		txtAletID1.setBounds(86, 108, 86, 20);
		frmEitimKart.getContentPane().add(txtAletID1);
		
		txtSet1 = new JTextField();
		txtSet1.setColumns(10);
		txtSet1.setBounds(86, 133, 86, 20);
		frmEitimKart.getContentPane().add(txtSet1);
		
		txtTekrar1 = new JTextField();
		txtTekrar1.setColumns(10);
		txtTekrar1.setBounds(86, 158, 86, 20);
		frmEitimKart.getContentPane().add(txtTekrar1);
		
		txtAletID2 = new JTextField();
		txtAletID2.setColumns(10);
		txtAletID2.setBounds(182, 108, 86, 20);
		frmEitimKart.getContentPane().add(txtAletID2);
		
		txtSet2 = new JTextField();
		txtSet2.setColumns(10);
		txtSet2.setBounds(182, 133, 86, 20);
		frmEitimKart.getContentPane().add(txtSet2);
		
		txtTekrar2 = new JTextField();
		txtTekrar2.setColumns(10);
		txtTekrar2.setBounds(182, 158, 86, 20);
		frmEitimKart.getContentPane().add(txtTekrar2);
		
		txtAletID3 = new JTextField();
		txtAletID3.setColumns(10);
		txtAletID3.setBounds(278, 108, 86, 20);
		frmEitimKart.getContentPane().add(txtAletID3);
		
		txtSet3 = new JTextField();
		txtSet3.setColumns(10);
		txtSet3.setBounds(278, 133, 86, 20);
		frmEitimKart.getContentPane().add(txtSet3);
		
		txtTekrar3 = new JTextField();
		txtTekrar3.setColumns(10);
		txtTekrar3.setBounds(278, 158, 86, 20);
		frmEitimKart.getContentPane().add(txtTekrar3);
		
		JButton btnYeniKayt = new JButton("Yeni Kay\u0131t");
		btnYeniKayt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EkranTemiz();
			}
		});
		btnYeniKayt.setBounds(86, 219, 124, 23);
		frmEitimKart.getContentPane().add(btnYeniKayt);
		
		JButton btnSil = new JButton("Temizle");
		btnSil.setBounds(240, 219, 124, 23);
		frmEitimKart.getContentPane().add(btnSil);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(240, 189, 124, 23);
		frmEitimKart.getContentPane().add(btnKaydet);
		
		JLabel lblMteriId = new JLabel("M\u00FC\u015Fteri ID  :");
		lblMteriId.setBounds(10, 11, 66, 14);
		frmEitimKart.getContentPane().add(lblMteriId);
		
		txtMusteriID = new JTextField();
		txtMusteriID.setColumns(10);
		txtMusteriID.setBounds(86, 8, 86, 20);
		frmEitimKart.getContentPane().add(txtMusteriID);
		
		JButton btnDzenle = new JButton("D\u00FCzenle");
		btnDzenle.setBounds(86, 189, 124, 23);
		frmEitimKart.getContentPane().add(btnDzenle);
		
		ftxtTarih = new JFormattedTextField(new MaskFormatter("##.##.####"));
		ftxtTarih.setBounds(86, 33, 86, 20);
		frmEitimKart.getContentPane().add(ftxtTarih);
		
		ftxtSaat = new JFormattedTextField(new MaskFormatter("##:##"));
		ftxtSaat.setBounds(86, 83, 86, 20);
		frmEitimKart.getContentPane().add(ftxtSaat);
	}
	public void EkranTemiz () {
		txtAletID1.setText("");
		txtAletID2.setText("");
		txtAletID3.setText("");
		txtGun.setText("");
		txtMusteriID.setText("");
		txtSet1.setText("");
		txtSet2.setText("");
		txtSet3.setText("");
		txtTekrar1.setText("");
		txtTekrar2.setText("");
		txtTekrar3.setText("");
		ftxtSaat.setText("");
		ftxtTarih.setText("");
		
	}
	
	public void TarihGetir() {
		
		Calendar simdi=Calendar.getInstance();
		int buyil = simdi.get(Calendar.YEAR); 
		
	}
}

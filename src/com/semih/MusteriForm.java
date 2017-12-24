package com.semih;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;

import sun.font.CreatedFontTracker;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MusteriForm {

	private JFrame frmSporMerkeziMteri;
	private JTextField TxtTC;
	private JTextField TxtAdi;
	private JTextField TxtSoyadi;
	JFormattedTextField TxtTelefon;
	JFormattedTextField TxtAcilTelefon;
	JFormattedTextField TxtDogumTarihi;
	JTextPane TxtSaglikDurumu;
	JTextPane TxtAdres;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusteriForm window = new MusteriForm();
					window.frmSporMerkeziMteri.setVisible(true);
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
	public MusteriForm() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmSporMerkeziMteri = new JFrame();
		frmSporMerkeziMteri.getContentPane().setBackground(new Color(135, 206, 250));
		frmSporMerkeziMteri.setTitle("SPOR MERKEZ\u0130 M\u00DC\u015ETER\u0130 KAYIT FORMU");
		frmSporMerkeziMteri.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\icon.png"));
		frmSporMerkeziMteri.setBounds(100, 100, 521, 588);
		frmSporMerkeziMteri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSporMerkeziMteri.getContentPane().setLayout(null);
		
		JLabel LblTC = new JLabel("T.C. :");
		LblTC.setBounds(10, 10, 80, 20);
		frmSporMerkeziMteri.getContentPane().add(LblTC);
		
		JLabel LblAdi = new JLabel("Ad\u0131 :");
		LblAdi.setBounds(10, 40, 80, 20);
		frmSporMerkeziMteri.getContentPane().add(LblAdi);
		
		JLabel LblSoyadi = new JLabel("Soyad\u0131 :");
		LblSoyadi.setBounds(10, 70, 80, 20);
		frmSporMerkeziMteri.getContentPane().add(LblSoyadi);
		
		JLabel LblTelefon = new JLabel("Telefon :");
		LblTelefon.setBounds(10, 100, 80, 20);
		frmSporMerkeziMteri.getContentPane().add(LblTelefon);
		
		JLabel LblAcilTelefon = new JLabel("Acil Telefon :");
		LblAcilTelefon.setBounds(10, 130, 80, 20);
		frmSporMerkeziMteri.getContentPane().add(LblAcilTelefon);
		
		JLabel LblDogumTarihi = new JLabel("Do\u011Fum Tarihi :");
		LblDogumTarihi.setBounds(10, 160, 80, 20);
		frmSporMerkeziMteri.getContentPane().add(LblDogumTarihi);
		
		JLabel LblSaglikDurumu = new JLabel("Sa\u011Fl\u0131k Durumu :");
		LblSaglikDurumu.setBounds(10, 190, 90, 20);
		frmSporMerkeziMteri.getContentPane().add(LblSaglikDurumu);
		
		JLabel LblAdres = new JLabel("Adres :");
		LblAdres.setBounds(10, 330, 50, 20);
		frmSporMerkeziMteri.getContentPane().add(LblAdres);
		
		TxtTC = new JTextField();
		TxtTC.setBounds(100, 10, 100, 20);
		frmSporMerkeziMteri.getContentPane().add(TxtTC);
		TxtTC.setColumns(10);
		
		TxtAdi = new JTextField();
		TxtAdi.setBounds(100, 40, 200, 20);
		frmSporMerkeziMteri.getContentPane().add(TxtAdi);
		TxtAdi.setColumns(10);
		
		TxtAcilTelefon = new JFormattedTextField(new MaskFormatter("0 (###) - ### - ## - ##"));
		TxtAcilTelefon.setBounds(100, 130, 100, 20);
		frmSporMerkeziMteri.getContentPane().add(TxtAcilTelefon);
		
		TxtTelefon = new JFormattedTextField(new MaskFormatter("0 (###) ### ## ##")); 
		TxtTelefon.setBounds(100, 100, 120, 20);
		frmSporMerkeziMteri.getContentPane().add(TxtTelefon);
		
		TxtSoyadi = new JTextField();
		TxtSoyadi.setBounds(100, 70, 200, 20);
		frmSporMerkeziMteri.getContentPane().add(TxtSoyadi);
		TxtSoyadi.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(243, 227, -187, 68);
		frmSporMerkeziMteri.getContentPane().add(textPane);
		
		TxtAdres = new JTextPane();
		TxtAdres.setBounds(100, 330, 360, 120);
		frmSporMerkeziMteri.getContentPane().add(TxtAdres);
		
		JButton BtnYeniKayit = new JButton("Yeni Kay\u0131t");
		BtnYeniKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekraniTemizle();
				
			}
		});
		BtnYeniKayit.setBounds(30, 470, 90, 30);
		frmSporMerkeziMteri.getContentPane().add(BtnYeniKayit);
		
		JButton BtnKaydet = new JButton("Kaydet");
		BtnKaydet.setBounds(160, 470, 90, 30);
		frmSporMerkeziMteri.getContentPane().add(BtnKaydet);
		
		JButton BtnDuzenle = new JButton("D\u00FCzenle");
		BtnDuzenle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BtnDuzenle.setBounds(280, 470, 90, 30);
		frmSporMerkeziMteri.getContentPane().add(BtnDuzenle);
		
		JButton BtnSil = new JButton("Sil");
		BtnSil.setBounds(400, 470, 90, 30);
		frmSporMerkeziMteri.getContentPane().add(BtnSil);
		
		JButton BtnCikis = new JButton("\u00C7\u0131k\u0131\u015F");
		BtnCikis.setBounds(400, 510, 90, 40);
		frmSporMerkeziMteri.getContentPane().add(BtnCikis);
		
		JLabel LblResim = new JLabel("");
		LblResim.setIcon(new ImageIcon("D:\\if_windows_users_506.png"));
		LblResim.setBounds(330, 20, 140, 160);
		frmSporMerkeziMteri.getContentPane().add(LblResim);
		
		TxtSaglikDurumu = new JTextPane();
		TxtSaglikDurumu.setBounds(100, 190, 360, 120);
		frmSporMerkeziMteri.getContentPane().add(TxtSaglikDurumu);
		
		TxtDogumTarihi = new JFormattedTextField(new MaskFormatter("##/##/####"));
		TxtDogumTarihi.setBounds(100, 160, 100, 20);
		frmSporMerkeziMteri.getContentPane().add(TxtDogumTarihi);
	}
	
	public void ekraniTemizle() {
		TxtTC.setText("");
		TxtAdi.setText("");
		TxtSoyadi.setText("");
		TxtTelefon.setText("");
		TxtAcilTelefon.setText("");
		TxtDogumTarihi.setText("");
		TxtSaglikDurumu.setText("");
		TxtAdres.setText("");
		
		
		
	}
}

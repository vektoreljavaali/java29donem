package com.Hocam.SporMerkezi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMusteriKayit extends JFrame{

	private JFrame frmSporMerkeziMteri;
	private JTextField txttckimilk;
	private JTextField txtad;
	private JTextField txtsoyad;
	JFormattedTextField txttelefon;
	JFormattedTextField txtaciltel;
	JFormattedTextField txtdaoguntarihi;
	JTextPane txtsaglikdurumu;
	JTextPane txtadres ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMusteriKayit window = new frmMusteriKayit();
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
	public frmMusteriKayit() throws ParseException{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException  {
		frmSporMerkeziMteri = new JFrame();
		frmSporMerkeziMteri.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\vektorel\\Downloads\\athlete.png"));
		frmSporMerkeziMteri.setTitle("SPOR MERKEZ\u0130 M\u00DC\u015ETER\u0130 KAYIT FORMU");
		frmSporMerkeziMteri.setBounds(100, 100, 429, 484);
		frmSporMerkeziMteri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSporMerkeziMteri.getContentPane().setLayout(null);
		
		
		JLabel lblTcKimlik = new JLabel("T.C. Kimlik");
		lblTcKimlik.setBounds(10, 26, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblTcKimlik);
		
		JLabel lblAd = new JLabel("Ad");
		lblAd.setBounds(10, 51, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblAd);
		
		JLabel lblSoyad = new JLabel("Soyad");
		lblSoyad.setBounds(10, 76, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblSoyad);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(10, 101, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblTelefon);
		
		JLabel lblAcilTel = new JLabel("Acil Tel");
		lblAcilTel.setBounds(10, 126, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblAcilTel);
		
		JLabel lblDoumTarihi = new JLabel("Do\u011Fum Tarihi");
		lblDoumTarihi.setBounds(10, 151, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblDoumTarihi);
		
		JLabel lblSalkDurumu = new JLabel("Sa\u011Fl\u0131k Durumu");
		lblSalkDurumu.setBounds(10, 176, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblSalkDurumu);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setBounds(10, 250, 83, 14);
		frmSporMerkeziMteri.getContentPane().add(lblAdres);
		
		txttckimilk = new JTextField();
		txttckimilk.setBounds(95, 20, 92, 20);
		frmSporMerkeziMteri.getContentPane().add(txttckimilk);
		txttckimilk.setColumns(10);
		
		txtad = new JTextField();
		txtad.setBounds(95, 48, 157, 20);
		frmSporMerkeziMteri.getContentPane().add(txtad);
		txtad.setColumns(10);
		
		txtsoyad = new JTextField();
		txtsoyad.setBounds(95, 73, 157, 20);
		frmSporMerkeziMteri.getContentPane().add(txtsoyad);
		txtsoyad.setColumns(10);
		
		txttelefon = new JFormattedTextField(new MaskFormatter("0 (###)-###-##-##"));
		txttelefon.setBounds(95, 99, 110, 20);
		frmSporMerkeziMteri.getContentPane().add(txttelefon);
		
		txtaciltel = new JFormattedTextField(new MaskFormatter("0 (###)-###-##-##"));
		txtaciltel.setBounds(95, 123, 110, 20);
		frmSporMerkeziMteri.getContentPane().add(txtaciltel);
		
		JFormattedTextField txtdaoguntarihi = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtdaoguntarihi.setBounds(95, 148, 82, 20);
		frmSporMerkeziMteri.getContentPane().add(txtdaoguntarihi);
		
		txtsaglikdurumu = new JTextPane();
		txtsaglikdurumu.setBounds(95, 176, 315, 68);
		frmSporMerkeziMteri.getContentPane().add(txtsaglikdurumu);
		
		txtadres = new JTextPane();
		txtadres.setBounds(95, 250, 315, 82);
		frmSporMerkeziMteri.getContentPane().add(txtadres);
		
		JButton btnYeniKayt = new JButton("Yeni Kay\u0131t");
		btnYeniKayt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ekraniTemizle();	
			}
		});
		btnYeniKayt.setBounds(10, 358, 91, 54);
		frmSporMerkeziMteri.getContentPane().add(btnYeniKayt);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(114, 358, 91, 23);
		frmSporMerkeziMteri.getContentPane().add(btnKaydet);
		
		JButton btnDzenle = new JButton("D\u00FCzenle");
		btnDzenle.setBounds(215, 358, 91, 23);
		frmSporMerkeziMteri.getContentPane().add(btnDzenle);
		
		JButton btnSil = new JButton("Sil");
		btnSil.setBounds(319, 358, 91, 23);
		frmSporMerkeziMteri.getContentPane().add(btnSil);
		
		JButton btnNewButton = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSporMerkeziMteri.setVisible(false);
			}
		});
		btnNewButton.setBounds(319, 405, 91, 41);
		frmSporMerkeziMteri.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\vektorel\\Downloads\\if_windows_users_506.png"));
		lblNewLabel.setBounds(281, 19, 128, 128);
		frmSporMerkeziMteri.getContentPane().add(lblNewLabel);
	}
	
	public void ekraniTemizle() {
		txtaciltel.setText("");
		txtad.setText("");
		txtsoyad.setText("");
		txtadres.setText("");
		txtdaoguntarihi.setText("");
		txtsaglikdurumu.setText("");
		txttckimilk.setText("");
		txttelefon.setText("");		
	}
	
	
}

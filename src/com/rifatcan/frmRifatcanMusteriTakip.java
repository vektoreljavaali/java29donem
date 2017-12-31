package com.rifatcan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmRifatcanMusteriTakip extends JFrame {

	private JFrame frmMteriTakipFormu;
	private JLabel lblDurum;
	private JTextField txtdurum;
	private JLabel lblGiriTarihi;
	private JLabel lblcikis;
	JFormattedTextField txttarih;
	JFormattedTextField txtgirissaati;
	JFormattedTextField txtmusteriid;
	JFormattedTextField txtcýkýssaati;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRifatcanMusteriTakip window = new frmRifatcanMusteriTakip();
					window.frmMteriTakipFormu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmRifatcanMusteriTakip() {
		try {
			initialize();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frmMteriTakipFormu = new JFrame();
		frmMteriTakipFormu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rbarka.INNOVA\\Downloads\\if_piechart_1055011 (1).png"));
		frmMteriTakipFormu.setTitle("M\u00DC\u015ETER\u0130 TAK\u0130P FORMU");
		frmMteriTakipFormu.setBounds(100, 100, 417, 284);
		frmMteriTakipFormu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMteriTakipFormu.getContentPane().setLayout(null);
		
		JLabel lblmusteri = new JLabel("M\u00FC\u015Fteri Id :");
		lblmusteri.setBounds(10, 11, 66, 14);
		frmMteriTakipFormu.getContentPane().add(lblmusteri);
		
		JLabel lblTarih = new JLabel("Tarih :");
		lblTarih.setBounds(10, 42, 46, 14);
		frmMteriTakipFormu.getContentPane().add(lblTarih);
		
		lblDurum = new JLabel("Durum :");
		lblDurum.setBounds(10, 73, 46, 14);
		frmMteriTakipFormu.getContentPane().add(lblDurum);
		
		txtdurum = new JTextField();
		txtdurum.setBounds(119, 70, 272, 20);
		frmMteriTakipFormu.getContentPane().add(txtdurum);
		txtdurum.setColumns(10);
		
		lblGiriTarihi = new JLabel("Giri\u015F Saati :");
		lblGiriTarihi.setBounds(10, 101, 99, 14);
		frmMteriTakipFormu.getContentPane().add(lblGiriTarihi);
		
		lblcikis = new JLabel("\u00C7\u0131k\u0131\u015F Saati :");
		lblcikis.setBounds(10, 126, 99, 14);
		frmMteriTakipFormu.getContentPane().add(lblcikis);
		
		JButton btnYeniKayt = new JButton("Yeni Kay\u0131t");
		btnYeniKayt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ekranýtemizle();
			}
		});
		btnYeniKayt.setBounds(10, 161, 89, 23);
		frmMteriTakipFormu.getContentPane().add(btnYeniKayt);
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.setBounds(109, 161, 89, 23);
		frmMteriTakipFormu.getContentPane().add(btnKaydet);
		
		JButton btnDzenle = new JButton("D\u00FCzenle");
		btnDzenle.setBounds(208, 161, 89, 23);
		frmMteriTakipFormu.getContentPane().add(btnDzenle);
		
		JButton btnSil = new JButton("Sil");
		btnSil.setBounds(307, 161, 89, 23);
		frmMteriTakipFormu.getContentPane().add(btnSil);
		
		JButton btncýkýs = new JButton("\u00C7\u0131k\u0131\u015F");
		btncýkýs.setBounds(307, 212, 89, 23);
		frmMteriTakipFormu.getContentPane().add(btncýkýs);
		
		txttarih = new JFormattedTextField(new MaskFormatter("##-##-####"));
		txttarih.setBounds(119, 39, 272, 20);
		frmMteriTakipFormu.getContentPane().add(txttarih);
		
		txtgirissaati = new JFormattedTextField(new MaskFormatter("##:##:## - hh:mm:ss"));
		txtgirissaati.setBounds(119, 98, 272, 20);
		frmMteriTakipFormu.getContentPane().add(txtgirissaati);
		
		txtcýkýssaati = new JFormattedTextField(new MaskFormatter("##:##:## - hh:mm:ss"));
		txtcýkýssaati.setBounds(119, 123, 272, 20);
		frmMteriTakipFormu.getContentPane().add(txtcýkýssaati);
		
		txtmusteriid = new JFormattedTextField(new MaskFormatter("########"));
		txtmusteriid.setBounds(119, 8, 272, 20);
		frmMteriTakipFormu.getContentPane().add(txtmusteriid);
	}
	
	public void ekranýtemizle()
	{
		txtmusteriid.setText("");
		txtdurum.setText("");
		txttarih.setText("");
		txtgirissaati.setText("");
		txtcýkýssaati.setText("");
	}
}

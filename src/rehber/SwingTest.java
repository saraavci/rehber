/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehber;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class SwingTest {

	private JFrame frame;
	private JTextField txtIsim;
    private JTextField txtCountryCode;
    private JTextField txtCityCode;
    private JTextField txtNumber;
    private JTextArea textArea;
    private static PhoneList pl; 
    private JLabel lblMenu;
    private JRadioButton rdbtnKiiEkle;
    private JRadioButton rdbtnKiiSil;
    private JRadioButton rdbtnNumaraGncelle;
    private JButton btnSil;
    private JButton btnGncelle;
    private JRadioButton rdbtnNumaraGetir;
    private JButton btnGetir;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingTest window = new SwingTest();
					window.frame.setVisible(true);
					pl = new PhoneList();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 553, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIsim = new JLabel("İsim : ");
		lblIsim.setBackground(Color.GRAY);
		lblIsim.setBounds(21, 130, 46, 14);
		frame.getContentPane().add(lblIsim);
		
		txtIsim = new JTextField();
		txtIsim.setEnabled(false);
		txtIsim.setBounds(77, 127, 86, 20);
		frame.getContentPane().add(txtIsim);
		txtIsim.setColumns(10);
		
		JLabel lblTelefon = new JLabel("Telefon : ");
		lblTelefon.setBounds(20, 161, 59, 14);
		frame.getContentPane().add(lblTelefon);
		
		txtCountryCode = new JTextField();
		txtCountryCode.setEnabled(false);
		txtCountryCode.setBounds(77, 158, 30, 20);
		frame.getContentPane().add(txtCountryCode);
		txtCountryCode.setColumns(10);
		
		txtCityCode = new JTextField();
		txtCityCode.setEnabled(false);
		txtCityCode.setBounds(117, 158, 30, 20);
		frame.getContentPane().add(txtCityCode);
		txtCityCode.setColumns(10);
		
		txtNumber = new JTextField();
		txtNumber.setEnabled(false);
		txtNumber.setBounds(157, 158, 86, 20);
		frame.getContentPane().add(txtNumber);
		txtNumber.setColumns(10);
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setEnabled(false);
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Phone ph = new Phone(txtCountryCode.getText(),
					    txtCityCode.getText(),
					    txtNumber.getText());
				
				Person p = new Person(txtIsim.getText(),ph); 
				pl.add(p);
				textArea.setText(pl.display());
				
				txtIsim.setText("");
				txtCountryCode.setText("");
				txtCityCode.setText("");
				txtNumber.setText("");
			}
		});
		
		btnEkle.setBounds(18, 305, 89, 23);
		frame.getContentPane().add(btnEkle);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 197, 507, 97);
		frame.getContentPane().add(textArea);
		
		lblMenu = new JLabel("MENU");
		lblMenu.setBounds(242, 11, 46, 14);
		frame.getContentPane().add(lblMenu);
		
		rdbtnKiiEkle = new JRadioButton("Ki\u015Fi Ekle");
		rdbtnKiiEkle.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				txtIsim.setEnabled(true);
				txtNumber.setEnabled(true);
				txtCityCode.setEnabled(true);
				txtCountryCode.setEnabled(true);
				
				btnEkle.setEnabled(true);
				btnSil.setEnabled(false);
				btnGncelle.setEnabled(false);
			}
		});
		rdbtnKiiEkle.setBounds(200, 32, 109, 23);
		frame.getContentPane().add(rdbtnKiiEkle);
		
		rdbtnKiiSil = new JRadioButton("Ki\u015Fi Sil");
		rdbtnKiiSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtIsim.setEnabled(true);
				txtNumber.setEnabled(false);
				txtCityCode.setEnabled(false);
				txtCountryCode.setEnabled(false);
				
				btnEkle.setEnabled(false);
				btnSil.setEnabled(true);
				btnGncelle.setEnabled(false);
			}
		});
		rdbtnKiiSil.setBounds(200, 58, 109, 23);
		frame.getContentPane().add(rdbtnKiiSil);
		
		rdbtnNumaraGncelle = new JRadioButton("Numara G\u00FCncelle");
		rdbtnNumaraGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txtIsim.setEnabled(true);
				txtNumber.setEnabled(true);
				txtCityCode.setEnabled(true);
				txtCountryCode.setEnabled(true);
				
				btnEkle.setEnabled(false);
				btnSil.setEnabled(false);
				btnGncelle.setEnabled(true);
			}
		});
		rdbtnNumaraGncelle.setBounds(200, 84, 160, 23);
		frame.getContentPane().add(rdbtnNumaraGncelle);
		
		rdbtnNumaraGetir = new JRadioButton("Numara Getir");
		rdbtnNumaraGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnGetir.setEnabled(true);
				btnSil.setEnabled(false);
				btnGncelle.setEnabled(false);
				btnEkle.setEnabled(false);
				
				txtIsim.setEnabled(true);
				txtCountryCode.setEnabled(false);
				txtCityCode.setEnabled(false);
				txtNumber.setEnabled(false);
		   }
		});
		rdbtnNumaraGetir.setBounds(200, 108, 109, 23);
		frame.getContentPane().add(rdbtnNumaraGetir);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnKiiEkle);
		btnGroup.add(rdbtnKiiSil);
		btnGroup.add(rdbtnNumaraGncelle);
		btnGroup.add(rdbtnNumaraGetir);
		
		btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				pl.delete(txtIsim.getText());
				textArea.setText(pl.display());
				
				txtIsim.setText("");
			}
		});
		btnSil.setEnabled(false);
		btnSil.setBounds(154, 305, 89, 23);
		frame.getContentPane().add(btnSil);
		
		btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Phone ph = new Phone(txtCountryCode.getText(),
					    txtCityCode.getText(),
					    txtNumber.getText());
				
				Person p = new Person(txtIsim.getText(),ph); 
				
				pl.update(p);
				textArea.setText(pl.display());
				txtIsim.setText("");
				txtCityCode.setText("");
				txtCountryCode.setText("");
				txtNumber.setText("");
			}
		});
		btnGncelle.setEnabled(false);
		btnGncelle.setBounds(292, 305, 89, 23);
		frame.getContentPane().add(btnGncelle);
		
		btnGetir = new JButton("Getir");
		btnGetir.setEnabled(false);
		btnGetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
                Phone ph = pl.search(txtIsim.getText());
				
                if(ph != null)
                {
				  txtCountryCode.setText(ph.getCountryCode());
				  txtCityCode.setText(ph.getCityCode());
				  txtNumber.setText(ph.getNumber());
                }
                else
                {
                	JOptionPane.showMessageDialog(frame, "Bu kayıt bulunamadı");
                }
			}
		});
		btnGetir.setBounds(403, 305, 89, 23);
		frame.getContentPane().add(btnGetir);
		
		
	}
}


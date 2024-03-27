package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AjoutCli extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldRaisonSocial;
	private JLabel lblNom;
	private JTextField textFieldNom;
	private JLabel lblPrenom;
	private JTextField textFieldPrenom;
	private JLabel lblMail;
	private JTextField textFieldMail;
	private JLabel lblTel;
	private JTextField textFieldTel;
	private JButton btnAddCli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutCli frame = new AjoutCli();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjoutCli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Ajouter un client");
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(30,30,30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(60,179,113));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Client client = new Client();
				client.setVisible(true);
				dispose();
			}
		});
		btnRetour.setBounds(10, 232, 85, 21);
		contentPane.add(btnRetour);
		
		textFieldRaisonSocial = new JTextField();
		textFieldRaisonSocial.setBounds(165, 33, 96, 19);
		contentPane.add(textFieldRaisonSocial);
		textFieldRaisonSocial.setColumns(10);
		
		JLabel lblRaisonSocial = new JLabel("Raison social :");
		lblRaisonSocial.setForeground(new Color(255, 255, 255));
		lblRaisonSocial.setBounds(165, 10, 96, 13);
		contentPane.add(lblRaisonSocial);
		
		lblNom = new JLabel("Nom :");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setBounds(243, 62, 64, 13);
		contentPane.add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(243, 87, 96, 19);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		lblPrenom = new JLabel("Prenom :");
		lblPrenom.setForeground(new Color(255, 255, 255));
		lblPrenom.setBounds(94, 69, 65, 13);
		contentPane.add(lblPrenom);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(94, 87, 96, 19);
		contentPane.add(textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		lblMail = new JLabel("Mail :");
		lblMail.setForeground(new Color(255, 255, 255));
		lblMail.setBounds(94, 119, 77, 13);
		contentPane.add(lblMail);
		
		textFieldMail = new JTextField();
		textFieldMail.setBounds(94, 142, 96, 19);
		contentPane.add(textFieldMail);
		textFieldMail.setColumns(10);
		
		lblTel = new JLabel("Téléphone :");
		lblTel.setForeground(new Color(255, 255, 255));
		lblTel.setBounds(243, 119, 96, 13);
		contentPane.add(lblTel);
		
		textFieldTel = new JTextField();
		textFieldTel.setBounds(243, 142, 96, 19);
		contentPane.add(textFieldTel);
		textFieldTel.setColumns(10);
		
		btnAddCli = new JButton("Ajouter");
		btnAddCli.setBackground(new Color(60,179,113));
		btnAddCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddCli.setBounds(341, 232, 85, 21);
		contentPane.add(btnAddCli);
	}

}

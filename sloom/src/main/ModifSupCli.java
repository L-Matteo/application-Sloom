package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ModifSupCli extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldRS;
	private JTextField textFieldNom;
	private JTextField textFieldPrenom;
	private JTextField textFieldMail;
	private JTextField textFieldTel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifSupCli frame = new ModifSupCli();
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
	public ModifSupCli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Modifier ou supprimer un client");
		contentPane = new JPanel();
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
		
		JComboBox comboBoxNomCli = new JComboBox();
		comboBoxNomCli.setBounds(24, 30, 114, 21);
		contentPane.add(comboBoxNomCli); 
		
		textFieldRS = new JTextField();
		textFieldRS.setBounds(242, 31, 96, 19);
		contentPane.add(textFieldRS);
		textFieldRS.setColumns(10);
		
		JLabel lblRS = new JLabel("Raison social :");
		lblRS.setForeground(new Color(255, 255, 255));
		lblRS.setBounds(242, 10, 106, 13);
		contentPane.add(lblRS);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setBounds(179, 58, 45, 13);
		contentPane.add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(179, 82, 96, 19);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prenom :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(315, 62, 85, 13);
		contentPane.add(lblNewLabel);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(314, 82, 96, 19);
		contentPane.add(textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setForeground(new Color(255, 255, 255));
		lblMail.setBounds(179, 111, 45, 13);
		contentPane.add(lblMail);
		
		textFieldMail = new JTextField();
		textFieldMail.setBounds(179, 134, 96, 19);
		contentPane.add(textFieldMail);
		textFieldMail.setColumns(10);
		
		JLabel lblTel = new JLabel("Téléphone :");
		lblTel.setForeground(new Color(255, 255, 255));
		lblTel.setBounds(315, 111, 95, 13);
		contentPane.add(lblTel);
		
		textFieldTel = new JTextField();
		textFieldTel.setBounds(315, 134, 96, 19);
		contentPane.add(textFieldTel);
		textFieldTel.setColumns(10);
		
		JButton btnModif = new JButton("Modifier");
		btnModif.setBackground(new Color(60,179,113));
		btnModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModif.setBounds(180, 190, 95, 21);
		contentPane.add(btnModif);
		
		JButton btnSup = new JButton("Supprimer");
		btnSup.setBackground(new Color(60,179,113));
		btnSup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSup.setBounds(314, 190, 96, 21);
		contentPane.add(btnSup);
	}

}

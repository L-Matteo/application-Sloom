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
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ModifSupTarif extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textFieldSup;
	private JTextField textFieldCap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifSupTarif frame = new ModifSupTarif();
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
	public ModifSupTarif() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Modifier ou supprimer le tarif");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30,30,30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(60,179,113));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tarif tarif = new Tarif();
				tarif.setVisible(true);
				dispose();
			}
		});
		btnRetour.setBounds(10, 232, 85, 21);
		contentPane.add(btnRetour);
		
		JComboBox comboBoxNomSalle = new JComboBox();
		comboBoxNomSalle.setBounds(20, 43, 111, 21);
		contentPane.add(comboBoxNomSalle);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setBounds(151, 21, 57, 13);
		contentPane.add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(151, 44, 110, 19);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblSup = new JLabel("Supperficie :");
		lblSup.setForeground(new Color(255, 255, 255));
		lblSup.setBounds(151, 84, 74, 13);
		contentPane.add(lblSup);
		
		textFieldSup = new JTextField();
		textFieldSup.setBounds(151, 107, 110, 19);
		contentPane.add(textFieldSup);
		textFieldSup.setColumns(10);
		
		textFieldCap = new JTextField();
		textFieldCap.setBounds(298, 44, 110, 19);
		contentPane.add(textFieldCap);
		textFieldCap.setColumns(10);
		
		JLabel lblCap = new JLabel("Capacité accueil :");
		lblCap.setForeground(new Color(255, 255, 255));
		lblCap.setBounds(298, 21, 110, 13);
		contentPane.add(lblCap);
		
		JComboBox<String> comboBoxEtat = new JComboBox<>();
		comboBoxEtat.setBounds(298, 106, 110, 21);
		comboBoxEtat.addItem("Disponnible");
		comboBoxEtat.addItem("Indisponnible");
		contentPane.add(comboBoxEtat);
		
		JLabel lblEtat = new JLabel("Etat :");
		lblEtat.setForeground(new Color(255, 255, 255));
		lblEtat.setBounds(298, 84, 57, 13);
		contentPane.add(lblEtat);
		
		JButton btnModif = new JButton("Modifier");
		btnModif.setBackground(new Color(60,179,113));
		btnModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModif.setBounds(151, 173, 110, 21);
		contentPane.add(btnModif);
		
		JButton btnSup = new JButton("Supprimer");
		btnSup.setBackground(new Color(60,179,113));
		btnSup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSup.setBounds(298, 173, 110, 21);
		contentPane.add(btnSup);
	}

}

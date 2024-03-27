package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ModifSupSalle extends JFrame {

	ConnexionBase cn = new ConnexionBase();
	Statement st;
	ResultSet rst;
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
					ModifSupSalle frame = new ModifSupSalle();
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
	public ModifSupSalle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Modifier ou supprimer une salle");
		setResizable(true);
		contentPane.setBackground(new Color(30,30,30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Retour
		JButton btnRetour = new JButton("Retour");
		btnRetour.setBackground(new Color(60,179,113));
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salle salle = new Salle();
				salle.setVisible(true);
				dispose();
			}
		});
		btnRetour.setBounds(10, 232, 85, 21);
		contentPane.add(btnRetour);
		//formulaire
		JComboBox<String> comboBoxNom = new JComboBox<>();
		comboBoxNom.setBounds(22, 48, 116, 21);
		contentPane.add(comboBoxNom);
		try {
			String requeteNomSalle = "select nomEspace from espace";
			st = cn.laconnexion().createStatement();
			rst = st.executeQuery(requeteNomSalle);
			while(rst.next()) {
				String nomSalle = rst.getString("nomSalle");
				comboBoxNom.addItem(nomSalle);
			}
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(contentPane,"ERREUR | Problème de connexion à la base de données", "ERREUR",
			JOptionPane.ERROR_MESSAGE);
		}
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setForeground(new Color(255,255,255));
		lblNom.setBounds(168, 25, 73, 13);
		contentPane.add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(168, 49, 96, 19);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblSup = new JLabel("Supperficie :");
		lblSup.setForeground(new Color(255,255,255));
		lblSup.setBounds(168, 78, 97, 13);
		contentPane.add(lblSup);
		
		textFieldSup = new JTextField();
		textFieldSup.setBounds(168, 101, 96, 19);
		contentPane.add(textFieldSup);
		textFieldSup.setColumns(10);
		
		JLabel lblCap = new JLabel("Capacité d'accueil :");
		lblCap.setForeground(new Color(255, 255, 255));
		lblCap.setBounds(292, 25, 124, 13);
		contentPane.add(lblCap);
		
		textFieldCap = new JTextField();
		textFieldCap.setBounds(292, 49, 103, 19);
		contentPane.add(textFieldCap);
		textFieldCap.setColumns(10);
		
		JLabel lblEtat = new JLabel("Etat :");
		lblEtat.setForeground(new Color(255,255,255));
		lblEtat.setBounds(292, 78, 45, 13);
		contentPane.add(lblEtat);
		
		JComboBox<String> comboBoxEtat = new JComboBox<>();
		comboBoxEtat.setBounds(292, 100, 110, 21);
		comboBoxEtat.addItem("Disponnible");
		comboBoxEtat.addItem("Indisponnible");
		contentPane.add(comboBoxEtat);
		
		JButton btnMod = new JButton("modifier");
		btnMod.setBackground(new Color(60,179,113));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = textFieldNom.getText();
				double superficie = Double.parseDouble(textFieldSup.getText());
				double capAcc = Double.parseDouble(textFieldCap.getText());
				String etatSelect = (String)comboBoxEtat.getSelectedItem();
				boolean etat;
				if(etatSelect.equals("Disponnible")) {
					etat = true;
				}else {
					etat = false;
				}
				try {
					String requeteModif = "UPDATE espace SET nomEspace ='"+ nom +"', superfEspace = "+ superficie +", dispo = "+ etat +", capaciteAcc ="+ capAcc +", dispo ="+ etat +"; ";
					st=cn.laconnexion().createStatement();
					int result = st.executeUpdate(requeteModif);
					if (result >0) {
						JOptionPane.showMessageDialog(contentPane,"La salle a été modifier");
					} else {
						JOptionPane.showMessageDialog(contentPane, "Echec de modification de la salle", "ERREUR", JOptionPane.ERROR_MESSAGE);
					}
	
				}catch(SQLException ex){
					JOptionPane.showMessageDialog(contentPane, "Echec de modification de la salle", "ERREUR", JOptionPane.ERROR_MESSAGE);
				}	
			}
		});
		btnMod.setBounds(168, 167, 96, 21);
		contentPane.add(btnMod);
		
		JButton btnSup = new JButton("supprimer");
		btnSup.setBackground(new Color(60,179,113));
		btnSup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//try {
					//String requeteSup = "DELETE FROM espace WHERE id ="
				//}catch() {
					
				//}
			}
		});
		btnSup.setBounds(292, 167, 96, 21);
		contentPane.add(btnSup);
		
	}
}

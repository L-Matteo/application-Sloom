package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ajoutSalle extends JFrame {

	ConnexionBase cn=new ConnexionBase();
	Statement st;
	ResultSet rst;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNom;
	private JTextField textFieldSup;
	private JTextField textFieldTar;
	private JTextField textFieldCap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ajoutSalle frame = new ajoutSalle();
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
	public ajoutSalle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Ajouter une salle");
		setResizable(true);
		contentPane.setBackground(new Color(30,30,30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//formulaire 
		JLabel lbl = new JLabel("Veuillez remplir le formulaire ci-dessous");
		lbl.setForeground(new Color(255, 255, 255));
		lbl.setBounds(114, 22, 277, 13);
		contentPane.add(lbl);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setBounds(39, 62, 45, 13);
		contentPane.add(lblNom);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(39, 82, 96, 19);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel lblSup = new JLabel("Supperficie :");
		lblSup.setForeground(new Color(255, 255, 255));
		lblSup.setBounds(39, 111, 96, 13);
		contentPane.add(lblSup);
		
		textFieldSup = new JTextField();
		textFieldSup.setBounds(39, 134, 96, 19);
		contentPane.add(textFieldSup);
		textFieldSup.setColumns(10);
		
		textFieldTar = new JTextField();
		textFieldTar.setBounds(164, 82, 96, 19);
		contentPane.add(textFieldTar);
		textFieldTar.setColumns(10);
		
		JLabel lblTarif = new JLabel("Tarif :");
		lblTarif.setForeground(new Color(255, 255, 255));
		lblTarif.setBounds(164, 62, 96, 13);
		contentPane.add(lblTarif);
		
		JLabel lblCap = new JLabel("Capacité d'accueil :");
		lblCap.setForeground(new Color(255, 255, 255));
		lblCap.setBounds(164, 111, 116, 13);
		contentPane.add(lblCap);
		
		textFieldCap = new JTextField();
		textFieldCap.setBounds(164, 134, 96, 19);
		contentPane.add(textFieldCap);
		textFieldCap.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addItem("Disponnible");
		comboBox.addItem("Indisponnible");
		comboBox.setBounds(300, 107, 108, 21);
		contentPane.add(comboBox);
		
		
		JButton btnAdd = new JButton("Ajouter");
		btnAdd.setBackground(new Color(60,179,113));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = textFieldNom.getText();
				double superficie = Double.parseDouble(textFieldSup.getText());
				double tarif = Double.parseDouble(textFieldTar.getText());
				double capAccueil = Double.parseDouble(textFieldCap.getText());
				String etatSelectionne = (String) comboBox.getSelectedItem();
		        boolean etat;
		        if (etatSelectionne.equals("Disponible")) {
		            etat = true;
		        } else {
		            etat = false;
		        }
				
				try {
					String requeteAjout = "INSERT INTO espace (nomEspace, superfEspace, dispo, capaciteAcc) VALUES ('" + nom + "', " + superficie +", " + etat +", " + capAccueil + ")";
					st=cn.laconnexion().createStatement();
					int result = st.executeUpdate(requeteAjout);
					if(result > 0) {
						JOptionPane.showMessageDialog(contentPane, "Salle ajouté avec succès");
					}else {
                		JOptionPane.showMessageDialog(contentPane,"Echec d'ajout de la salle", "Echec Ajout", JOptionPane.ERROR_MESSAGE); 
                	}
				}catch(SQLException ex) {
					JOptionPane.showMessageDialog(contentPane, "ERREUR | Problème de connexion à la base de données", "ERREUR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdd.setBounds(164, 182, 96, 21);
		contentPane.add(btnAdd);
		//retour
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
	}
}

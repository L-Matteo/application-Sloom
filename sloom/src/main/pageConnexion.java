package main;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class pageConnexion extends JFrame {
	
	ConnexionBase cn=new ConnexionBase(); //appel de la page connexionBase
	Statement st;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JPasswordField passwordField;
	private JLabel lblLogin;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageConnexion frame = new pageConnexion();
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
	public pageConnexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 250, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 30, 30)); //couleur de fond 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); //bordure
		setTitle("Connexion"); 
		setSize(600,375);
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//login
		lblLogin = new JLabel("identifiant :");
		lblLogin.setBounds(102, 81, 97, 13);
		lblLogin.setForeground(new Color(255, 255, 255)); //couleur du texte 
		contentPane.add(lblLogin);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(209, 78, 139, 19);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		//password
		lblPassword = new JLabel("mot de passe : ");
		lblPassword.setForeground(new Color(255, 255, 255)); //couleur du texte
		lblPassword.setBounds(102, 121, 97, 13);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 118, 139, 19);
		contentPane.add(passwordField);
		// bouton "se connecter"
		JButton btnConnect = new JButton("se connecter");
		btnConnect.setForeground(new Color(0, 0, 0)); //couleur du texte
		btnConnect.setBackground(new Color(60, 179, 113)); //couleur de fond
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //lorsqu'on appuie sur le bouton "se connecter"
				String login = textFieldLogin.getText();
				char[] password = passwordField.getPassword();
				textFieldLogin.setText(""); //supprimer ce qu'il y a marqué dans le formulaire 
				passwordField.setText(""); 
				try {
					String requete2="select identifiantUtil,mdpUtil from utilisateur where identifiantUtil='"+ login +"' and mdpUtil='"+ new String(password) +"'";
					st=cn.laconnexion().createStatement();
					ResultSet resultSet = st.executeQuery(requete2);
					if(resultSet.next()) {
						JOptionPane.showMessageDialog(contentPane,"Vous êtes connecté.");
						// ouverture de la page d'accueil
						pageAccueil accueil = new pageAccueil(); //appeler la page d'accueil
						accueil.setVisible(true);  //afficher la paghe d'accueil
						dispose(); //fermeture de la page de connexion
					} else {
						JOptionPane.showMessageDialog(contentPane, "Votre identifiant ou votre mot de passe n'est pas correct.", "Erreur login ou password",
						JOptionPane.ERROR_MESSAGE);
					}
						
				}catch(SQLException ex){
					JOptionPane.showMessageDialog(contentPane,"ERREUR | Problème de connexion à la base de données", "Erreur connexion", 
					JOptionPane.ERROR_MESSAGE);
				}
				}
		});
		btnConnect.setBounds(209, 171, 139, 21);
		contentPane.add(btnConnect);
		
	} 
}

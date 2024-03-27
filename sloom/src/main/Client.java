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

public class Client extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
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
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Clients");
		setResizable(true);
		contentPane.setBackground(new Color(30,30,30));

		setContentPane(contentPane);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setBounds(10, 232, 85, 21);
		btnAccueil.setBackground(new Color(60,179,113));
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageAccueil accueil = new pageAccueil();
				accueil.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAccueil);
		
		JButton btnNewCli = new JButton("Nouveau client");
		btnNewCli.setBackground(new Color(60,179,113));
		btnNewCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjoutCli ajoutCli = new AjoutCli();
				ajoutCli.setVisible(true);
				dispose();
			}
		});
		btnNewCli.setBounds(146, 65, 179, 21);
		contentPane.add(btnNewCli);
		
		JButton btnModifSupCli = new JButton("Modifier/Supprimer client");
		btnModifSupCli.setBackground(new Color(60,179,113));
		btnModifSupCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifSupCli modifSupCli = new ModifSupCli();
				modifSupCli.setVisible(true);
				dispose();
			}
		});
		btnModifSupCli.setBounds(146, 127, 179, 21);
		contentPane.add(btnModifSupCli);
	}

}

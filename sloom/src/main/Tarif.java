package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tarif extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarif frame = new Tarif();
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
	public Tarif() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Tarif");
		setResizable(true);
		contentPane.setBackground(new Color(30,30,30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setBackground(new Color(60,179,113));
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageAccueil accueil = new pageAccueil();
				accueil.setVisible(true);
				dispose();
			}
		});
		btnAccueil.setBounds(10, 232, 85, 21);
		contentPane.add(btnAccueil);
		
		JButton btnAjoutTarif = new JButton("Nouveau tarif");
		btnAjoutTarif.setBackground(new Color(60,179,113));
		btnAjoutTarif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjoutTarif ajoutTarif = new AjoutTarif();
				ajoutTarif.setVisible(true);
				dispose();
			}
		});
		btnAjoutTarif.setBounds(130, 77, 171, 21);
		contentPane.add(btnAjoutTarif);
		
		JButton btnModifSupTarif = new JButton("Modifier/Supprimer tarif");
		btnModifSupTarif.setBackground(new Color(60,179,113));
		btnModifSupTarif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifSupTarif modifSupTarif = new ModifSupTarif();
				modifSupTarif.setVisible(true);
				dispose();
			}
		});
		btnModifSupTarif.setBounds(130, 131, 171, 21);
		contentPane.add(btnModifSupTarif);
	}
}

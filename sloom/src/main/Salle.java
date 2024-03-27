package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;

public class Salle extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableSalle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salle frame = new Salle();
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
	public Salle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Salles");
		setResizable(true);
		contentPane.setBackground(new Color(30,30,30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("Que voules-vous faire ?");
		lbl.setBounds(148, 22, 154, 13);
		contentPane.add(lbl);
		lbl.setForeground(new Color(255, 255, 255));
		//retour accueil
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
		//ajouter 
		JButton btnNew = new JButton("nouvelle salle");
		btnNew.setBackground(new Color(60,179,113));
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajoutSalle ajout = new ajoutSalle();
				ajout.setVisible(true);
				dispose();
			}
		});
		btnNew.setBounds(235, 93, 165, 21);
		contentPane.add(btnNew);
		//modifier ou supprimer 
		JButton btnModifSup = new JButton("modifier / supprimer");
		btnModifSup.setBackground(new Color(60,179,113));
		btnModifSup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifSupSalle modifsupsalle = new ModifSupSalle();
				modifsupsalle.setVisible(true);
				dispose();
			}
		});
		btnModifSup.setBounds(235, 128, 165, 21);
		contentPane.add(btnModifSup);
		//Tableau
		DefaultTableModel model = new DefaultTableModel();
		tableSalle = new JTable(model);
		tableSalle.setBounds(74, 93, 0, 0);
		contentPane.add(tableSalle);
		model.addColumn("Nom :");
		model.addColumn("Statut :");
		
	}
}

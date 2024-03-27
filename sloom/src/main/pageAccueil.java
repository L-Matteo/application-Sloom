package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class pageAccueil extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageAccueil frame = new pageAccueil();
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
	public pageAccueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(540, 250, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground (new Color(30,30,30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Page d'accueil");
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//bienvenue
		JLabel lblbienvenue = new JLabel("Bienvenue"); //rajouter ", prenomUtil" 
		lblbienvenue.setBounds(186, 55, 88, 13);
		contentPane.add(lblbienvenue);
		lblbienvenue.setForeground(new Color(255,255,255));
		
		//Salles
		JButton btnSalles = new JButton("Salles");
		btnSalles.setBackground(new Color(60,179,113));
		btnSalles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salle salle = new Salle();
				salle.setVisible(true);
				dispose();
			}
		});
		btnSalles.setBounds(89, 115, 115, 21);
		contentPane.add(btnSalles);
		
		//Reservations
		JButton btnReservations = new JButton("Réservations");
		btnReservations.setBackground(new Color(60,179,113));
		btnReservations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reservation reservation = new Reservation();
				reservation.setVisible(true);
				dispose();
			}
		});
		btnReservations.setBounds(89, 158, 115, 21);
		contentPane.add(btnReservations);
		
		//Clients
		JButton btnClients = new JButton("Clients");
		btnClients.setBackground(new Color(60,179,113));
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Client client = new Client();
				client.setVisible(true);
				dispose();
			}
		});
		btnClients.setBounds(227, 115, 115, 21);
		contentPane.add(btnClients);
		
		//Tarifs
		JButton btnTarifs = new JButton("Tarifs");
		btnTarifs.setBackground(new Color(60,179,113));
		btnTarifs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tarif tarif = new Tarif();
				tarif.setVisible(true);
				dispose();
			}
		});
		btnTarifs.setBounds(227, 158, 115, 21);
		contentPane.add(btnTarifs);
		
	}
}

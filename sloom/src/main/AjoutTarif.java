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

public class AjoutTarif extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutTarif frame = new AjoutTarif();
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
	public AjoutTarif() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Ajouter un tarif");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30,30,30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAcc = new JButton("Retour");
		btnAcc.setBackground(new Color(60,179,113));
		btnAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tarif tarif = new Tarif();
				tarif.setVisible(true);
				dispose();
			}
		});
		btnAcc.setBounds(10, 232, 85, 21);
		contentPane.add(btnAcc);
		
		JComboBox comboBoxNewTarif = new JComboBox();
		comboBoxNewTarif.setBounds(151, 61, 116, 21);
		contentPane.add(comboBoxNewTarif);
		
		textField = new JTextField();
		textField.setBounds(151, 135, 116, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewTarif = new JLabel("Entrez le tarif :");
		lblNewTarif.setForeground(new Color(255, 255, 255));
		lblNewTarif.setBounds(151, 112, 116, 13);
		contentPane.add(lblNewTarif);
		
		JButton btnAdd = new JButton("Ajouter");
		btnAdd.setBackground(new Color(60,179,113));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAdd.setBounds(341, 232, 85, 21);
		contentPane.add(btnAdd);
	}
}

package main;

import java.sql.* ;  

public class ConnexionBase {
	Connection con;
	public ConnexionBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/sloom","user_sloom","mdp");
			System.out.println("connexion reussie");
		}
		catch(Exception ex) {
			System.out.println(" ERREUR | Problème de connexion à la base de données.");
		}
	}
	public Connection laconnexion() {
		return con;
	}

}

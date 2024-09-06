package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** Modulo de conexao **/
	// Parametros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/agenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String passwords = "Cc01102003+";

	// Métodos de conexao
	private Connection conectar() {
		Connection con;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, passwords);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	// teste de conexao
	public void testeconexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
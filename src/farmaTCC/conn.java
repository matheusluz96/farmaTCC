package farmaTCC;

import java.sql.*;

public class conn {
	static String status = ""; // informa status da conn

	public static Connection getConn() {
		Connection conn = null;
		try {
			// driver MySQL/J

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// config previa da conexao
			String hostname = "192.168.0.60";
			String database = "usuarios";
			String user = "bella";
			String pass = "farma";

			// nao alterar essa linha, altere a de cima!
			String url = "jdbc:mysql://" + hostname + "/" + database + "?user=" + user + "&password=" + pass;
			conn = DriverManager.getConnection(url);

			// Se tudo der certo, retornará OK!
			status = "OK!";
		} catch (SQLException e) {
			// Status de excessao mysql
			status = e.getMessage();
		} catch (ClassNotFoundException e) {
			// Status de excessao de classe nao encontrada
			status = e.getMessage();
		} catch (Exception e) {
			// Status de excessao
			status = e.getMessage();
		}
		return conn;
	}

	// Retorna status
	public static void statusConn(){

		System.out.println(status);
	}

	// Fechar conexao

	public static boolean closeConn() {
		try {
			conn.getConn().close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	// reiniciar conexao
	public static java.sql.Connection restartConn() {
		closeConn();
		return conn.getConn();
	}
}

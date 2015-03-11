package br.ufc.quixada.conectionFactorys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		  try {
	            return DriverManager.getConnection(
	          "jdbc:postgresql://localhost:5433/ToDoList", "postgres", "1234");
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	}

}

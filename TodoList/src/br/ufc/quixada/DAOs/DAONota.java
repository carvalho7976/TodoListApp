package br.ufc.quixada.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.ufc.quixada.conectionFactorys.ConnectionFactory;
import br.ufc.quixada.entidades.Nota;

public class DAONota {
	private Connection con;

	public DAONota() {
		this.con = this.getConnection();
	}
	private Connection getConnection(){
		ConnectionFactory factory = new ConnectionFactory();
		return factory.getConnection();
	}

	public boolean criarNota(Nota nota) throws SQLException {
		PreparedStatement p = con
				.prepareStatement("insert into nota (id, status, texto) values (?, ?, ?)");
		p.setInt(1, nota.getId());
		p.setBoolean(2, nota.getStatus());
		p.setString(3, nota.getTexto());
		
		if(p.execute()){
			p.close();
			return true;
		}else{
			p.close();
			return false;
		}
	}	

	public boolean removerNota(int idNota) throws SQLException {
		PreparedStatement p = con
				.prepareStatement("dele from nota where id=?");
		p.setString(1, ""+idNota);
		if(p.execute()){
			p.close();
			return true;
		}else{
			p.close();
			return false;
		}
	}

	public ArrayList<Nota> listarNotas() throws SQLException {
		List<Nota> notas = new ArrayList<Nota>();
		   PreparedStatement p = con.prepareStatement("select * from nota");
		   ResultSet rs = p.executeQuery();
		   while(rs.next()){
		      Nota nota = new Nota();
		      nota.setId(rs.getInt("id"));
		      nota.setStatus(rs.getBoolean("status"));
		      nota.setTexto(rs.getString("texto"));
		      notas.add(nota);
		   }
		return null;
	}
}

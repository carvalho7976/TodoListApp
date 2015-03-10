package br.ufc.quixada.DAOs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.ufc.quixada.entidades.Nota;

public class DAONota {
	private Connection con;

	public DAONota(Connection con) {
		this.con = con;
	}

	public boolean criarNota(Nota nota) throws SQLException {
		PreparedStatement p = con
				.prepareStatement("insert into nota (data, texto) values (?, ?, ?)");
		p.setString(1, nota.getData()+"");
		p.setString(1, nota.getTexto());
		
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

	public ArrayList<Nota> filtrarNota(Date inicio, Date fim) throws SQLException {
		List<Nota> notas = new ArrayList<Nota>();
		   PreparedStatement p = con.prepareStatement("select * from nota");
		   ResultSet rs = p.executeQuery();
		   while(rs.next()){
		      Nota nota = new Nota();
		      nota.setId(rs.getInt("id"));
		      nota.setData(rs.getDate("data"));
		      nota.setTexto(rs.getString("texto"));
		      notas.add(nota);
		   }
		return null;
	}
}

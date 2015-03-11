package br.ufc.quixada.comandos;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.quixada.DAOs.DAONota;
import br.ufc.quixada.entidades.Nota;
import br.ufc.quixada.iterfaces.ICmd;

public class CriarNotaCmd implements ICmd {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		
		
		System.out.println("passou");
		
		String texto = request.getParameter("texto");
		
		Nota nota = new Nota();
		nota.setId(1);
		nota.setStatus(false);
		nota.setTexto(texto);
		DAONota daoNota = new DAONota();
		
		
		try {
			System.out.println("try");
			daoNota.criarNota(nota);
			response.sendRedirect("index.jsp");
		} catch (Exception e) {
			response.sendRedirect("index.jsp");
			e.printStackTrace();;
 		}
		
		
		

	}

}

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
			
		String texto = request.getParameter("texto");
		
		Nota nota = new Nota();
		nota.setStatus(false);
		nota.setTexto(texto);
		DAONota daoNota = new DAONota();
		
		
		try {
			daoNota.criarNota(nota);
		} catch (Exception e) {
			System.out.println("foda-se");
			e.printStackTrace();;
 		}
		response.sendRedirect("index.jsp");
		
		

	}

}

package br.ufc.quixada.comandos;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ufc.quixada.DAOs.DAONota;
import br.ufc.quixada.entidades.Nota;
import br.ufc.quixada.iterfaces.ICmd;

public class ListarNotasCmd implements ICmd {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		DAONota daoNota = new DAONota();
		
		HttpSession sessao = request.getSession();
		
		try {
			ArrayList<Nota> notas = new ArrayList<Nota>();
					sessao.setAttribute("listaNota",notas);
					response.sendRedirect("listar.jsp");
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

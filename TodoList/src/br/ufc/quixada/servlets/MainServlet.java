package br.ufc.quixada.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufc.quixada.comandos.CriarNotaCmd;
import br.ufc.quixada.comandos.ListarNotasCmd;
import br.ufc.quixada.iterfaces.ICmd;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static final Map<String, ICmd> mapaDeAcoes = new HashMap<String, ICmd>();  
    
    public MainServlet() {
        super();
        mapaDeAcoes.put("criarNotaCmd", new CriarNotaCmd());
        mapaDeAcoes.put("listarNotas", new ListarNotasCmd());
    }

	
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("entrando...");
		if(request == null) System.out.println("estou vindo nulo, ");
    	String acao = request.getParameter("acao");
		try{
			ICmd comando = mapaDeAcoes.get(acao);
			System.out.println(comando.getClass().getName());
			comando.executar(request, response);
			
		}catch(Exception e){
			System.out.println("ahhhhhhhh fudeu");
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("index.jsp");
		processRequest(request, response);
	}

}

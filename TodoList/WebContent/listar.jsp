<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="br.ufc.quixada.entidades.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		List<Nota> notas = (ArrayList<Nota>) session
				.getAttribute("listaNota");
	%>
	<table border="1">
		<tr>
			<th align="center">Feito?/!</th>
			<th align="center">Nota</th>
		</tr>

		<%
			if (notas != null) {
				for (int i = 0; i < notas.size(); i++) {
		%>
		<tr>
			<td align="center">
				<%
					if(notas.get(i).status()){%>
						<td align="center"><input type="checkbox" name="notas"
								checked="checked"
								value=""></td>
				
				<%}else{%>
					<td align="center"><input type="checkbox" name="notas" value=""></td>
				
				<%} %>
			</td>

			<td align="center">
				<%
					out.print(notas.get(i).getTexto());
				%>
			</td>


		</tr>
		<%
			}
		%>

		<%
			}
		%>

</body>
</html>
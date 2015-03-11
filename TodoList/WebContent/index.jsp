<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ToDoList App</title>

</head>
<body>
		<h1>Olá</h1>
		
		<input type=button	onClick="location.href='/ToDoListApp/cadastrar.jsp'"   value='Criar Nota'>
			<form action="ServletCentral" method="post">
				<input type="hidden" name="acao" value="listarNotas" />
				<input type="submit"	 value='Listar Notas'>
			</form>
		<input type=button	onClick="location.href='/ToDoListApp/index.jsp'"	value='Cancelar'>
		
</body>
</html>
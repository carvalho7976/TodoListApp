<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Criar nota</title>
<link href="css/todolist.css" rel="stylesheet">
</head>
<body>
		<div id=cadastrarNota >
		<form action="http://localhost:8080/ToDoListApp/MainServlet" method="post">
		<h3>Criar Nota</h3>
			<input type="hidden" name="acao" value="criarNotaCmd" /> 
			<textarea rows="4" cols="50"  name="texto"> </textarea>
			</br>	
			<input type="submit" value="Enviar"	name="btmSubmit" />
			<input type=button	onClick="location.href='/ToDoListApp/index.jsp'"
			value='Cancelar'>
		</form>
		
	
</body>
</html>
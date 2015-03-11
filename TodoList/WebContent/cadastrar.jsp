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
	
		
		<h3>Criar Nota</h3>
		<form action="ServletCentral" method="post">
			<input type="hidden" name="acao" value="criarNotaCmd" />
			<input type="text" name="texto"/> 
			<input type="submit"	 value='Salvar'/>
		</form>
			<input type=button	onClick="location.href='/ToDoListApp/index.jsp'"
			value='Cancelar'>
		
		
	
</body>
</html>
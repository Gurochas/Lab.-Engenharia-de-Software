<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agendamentos</title>
</head>
<body>
	<h1>Lista de Agendamentos</h1>
	
		<h2>Primeiro Agendamento</h2>
			<p>Nome: ${cliente1.nome}</p>
			<p>Cpf: ${cliente1.cpf}</p>
			<p>Data do Agendamento: ${cliente1.dataag}</p>
			
		<h2>Segundo Agendamento</h2>
			<p>Nome: ${cliente2.nome}</p>
			<p>Cpf: ${cliente2.cpf}</p>
			<p>Data do Agendamento: ${cliente2.dataag}</p>
			
		<h2>Terceiro Agendamento</h2>
			<p>Nome: ${cliente3.nome}</p>
			<p>Cpf: ${cliente3.cpf}</p>
			<p>Data do Agendamento: ${cliente3.dataag}</p>
</body>
</html>
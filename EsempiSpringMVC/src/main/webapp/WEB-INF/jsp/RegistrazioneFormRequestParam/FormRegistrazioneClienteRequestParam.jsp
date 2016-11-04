<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>form registrazione Cliente</h1>

      <form  action="/EsempiSpringMVC/registraCliente.html"  method="post">
      
     nome: <input type="text"  name="nome" /><br/>
     cognome:<input type="text"  name="cognome" /><br/>
       eta:<input type="number"  name="eta" /><br/>
     
     <input type="submit" value="Registra" />
      </form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${headerMessage}</h1>

  <h1>Home Page  : ${c.nome}</h1><br/>
  
  nome:    ${c.nome}<br/>
  cognome: ${c.cognome}<br/>
   data nascita:    ${c.dataNascita}<br/>
  cellulare: ${c.cellulare}<br/>
  eta:     ${c.eta}<br/>
  
    sopraNomi:     ${c.sopraNomi}
    
    <br/>
  
    citta:     ${c.inidirizzo.citta}
    <br/>
  
    via:     ${c.inidirizzo.via}
</body>
</html>
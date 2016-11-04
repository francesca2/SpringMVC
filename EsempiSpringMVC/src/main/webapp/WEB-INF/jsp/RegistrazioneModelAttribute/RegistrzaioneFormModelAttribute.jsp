<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${headerMessage}</h1>

<form:errors path="c.*" />

<h1>form registrazione Cliente</h1>

      <form  action="/EsempiSpringMVC/registraCliente_2.html"  method="post">
      
     nome: <input type="text"  name="nome" /><br/>
     cognome:<input type="text"  name="cognome" /><br/>
       eta:<input type="text"  name="eta" /><br/>
        data nascita:<input type="text"  name="dataNascita" /><br/>
       cel.:<input type="text"  name="cellulare" /><br/>
       
      sopraNomi:<select name="sopraNomi" multiple>
      
      <option value="Gino">Gino</option>
      <option value="Zuccherino">Zuccherino</option>
      <option value="rox">rox</option>
      
         </select>
         <br>
         
         Indirizzo:
         <br>
         
        citta:<input type="text"  name="inidirizzo.citta" /><br/>
       via:<input type="text"  name="inidirizzo.via" /><br/>
     
     <input type="submit" value="Registra" />
      </form>

</body>
</html>
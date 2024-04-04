<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  
		
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="index.pr" method="post">
		<table>
			<tr>
				<td>montant: </td>
				<td><input type="text" name="montant"></td>
				<td>DH</td>
			</tr>
			<tr>
				<td>taux: </td>
				<td><input type="text" name="taux"></td>
				<td>%</td>
			</tr>
				<tr>
				<td>Durre: </td>
				<td><input type="text" name="mois"></td>
				<td>mois</td>
			</tr>
		</table>
		<button type="submit">calculer</button>
	
	</form>
	
	
</body>
</html>
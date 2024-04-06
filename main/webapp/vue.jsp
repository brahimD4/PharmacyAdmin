
<%@ page import="metier.Produit" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>les produits</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap2.min.css">
     <link rel="stylesheet" href="css/vue.css">
</head>
<body>
<nav class="navbar navbar-inverse">
       <a class="navbar-brand" href="index.pr">Home</a>
       <a class="navbar-brand" href="NewProduit.pr" id="newProduit"><img id="icon_Ajouter" src="images/ajouter.png"></a>
</nav>
<div class="content">
  <div class="panel panel-primary ">
    <div class="panel-heading d-flex justify-content-between align-items-center">
      <span>les produits</span>
      <form class="navbar-form navbar-left " action="chercher.pr" method="get">
            <input type="text" class="form-control" placeholder="Search" name="nom_produit" value="${model.motCle}">
             <button type="submit" class="btn btn-default">recherche</button>
      </form>
    </div>
    <div class="panel-body">
        <table class="table table-bordered">
            <thead>
              <tr>
                <th>ID</th>
                <th >Nom de produit</th>
                <th>Prix</th>
                <th>Quantite</th>
                <th>Description</th>
                <th >Action</th>
              </tr>
            </thead>
            <tbody>
               <c:forEach items="${Tous_produits.produits}" var="p">
		             <tr>
		                 <td>${p.id}</td>
		                 <td>${p.nomProduit}</td>
		                 <td>${p.prix}</td>
		                 <td>${p.quantite}</td>
		                 <td>${p.description}</td>
		                 <td class="action"><img class="action_icon" src="images/supprimer.png"><img class="action_icon" src="images/editer.png"></td>
		               </tr>
               </c:forEach>

               <c:forEach items="${model.produits}" var="p">
		             <tr>
		                 <td>${p.id}</td>
		                 <td>${p.nomProduit}</td>
		                 <td>${p.prix}</td>
		                 <td>${p.quantite}</td>
		                 <td>${p.description}</td>
		                 <td class="action"><img class="action_icon" src="images/supprimer.png"><img class="action_icon" src="images/editer.png"></td>
		               </tr>
               </c:forEach>
             
            </tbody>
          </table>
    </div>
    <!-- <div class="panel-footer">Panel Footer</div> -->
  </div>
</div>



<!-- <script src="js/main.js"></script> -->
</body>

</html>
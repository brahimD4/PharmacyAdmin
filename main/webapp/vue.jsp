
<%@ page import="metier.Produit" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 

<!DOCTYPE html>
<html>
<head>
    <title>Exemple d'utilisation de JavaBean dans JSP</title>

    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap2.min.css">
     <link rel="stylesheet" href="css/vue.css">
</head>
<body>
<nav class="navbar">
       <a class="navbar-brand" href="#">Home</a>
       <a class="navbar-brand" href="#"><img id="icon_Ajouter" src="images/ajouter.png"></a>
</nav>
<div class="content">
  <div class="panel panel-primary ">
    <div class="panel-heading d-flex justify-content-between align-items-center">
      <span>les produits</span>
      <form class="navbar-form navbar-left " action="">
            <input type="text" class="form-control" placeholder="Search">
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
              <tr>
                <td>1</td>
                <td>Mark</td>
                <td>Otto</td>
                <td>26</td>
                <td>description 1</td>
                <td class="action"><img class="action_icon" src="images/supprimer.png"><img class="action_icon" src="images/editer.png"></td>
              </tr>
              <tr>
                <td>2</td>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>34</td>
                <td>description 1</td>
                <td class="action"><img class="action_icon" src="images/supprimer.png"><img class="action_icon" src="images/editer.png"></td>              </tr>
            </tbody>
          </table>
    </div>
    <!-- <div class="panel-footer">Panel Footer</div> -->
  </div>
</div>

<div class="Ajoute_Produit">
  <form action="">

    <div class="form-group">
      <label for="NomPr">Nom de produit:</label>
      <input type="text" class="form-control" id="NomPr">
    </div>

    <div class="form-group">
      <label for="prix">Prix DH:</label>
      <input type="number" class="form-control" id="prix">
    </div>

    <div class="form-group">
      <label for="quantite">Quantite:</label>
      <input type="number" class="form-control" id="quantite">
    </div>

    <div class="form-group">
      <label for="description">Description:</label>
      <textarea class="form-control" rows="2" id="comment"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Save</button>
  </form>
</div>


</body>

</html>
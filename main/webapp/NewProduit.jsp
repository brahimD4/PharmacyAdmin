<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nouvelleproduit</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap2.min.css">
     <link rel="stylesheet" href="css/vue.css">
</head>
<body>
<div class="Ajoute_Produit">
  <form action="save.pr" method="post">

    <div class="form-group">
      <label for="NomPr">Nom de produit:</label>
      <input type="text" class="form-control" id="NomPr" name="nom_produit">
    </div>

    <div class="form-group">
      <label for="prix">Prix DH:</label>
      <input type="number" class="form-control" id="prix" name="prix">
    </div>

    <div class="form-group">
      <label for="quantite">Quantite:</label>
      <input type="number" class="form-control" id="quantite" name="quantite">
    </div>

    <div class="form-group">
      <label for="description">Description:</label>
      <textarea class="form-control" rows="2" id="comment" name="description"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Save</button>
  </form>
</div>
</body>
</html>
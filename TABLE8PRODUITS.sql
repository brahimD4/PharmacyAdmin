use les_produits;

create table produits(
					id int auto_increment,
					nom_produit varchar(30),
					prix double check(prix>0),
					quantite_en_stock int check(quantite_en_stock>=0),
                    descript varchar(200),
                    primary key(id)
);


SELECT *FROM produits;
SELECT MAX(id) AS MAXID FROM produits;
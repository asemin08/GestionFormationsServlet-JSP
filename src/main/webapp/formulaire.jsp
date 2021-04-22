<%--
  Created by IntelliJ IDEA.
  User: Allan
  Date: 22/04/2021
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <title>Page html5</title>
    <link rel="stylesheet" href="../css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script type="text/javascript" src="../script/etudiant.js" async defer></script>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>

<header class="container mb-5">
    <div class="row">
        <div class="col-md-12 text-center bg-primary">
            <h1>Formulaire identifications</h1>
        </div>
    </div>
</header>

<main class="container">

    <div id="form-content" class="row mt-5 justify-content-md-center">
        <div class="col-md-4  bg-info rounded">
            <form id="form" name="form" method="post" action="Formulaire">
                <div class="col-md-12 row text-center">
                </div>
                <div class="col-md-12 row  mt-2">
                    <div class="col-md-6">
                        <label class="mb-2">Nom : </label>
                    </div>
                    <div class="col-md-6">
                        <input type="text"  class="form-control" name="nom" id="nom" placeholder="nom">
                    </div>
                </div>
                <div class="col-md-12 row  mt-2">
                    <div class="col-md-6">
                        <label class="mb-2">Prénom : </label>
                    </div>
                    <div class="col-md-6">
                        <input type="text"  class="form-control" name="prenom" id="prenom" placeholder="prenom">
                    </div>
                </div>

                <div class="col-md-12 row  mt-2">
                    <div class="col-md-6">
                        <label class="mb-2">Email : </label>
                    </div>
                    <div class="col-md-6">
                        <input type="email"  class="form-control" name="email" id="email" placeholder="email">
                    </div>
                </div>

                <div class="col-md-12 row  mt-2">
                    <div class="col-md-6">
                        <label class="mb-2">login : </label>
                    </div>
                    <div class="col-md-6">
                        <input type="text"  class="form-control" name="login" id="login" placeholder="login">
                    </div>
                </div>

                <div class="col-md-12 row mt-2">
                    <div class="col-md-6">
                        <label class="mb-2">Mot de passe : </label>
                    </div>
                    <div class="col-md-6">
                        <input type="password" class="form-control" name="password" id="password" required placeholder="mot de passe">
                    </div>
                </div>
                <div class="col-md-12 row mt-5">
                    <div class="col-md-6 text-center">
                        <input type="submit" class="btn btn-danger mb-2"  value="retour" id="retour">
                    </div>
                    <div class="col-md-6 text-center">
                        <input type="submit" class="btn btn-outline-success mb-2"  value="valider" id="valider">
                    </div>
                </div>
            </form>
        </div>
    </div>


</main>

</body>
</html>
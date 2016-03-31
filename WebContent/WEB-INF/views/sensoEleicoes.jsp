<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="author" content="Wheslley">
<link rel="icon" href="../../favicon.ico">
<link href="webjars/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">

<title>Votação Online</title>
</head>

<!-- NAVBAR
================================================== -->
<body>
	<div class="navbar-wrapper">
		<div class="container">
			<nav class="navbar navbar-inverse navbar-static-top">
				<div class="container">
					<div class="navbar-header">
						<a class="navbar-brand" type="submit" href="index">Votação
							Online</a> <a class="navbar-brand" type="submit"
							href="historicoEleicoes">Histórico Eleições</a> <a
							class="navbar-brand" type="submit" href="sensoEleicoes">Senso
							Eleições</a>
					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav navbar-right">
							<li><a class="navbar-brand" type="submit" href="aecio">Aécio</a></li>
							<li><a class="navbar-brand" type="submit" href="bolsonaro">Bolsonaro</a></li>
							<li><a class="navbar-brand" type="submit" href="lula">Lula</a></li>
							<li><a class="navbar-brand" type="submit" href="marina">Marina</a></li>
							<li><a></a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>

	<div class="container marketing">

		<hr class="featurette-divider">

		<div class="row featurette">
			<div class="col-md-7 col-md-push-5">
				<h1 class="featurette-heading"><b>Senso das Eleições
					Presidenciais:</b></h1>
				<br>
				<br>

				<table class="table table-hover">

					<tr>
						<td><p class="lead">Candidato</p></td>
						<td><p class="lead">Número de Votos</p></td>
					</tr>

					<c:forEach items="${listaCandidato}" var="candidato">

						<tr>
							<td><p class="lead">${candidato.nomeCandidato}</p></td>
							<td><p class="lead">${candidato.votos_candidato}</p></td>
						</tr>

					</c:forEach>

				</table>

			</div>
			<div class="col-md-5 col-md-pull-7">
				<img src="img/	estatistica.jpg" alt="Senso Eleições"
					style="width: 450px; height: 400px;">
			</div>
		</div>

		<footer>
			<p class="pull-right">
				<a href="#">Back to top</a>
			</p>
			<p>&copy; 2016 Company, Inc. &middot;
		</footer>
	</div>

	<script src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script src="webjars/jquey/2.0.3/js/jquery.min.js"></script>
</body>
</html>

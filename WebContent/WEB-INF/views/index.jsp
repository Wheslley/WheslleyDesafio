<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<script type="text/javascript">
	$('#myModal').on('shown.bs.modal', function() {
		$('#myInput').focus()
	})
</script>

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

		<div class="row">
			<div class="col-lg-5">
				<div class="col-lg-9">
					<img class="img-circle" src="img/aecio.jpg" alt="Aécio Neves"
						width="300" height="250">
				</div>
				<div class="col-lg-3" align="center">
					<h1><b>Aécio</b></h1>
					<p>
						<a class="btn btn-primary" type="submit" href="votoAecio"
							role="button">Votar &raquo;&raquo;</a>
					</p>
					<br><br>
					<h1>
						${aecio}
					</h1>
					<p>votos</p>
				</div>
			</div>

			<div class="col-lg-5 col-lg-offset-1">
				<div class="col-lg-9">
					<img class="img-circle" src="img/bolsonaro.jpg"
						alt="Jair Bolsonaro" width="300" height="250">
				</div>
				<div class="col-lg-3" align="center">
					<h1><b>Bolsonaro</b></h1>
					<p>
						<a class="btn btn-primary" type="submit" href="votoBolsonaro"
							role="button">Votar &raquo;&raquo;</a>
					</p>
					<br><br>
					<h1>
						${bolsonaro}
					</h1>
					<p>votos</p>
				</div>
			</div>
		</div>
		<br />

		<hr class="featurette-divider">

		<div class="row">
			<div class="col-lg-5">
				<div class="col-lg-9">
					<img class="img-circle" src="img/lula.jpg"
						alt="Luis Inácio da Silva" width="300" height="250">
				</div>
				<div class="col-lg-3" align="center">
					<h1><b>Lula</b></h1>
					<p>
						<a class="btn btn-primary" type="submit" href="votoLula"
							role="button">Votar &raquo;&raquo;</a>
					</p>
					<br><br>
					<h1>
						${lula}
					</h1>
					<p>votos</p>
				</div>
			</div>

			<div class="col-lg-5 col-lg-offset-1">
				<div class="col-lg-9">
					<img class="img-circle" src="img/marina.jpg" alt="Marina Silva"
						width="300" height="250">
				</div>
				<div class="col-lg-3" align="center">
					<h1><b>Marina</b></h1>
					<p>
						<a class="btn btn-primary" type="submit" href="votoMarina"
							role="button">Votar &raquo;&raquo;</a>
					</p>
					<br><br>
					<h1>
						${marina}
					</h1>
					<p>votos</p>
				</div>
			</div>
		</div>
		<br />

		<!-- mascara para cobrir o site -->
		<div id="mascara"></div>

		<hr class="featurette-divider">

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

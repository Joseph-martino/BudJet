<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="ressources/css/login-signup.css">
<link rel="icon" type="image/png" href="ressources/images/logo/title-logo.png">
<script src="ressources/scripts/signup.js" defer></script>
<title>Inscription</title>
</head>
<body>
	<section class="picture-panel picture-panel-sign-up">
		<div class="text-container">
			<h1>Lorem ipsum</h1>
			<p>Lorem ipsum dolor, sit amet consectetur adipisicing elit.
				Deleniti magni, iure nam voluptates soluta tenetur animi repellat
				unde obcaecati.
			</p>
		</div>
	</section>

	<section class="form-panel">
		<h1 class="signup-title">Rejoignez-nous</h1>
		<h2>Lorem ipsum dolor sit amet, consectetur adipiscing elit</h2>

		<form action="signup" method="POST">
			<label for="group">Groupe:</label> 
			<input type="text" id="group"name="group"> 
			<label for="pseudo">Pseudo:</label> 
			<input type="text" id="pseudo"name="pseudo">
			<label for="email-adress">Adresse email:</label> 
			<input type="text" id="email-adress" name="mail"> 
			<label for="password">Mot de passe</label> 
			<input type="password"id="password" name="password"> 
			<label for="password-confirmation">Confirmation mot de passe</label> 
			<input type="password" id="password-confirmation" name="password-confirmation">
			<div class="rgpd-input-container">
				<input type="checkbox" id="rgpd" name="rgpd"> 
				<label class="rgpd-label" for="rgpd">J'ai lu et et j'accepte les conditions d'utilisations</label>
			</div>

			<div class="validation-input-container">
				<input class="disabled" type="submit" id="validation-input" value="S'inscrire" disabled>
			</div>

		</form>
		<p class="bottom-message">
			Vous n'avez pas de compte ? Cliquez <a class="bottom-link"
				href="login.jsp">ici</a>
		</p>
	</section>
	<%@include file="header.jsp" %> 

</body>
</html>
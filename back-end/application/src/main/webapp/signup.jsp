<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="ressources/css/login-signup.css">
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
		<h1>Rejoignez-nous</h1>
		<h2>Lorem ipsum dolor sit amet, consectetur adipiscing elit</h2>

		<form action="" method="POST">
			<label for="group">Groupe:</label> <input type="text" id="group"
				name="group"> <label for="email-adress">Adresse
				email:</label> <input type="text" id="email-adress" name="mail"> <label
				for="password">Mot de passe</label> <input type="password"
				id="password" name="password"> <label
				for="password-confirmation">Confirmation mot de passe</label> <input
				type="password" id="password-confirmation"
				name="password-confirmation">


			<div class="rgpd-input-container">
				<input type="checkbox" id="rgpd" name="rgpd"> <label
					class="rgpd-label" for="rgpd">J'ai lu et et j'accepte les
					conditions d'utilisations</label>
			</div>

			<div class="validation-input-container">
				<input type="submit" id="validation-input" value="S'inscrire">
			</div>

		</form>
		<p class="bottom-message">
			Vous n'avez pas de compte ? Cliquez <a class="bottom-link"
				href="login.html">ici</a>
		</p>
	</section>

</body>
</html>
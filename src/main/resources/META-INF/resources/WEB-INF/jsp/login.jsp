<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
	background-color: #f0f2f5;
}

.login-container {
	width: 300px;
	padding: 20px;
	background-color: white;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.login-container h2 {
	text-align: center;
	margin-bottom: 20px;
}

.login-container input[type="text"], .login-container input[type="password"]
	{
	width: 100%;
	padding: 10px;
	margin: 8px 0;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

.login-container button {
	width: 100%;
	padding: 10px;
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

.login-container button:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="login-container">
		</p>${errorString}</p>
		<h2>Login</h2>
		<!-- on submitting form it is a post method so it searches for a post controller -->
		<form action="/login" method="POST"> 
			<label for="name">Username</label> <input type="text" id="name"
				name="name" required> <label for="password">Password</label>
			<input type="password" id="password" name="password" required>

			<button type="submit">Login</button>
		</form>
		
	</div>

</body>
</html>

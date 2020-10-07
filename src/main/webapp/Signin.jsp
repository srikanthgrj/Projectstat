<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html lang="en">
>
<body>

</body>
</html>
<!DOCTYPE html>

<head>
<style>
body {
	background-image:
		url("Best-and-Worst-Fast-Furious-Couples-featured.webp");
	height: 400px; /* You must set a specified height */
	background-position: 80%; /* Center the image */
	background-repeat: no-repeat; /* Do not repeat the image */
	background-size: cover;
}
</style>
<title>SignUp</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">You are sending a message</a>
			</div>
			<div class="navbar-header">
				<a class="navbar-brand" href="./Signin.jsp">send message again</a>
			</div>

			<ul class="nav navbar-nav">



			</ul>
			<ul class="nav navbar-nav navbar-right">

				<li><a href="./Signin.jsp"><span class="glyphicon "></span>
						Home</a></li>
			</ul>
		</div>
	</nav>
	<div>
		<div class="col-xs-2">
			<h2>Send a message</h2>
			<form action="signin" method="post">





				<div class="form-group" style="color: white">
					<label for="projectname">project name:</label> <input type="text"
						class="form-control" id="projectname"
						placeholder="Enter project name" name="projectname" required>
				</div>


				<div class="form-group" style="color: white">
					<label for="tmname">Team Manager Name:</label> <input type="text"
						class="form-control" id="tmname"
						placeholder="Enter Team Manager Name" name="tmname" required>
				</div>

				<div class="form-group" style="color: white">
					<label for="teamcontactmail">Team Email:</label> <input type="text"
						class="form-control" id="teamcontactmail"
						placeholder="Enter Team Email" name="teamcontactmail" required>
				</div>

				<div class="form-group" style="color: white">
					<label for="decomissines">De-comissined:</label> <select
						type="text" class="form-control" id="decomissines"
						placeholder="select_type" name="decomissines" required>
						<option>--select--</option>
						<option>yes</option>
						<option>no</option>
					</select>
				</div>

				<div class="form-group" style="color: white">
					<label for="version">Version:</label> <input type="text"
						class="form-control" id="version" placeholder="Enter version"
						name="version" required>
				</div>

				<div class="form-group" style="color: white">
					<label for="lastreleased">Version:</label> <input type="text"
						class="form-control" id="lastreleased"
						placeholder="Enter Last Released" name="lastreleased" required>
				</div>

				<div class="form-group" style="color: white">
					<label for="nextreleased">Version:</label> <input type="text"
						class="form-control" id="nextreleased"
						placeholder="Enter next Release date" name="nextreleased" required>
				</div>

				<div class="form-group" style="color: white">
					<label for="developeddate">Version:</label> <input type="text"
						class="form-control" id="developeddate"
						placeholder="Enter Developed date" name="developeddate" required>
				</div>

				<h2>Environment</h2>
				<!-- Button to Open the Modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target="#myModal">Click to add detail</button>

				<!-- The Modal -->
				<div class="modal fade" id="myModal">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">

							<!-- Modal Header -->
							<div class="modal-header">
								<h4 class="modal-title">Modal Heading</h4>
								<button type="button" class="close" data-dismiss="modal">&times;</button>
							</div>
							<div class="form-group" style="color: white">
								<label for="envdetail">Environment Detail:</label> <input
									type="text" class="form-control" id=""
									envdetail"" placeholder="Environment Detail" name=""
									envdetail"" required>
							</div>

							<div class="form-group" style="color: white">
								<label for="url">enter URL:</label> <input type="text"
									class="form-control" id="url" placeholder="Enter URL"
									name="url" required>
							</div>

							<div class="form-group" style="color: white">
								<label for="accessible">Accessible:</label> <select type="text"
									class="form-control" id=""
									accessible"" placeholder="select_type" name=""
									accessible"" required>
									<option>--select--</option>
									<option>yes</option>
									<option>no</option>
								</select>
							</div>


							<!-- Modal footer -->
							<div class="modal-footer">
								<button type="submit" class="btn btn-secondary"
									data-dismiss="modal">submit</button>
							</div>

						</div>
					</div>
				</div>
				<div>
					<button type="submit" class="btn btn-default">save</button>
				</div>
				</form>
		</div>




	</div>




	





</body>
</html>

<?php
	// need user name, pass word  and database name.
		$db = mysqli_connect("localhost", 
		"myuser",
		"mypass", 
		"mydb");
		if (isset($_POST['newcomment']))
		{
			if (Pname!=null || comment !=null){
			//echo "Good connection";
			//posting the fields and connect it up to the table attribute
			$Pname = mysqli_escape_string($db,
				$_POST['Pname']);
			$comment = mysqli_escape_string($db,
				$_POST['comment']);
			$CommentingEmail = mysqli_escape_string($db,
			//posting the values to the databases
				$_POST['CommentingEmail']);
			$db->query("INSERT INTO Comments(name, comment, email) VALUES ('$Pname', '$comment', '$CommentingEmail')");
			}
		}
		//else echo "Errrrrrrror";
	?>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" media="screen" href="main.css" />
	<link rel="stylesheet" href="css/style.css">
    <script src="main.js"></script>
</head>
<body>
<h1>ORDER BURGER</h1>
			<!-- Bread
			    –––––––––––––––––––––––––––––––––––––––––––––––––– -->
			<h2 class="w">Bread</h2>
			<!-- <table id="custom"> -->
			<!-- <form action="submit.php"> -->
				<!-- <tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/breads/bun.png" class="icon"></div>
					</td>
					<td>
						<div class="cen"><input type="radio" name="Bread" value="Burger" id="Next"> Burger</div>
					</td>
					<td>
						<div class="cen">Price</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/breads/junior_bun.png" class="icon"></div>
					</td>
					<td>
						<div class="cen"><input type="radio" name="Bread" value="Jr Burger" id="Next"> Jr Burger</div>
					</td>
					<td>
						<div class="cen">Price</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/breads/tortillas.png" class="icon"></div>
					</td>
					<td>
						<div class="cen"><input type="radio" name="Bread" value="Tortillas" id="Next"> Tortillas</div>
					</td>
					<td>
						<div class="cen">Price</div>
					</td>
				</tr>
			</table> -->
<table class="tabmm" align="center" style="max-width:400px;">
								<tr>
									<th>Name</th>
									<th>Comment</t>
								</tr>
								<?php
									//filling in the table from the database infomation 
										if($db == true){
											$query = mysqli_query($db, "SELECT * FROM Comments");
			 								while ($row = mysqli_fetch_array($query)) {
										//printing name and comment for every entry
										echo
										   "<tr>
											<td>{$row['name']}</td>
											<td>{$row['comment']}</td>
										   </tr>\n";
									
										}
										}
										else echo"!!DB connection Error!!";
										
									?>
								<!-- table ends--->
							</table>
<form name="rugby-form" action="submit.php" onsubmit="return validateComment()" align="center" method="post">
							<!-- <input type="text" class="loginInput" name="Pname" align="center" placeholder="Name"/> Person name -->
							<br>
							<table id="custom">
			<!-- <form action="submit.php"> -->
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/breads/bun.png" height="42" width="42" class="icon"></div>
					</td>
					<td>
						<div class="cen"><input type="radio" name="Pname" value="Burger" id="Next"> Burger</div>
					</td>
					<td>
						<div class="cen">Price</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/breads/junior_bun.png" height="42" width="42" class="icon"></div>
					</td>
					<td>
						<div class="cen"><input type="radio" name="Pname" value="Jr Burger" id="Next"> Jr Burger</div>
					</td>
					<td>
						<div class="cen">Price</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/breads/tortillas.png" height="42" width="42" class="icon"></div>
					</td>
					<td>
						<div class="cen"><input type="radio" name="Pname" value="Tortillas" id="Next"> Tortillas</div>
					</td>
					<td>
						<div class="cen">Price</div>
					</td>
				</tr>
			</table>
			<table id="custom">
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/produce/tomato.png" height="42" width="42" class="icon"></div>
					</td>
					<td>
						<div class="cen">Mayonnaise</div>
					</td>
					<td>
						<div class="cen">
							<div class="number-input">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>
								<input class="quantity" min="0" max="3" name="quantity" value="0" type="number">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
							</div>
						</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/produce/tomato.png" height="42" width="42" class="icon"></div>
					</td>
					<td>
						<div class="cen">Curry</div>
					</td>
					<td>
						<div class="cen">
							<div class="number-input">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>
								<input class="quantity" min="0" max="3" name="quantity" value="0" type="number">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
							</div>
						</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/produce/tomato.png" height="42" width="42" class="icon"></div>
					</td>
					<td>
						<div class="cen">Italian Dressing</div>
					</td>
					<td>
						<div class="cen">
							<div class="number-input">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>
								<input class="quantity" min="0" max="3" name="quantity" value="0" type="number">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
							</div>
						</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/produce/tomato.png" height="42" width="42" class="icon"></div>
					</td>
					<td>
						<div class="cen">Hot Chilli</div>
					</td>
					<td>
						<div class="cen">
							<div class="number-input">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>
								<input class="quantity" min="0" max="3" name="quantity" value="0" type="number">
								<button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
							</div>
						</div>
					</td>
				</tr>
				<tr id="Hov">
					<td>
						<div class="cen"><img src="ingredients_icons/produce/tomato.png" height="42" width="42" class="icon"></div>
					</td>
					<td>

						<div class="cen">Aioli</div>
					</td>
					<td>
						<div class="cen">
						<div class="""slidecontainer">
						<input type="checkbox" name="CommentingEmail" value="Car"> I have a car<br>
  <input type="range" min="0" max="3" value="0" class="slider" id="comment" name="comment">
  <p>Quantity sauce: <span id="demo"></span></p>
</div>
						</div>
					</td>
				</tr>
			</table>
<table class="tabmm" align="center" style="max-width:400px;">
							<!-- <input type="email" class="loginInput" align="center" name="CommentingEmail" placeholder="Email"/> email -->
							<br>
							<textarea name="" class="loginInput" align="center" rows="4" width="100%" placeholder="Comment"></textarea>
							<!-- comment-->
							<br>
							<input type="submit" class="SignUp" name="newcomment" align="center" value="Submit" /> <!-- submit comment-->
						</form>
	<p>Hello</p>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/js/bootstrap.min.js'></script>
	<script src="javascript/script.js"></script>
</body>
</html>
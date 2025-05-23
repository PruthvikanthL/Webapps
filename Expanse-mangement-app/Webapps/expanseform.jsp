<html>
<head>
<title>
ExpanseForm
</title>
</head>
<body>
<form action="expanse" method="post">
<a href="index.jsp">Click here for Home</a>
<div align="center">
<h1>Budget Expanse Form</h1>
<h2>Please fill the Below with Required Details</h2><br><br>
Name:<input type="text" placeholder="Enter your name" name="name"><br><br>
Contatct:<input type="tel" placeholder="Enter your contanct number" name="contactnumber"><br><br>
Email:<input type="email" placeholder="Enter your email" name="email"><br><br>
Salary:<input type="text" placeholder="Enter your Montly salary" name="salary"><br><br>
<label for="Transport">Select a Transport Mode:</label>
<select  name="transport">
<option value="None">None</option>
<option value="Bus">Bus</option>
<option value="Bike">Bike</option>
<option value="Car">Car</option>
<option value="Railway">Railway</option>
<option value="Airplane">Airplane</option>
</select><br><br>
TransportCost:<input type="text" placeholder="Enter your Monthly Spending for Transportation" name="transportcost"><br><br>
<lable for="Stay">Select a Stay:</lable>
<select name="stay">
<option value="None">None</option>
<option value="Own Home">Home</option>
<option value="PG">PG</option>
<option value="Renting Home">Renting Home</option>
</select><br><br>
Staying cost:<input type="text" placeholder="Enter your Monthly Spending for Staying" name="staycost"><br><br>
Location:<input type="text" placeholder="Enter your Current Location" name="location"><br><br>
<input type="submit" value="Register" style="color:Green">
</div>
</form>
</body>
</html>
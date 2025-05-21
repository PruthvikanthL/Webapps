<html>
    <head>
        <title>Product-management-app</title>
         </head>
<body>
    <a href="index.jsp">click here for home tab</a>
    <form action="productdata" method="post">
    <div align="center">
    <h1>Fill the Product form</h1><br><br>
    Product Name:<input type="text" placeholder="Enter the product name" name="Productname"><br><br>
    <label for="product">Select a Product type:</label>
   <select  name="type">
    <option value="None">None</option>
  <option value="laptop">Laptop</option>
  <option value="smartphone">Smartphone</option>
  <option value="headphones">Headphones</option>
  <option value="keyboard">Keyboard</option>
  <option value="monitor">Monitor</option>
  </select><br><br>
  Incoming Price:<input type="text" placeholder="Enter the Incoming Price" name="IncomingPrice"><br><br>
  Selling Price:<input type="text" placeholder="Enter the Selling Price" name="SellingPrice"><br><br>
            MRP:<input type="text" placeholder="Enter the Product MRP" name="MRP"><br><br>
  Description:<input type="text" placeholder="Enter the Product Description" name="Description"><br><br>
        Brand:<input type="text" placeholder="Enter the product Brand" name="Brand"><br><br>
   Quantity:<input type="text" placeholder="Enter the product name" name="Quantity"><br><br>
   <label for="color">Select the color</label>
   <select name="color">
    <option value="None">None</option>
    <option value="Red">Red</option>
    <option value="Blue">Blue</option>
    <option value="Black">Black</option>
</select><br><br>
  Weight:<input type="text" placeholder="Enter the weight" name="Weight"><br><br>
  Manufactured Date:<input type="date" name="ManufDate"><br><br>
  <label for="Warranty">Select a Warranty</label>
  <select name="Warranty">
    <option value="None">None</option>
    <option value="6 Months">6 Months</option>
    <option value="12 Months">12 Months</option>
    <option value="2 years">2 Years</option>
  </select><br><br>
  <label>
  <input type="checkbox" name="ReturnPolicy" value="ReturnPolicy">ReturnPolicy
</label><br><br>
<input type="submit" value="Register">
</form>
    </div>
</body>
</html>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Car Portal</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
    <style>
      body {
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
        min-height: 100vh;
      }
      .navbar {
        background: #2c3e50;
      }
      .navbar-brand {
        color: #fff;
        font-weight: 600;
      }
      .navbar-brand:hover {
        color: #f1c40f;
      }
      .btn-login {
        background-color: #f1c40f;
        color: #2c3e50;
        font-weight: 600;
        border: none;
        padding: 6px 15px;
        border-radius: 8px;
        text-decoration: none;
      }
      .btn-login:hover {
        background-color: #d4ac0d;
        color: white;
      }
      .hero {
        text-align: center;
        margin-top: 100px;
      }
      .hero h1 {
        font-size: 3rem;
        font-weight: 600;
        color: #2c3e50;
      }
      .hero a {
        margin-top: 20px;
        display: inline-block;
        padding: 10px 30px;
        background-color: #3498db;
        color: white;
        border-radius: 30px;
        text-decoration: none;
        font-weight: 500;
        transition: 0.3s;
      }
      .hero a:hover {
        background-color: #2980b9;
      }
    </style>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg">
      <div class="container-fluid">
        <a class="navbar-brand" href="login.jsp">Car Portal</a>
        <div class="d-flex">
          <a href="login.jsp" class="btn btn-login">Login</a>
        </div>
      </div>
    </nav>

    <div class="hero">
      <h1>Welcome to Car Portal</h1>
      <a href="login.jsp">Explore Cars</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>

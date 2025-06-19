<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Car Portal Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
    <style>
      body {
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #f5f7fa, #c3cfe2);
        min-height: 100vh;
        display: flex;
        flex-direction: column;
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

      .btn-logout {
        background-color: #f1c40f;
        color: #2c3e50;
        font-weight: 600;
        border: none;
      }

      .btn-logout:hover {
        background-color: #d4ac0d;
      }

      .login-container {
        flex: 1;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 40px 20px;
      }

      .card {
        width: 100%;
        max-width: 400px;
        border: none;
        border-radius: 15px;
        box-shadow: 0 5px 20px rgba(0,0,0,0.1);
        padding: 30px;
        background-color: #fff;
      }

      .form-control {
        border-radius: 10px;
      }

      .btn-primary, .btn-secondary {
        width: 48%;
        border-radius: 10px;
      }

      .form-title {
        font-weight: 600;
        font-size: 24px;
        color: #2c3e50;
        margin-bottom: 25px;
      }
    </style>
  </head>
  <body>

    <nav class="navbar navbar-expand-lg">
      <div class="container-fluid">
        <a class="navbar-brand" href="login.jsp">Car Portal</a>
        <div class="d-flex">
          <button class="btn btn-logout">Logout</button>
        </div>
      </div>
    </nav>


    <div class="login-container">
      <form class="card" action="login" method="post">
        <div class="form-title text-center">Login to Your Account</div>
        <div class="mb-3">
          <input type="text" class="form-control" placeholder="Enter Username" name="userName" required>
        </div>
        <div class="mb-3">
          <input type="email" class="form-control" placeholder="Enter Email" name="userEmail" required>
        </div>
        <div class="mb-4">
          <input type="password" class="form-control" placeholder="Enter Password" name="userPassword" required>
        </div>
        <div class="d-flex justify-content-between">
          <input type="submit" class="btn btn-primary" value="Login">
          <input type="reset" class="btn btn-secondary" value="Clear">
        </div>
      </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>

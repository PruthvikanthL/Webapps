<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Success | Car Portal</title>
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
    .message-container {
      margin-top: 100px;
      text-align: center;
    }
    .message-box {
      background-color: #ffffffcc;
      border-radius: 15px;
      padding: 40px;
      max-width: 500px;
      margin: 0 auto;
      box-shadow: 0 5px 15px rgba(0,0,0,0.1);
    }
    .message-box h2 {
      color: #2c3e50;
      font-weight: 600;
      margin-bottom: 20px;
    }
    .btn-home {
      margin-top: 20px;
      background-color: #3498db;
      color: white;
      border-radius: 10px;
      padding: 10px 25px;
      text-decoration: none;
      font-weight: 500;
      transition: 0.3s;
    }
    .btn-home:hover {
      background-color: #2980b9;
    }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-lg">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Car Portal</a>
    <div class="d-flex">
      <a href="login.jsp" class="btn btn-login">Logout</a>
    </div>
  </div>
</nav>

<div class="message-container">
  <div class="message-box">
    <h2>
      <%= request.getAttribute("result") != null ? request.getAttribute("result") : "Unknown Status" %>
    </h2>
    <a href="index.jsp" class="btn-home">Go to Home</a>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

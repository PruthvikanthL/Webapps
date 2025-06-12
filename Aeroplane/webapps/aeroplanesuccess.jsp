<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Flight Data Saved</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background: linear-gradient(to right, #1f4037, #99f2c8);
      color: white;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      height: 100vh;
      margin: 0;
    }

    .navbar {
      background-color: rgba(0, 0, 0, 0.85);
    }

    .success-container {
      max-width: 600px;
      margin: 100px auto;
      background-color: rgba(255, 255, 255, 0.1);
      padding: 40px;
      border-radius: 15px;
      text-align: center;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.4);
    }

    .success-container h1 {
      font-size: 32px;
      color: #00ffc8;
      margin-bottom: 20px;
    }

    .success-container p {
      font-size: 18px;
      margin-bottom: 30px;
    }

    .btn-custom {
      background-color: #00f7ff;
      color: black;
      border: none;
      font-weight: bold;
      padding: 10px 20px;
      border-radius: 6px;
      text-decoration: none;
    }

    .btn-custom:hover {
      background-color: white;
      color: black;
    }
  </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Aeroplane</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
            data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02"
            aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="flightinfo.jsp">Flights Info</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Disabled</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<div class="success-container">
  <h1>Flight Data Saved!</h1>
  <p>Your flight information has been submitted successfully.</p>
  <a href="aeroplaneform.jsp" class="btn btn-custom">Back to Form</a>
  <a href="filghtinfo.jsp" class="btn btn-custom ms-2">View Flights</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

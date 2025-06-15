<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Submission Failed</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background: linear-gradient(to right, #e52d27, #b31217);
      color: white;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      height: 100vh;
      margin: 0;
    }

    .navbar {
      background-color: rgba(0, 0, 0, 0.85);
    }

    .error-container {
      max-width: 600px;
      margin: 100px auto;
      background-color: rgba(255, 255, 255, 0.1);
      padding: 40px;
      border-radius: 15px;
      text-align: center;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.4);
    }

    .error-container h1 {
      font-size: 32px;
      color: #ffaaaa;
      margin-bottom: 20px;
    }

    .error-container p {
      font-size: 18px;
      margin-bottom: 30px;
    }

    .btn-custom {
      background-color: #ffffff;
      color: #b31217;
      font-weight: bold;
      border: none;
      padding: 10px 20px;
      border-radius: 6px;
      text-decoration: none;
    }

    .btn-custom:hover {
      background-color: #ffcaca;
      color: #800000;
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
        <button class="btn btn-outline-light" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<div class="error-container">
  <h1>Flight Submission Failed!</h1>
  <p>Oops! Something went wrong while saving your flight data. Please try again.</p>
  <a href="aeroplaneform.jsp" class="btn btn-custom">Back to Form</a>
  <a href="index.jsp" class="btn btn-custom ms-2">Return to Home</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Weather Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <style>
      .navbar-custom {
        background: linear-gradient(90deg, #0f2027, #203a43, #2c5364);
      }

      .navbar-custom .navbar-brand,
      .navbar-custom .nav-link,
      .navbar-custom .btn {
        color: #ffffff !important;
      }

      .navbar-custom .nav-link:hover,
      .navbar-custom .navbar-brand:hover {
        color: #00d4ff !important;
      }

      .navbar-custom .form-control {
        background-color: rgba(255, 255, 255, 0.2);
        color: white;
        border: none;
      }

      .navbar-custom .form-control::placeholder {
        color: rgba(255, 255, 255, 0.7);
      }

      .navbar-custom .btn-outline-success {
        border-color: #00d4ff;
        color: #00d4ff;
      }

      .navbar-custom .btn-outline-success:hover {
        background-color: #00d4ff;
        color: #000;
      }

      body {
        background: linear-gradient(to right, #2c3e50, #3498db);
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        padding: 30px;
        color: white;
      }

      .form-container {
        background-color: rgba(255, 255, 255, 0.1);
        border-radius: 15px;
        padding: 30px;
        max-width: 600px;
        margin: 60px auto 0 auto; /* spacing after navbar */
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);
      }

      .form-container h1,
      .form-container h3 {
        text-align: center;
        color: #fff;
      }

      .form-control,
      .form-select {
        background-color: rgba(255, 255, 255, 0.15);
        border: none;
        color: white;
      }

      .form-control::placeholder {
        color: rgba(255, 255, 255, 0.7);
      }

      .form-control:focus,
      .form-select:focus {
        background-color: rgba(255, 255, 255, 0.25);
        box-shadow: 0 0 0 0.2rem rgba(52, 152, 219, 0.5);
        color: white;
      }

      .form-select option {
        background-color: white;
        color: black;
      }

      .btn-custom {
        background-color: #00d4ff;
        border: none;
        color: #000;
        font-weight: bold;
      }

      .btn-custom:hover {
        background-color: #fff;
        color: #000;
      }

      label {
        margin-top: 10px;
        font-weight: 500;
      }
    </style>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-custom">
      <div class="container-fluid">
        <a class="navbar-brand" href="WeatherForm.jsp">WeatherApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="forecast.jsp">Forecast</a>
            </li>
            <li class="nav-item">
              <a class="nav-link disabled" aria-disabled="true">Coming Soon</a>
            </li>
          </ul>
          <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Search city" aria-label="Search" />
            <button class="btn btn-outline-success" type="submit">Search</button>
          </form>
        </div>
      </div>
    </nav>

    <div class="form-container">
      <form action="weather" method="post">
        <h1>Weather Registration Form</h1>
        <h3>Fill in the Details Below</h3>
        <br>

        <div class="mb-3">
          <label>Place Name</label>
          <input type="text" class="form-control" name="placename" placeholder="Enter the Place name">
        </div>

        <div class="mb-3">
          <label>Weather</label>
          <select class="form-select" name="Weather">
            <option value="None">None</option>
            <option value="Rainy">Rainy</option>
            <option value="cold">Cold</option>
            <option value="hot">Hot</option>
          </select>
        </div>

        <div class="mb-3">
          <label>Min Temp</label>
          <input type="text" class="form-control" name="mintemp" placeholder="Enter the Min Temp">
        </div>

        <div class="mb-3">
          <label>Max Temp</label>
          <input type="text" class="form-control" name="maxtemp" placeholder="Enter the Max Temp">
        </div>

        <div class="mb-3">
          <label>Cloudy</label>
          <select class="form-select" name="cloudy">
            <option value="None">None</option>
            <option value="yes">YES</option>
            <option value="no">NO</option>
          </select>
        </div>

        <div class="mb-3">
          <label>Raining</label>
          <select class="form-select" name="raining">
            <option value="None">None</option>
            <option value="yes">YES</option>
            <option value="no">NO</option>
          </select>
        </div>

        <div class="mb-3">
          <label>Rain in MM</label>
          <input type="text" class="form-control" name="raininmm" placeholder="Enter the Rain in mm">
        </div>

        <div class="mb-3">
          <label>Humidity</label>
          <input type="text" class="form-control" name="humidity" placeholder="Enter the Humidity">
        </div>

        <div class="mb-3">
          <label>Wind Speed</label>
          <input type="text" class="form-control" name="windspeed" placeholder="Enter the Wind Speed">
        </div>

        <div class="mb-3">
          <label>Sun Rise Time</label>
          <input type="time" class="form-control" name="sunrise">
        </div>

        <div class="mb-3">
          <label>Sun Set Time</label>
          <input type="time" class="form-control" name="sunset">
        </div>

        <div class="mb-3">
          <label>Moon Rise Time</label>
          <input type="time" class="form-control" name="moonrise">
        </div>

        <div class="mb-3">
          <label>Moon Set Time</label>
          <input type="time" class="form-control" name="moonset">
        </div>

        <div class="mb-3">
          <label>Rain Start Time</label>
          <input type="time" class="form-control" name="rainstart">
        </div>

        <div class="mb-3">
          <label>Rain End Time</label>
          <input type="time" class="form-control" name="rainend">
        </div>

        <div class="mb-3">
          <label>Precipitation</label>
          <input type="text" class="form-control" name="precipitation" placeholder="Enter the Precipitation">
        </div>

        <div class="text-center mt-4">
          <input type="submit" class="btn btn-custom btn-lg" value="Upload">
        </div>
      </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>
  </body>
</html>

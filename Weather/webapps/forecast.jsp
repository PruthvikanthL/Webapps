<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Forecast</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
      body {
        background: linear-gradient(to right, #434343, #000000);
        color: white;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        padding-top: 70px;
      }

      .navbar-custom {
        background: linear-gradient(90deg, #0f2027, #203a43, #2c5364);
      }

      .navbar-custom .navbar-brand,
      .navbar-custom .nav-link {
        color: #ffffff !important;
      }

      .navbar-custom .nav-link:hover,
      .navbar-custom .navbar-brand:hover {
        color: #00d4ff !important;
      }

      .forecast-card {
        background-color: rgba(255, 255, 255, 0.1);
        border-radius: 15px;
        padding: 20px;
        margin-bottom: 20px;
        box-shadow: 0 8px 20px rgba(0, 0, 0, 0.3);
        text-align: center;
      }

      .forecast-card h4 {
        margin-bottom: 10px;
        color: #00d4ff;
      }

      .forecast-card span {
        display: block;
        margin: 5px 0;
        color: #f1f1f1;
      }

      .forecast-header {
        text-align: center;
        margin-bottom: 30px;
      }
    </style>
  </head>
  <body>

    <nav class="navbar navbar-expand-lg navbar-custom fixed-top">
      <div class="container-fluid">
        <a class="navbar-brand" href="WeatherForm.jsp">WeatherApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarForecast" aria-controls="navbarForecast" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarForecast">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" href="#">Forecast</a>
            </li>
            <li class="nav-item">
              <a class="nav-link disabled" aria-disabled="true">Coming Soon</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="container">
      <div class="forecast-header">
        <h1>Weekly Weather Forecast</h1>
        <p>Stay updated with the weather details for the upcoming days</p>
      </div>

      <div class="row">
        <div class="col-md-4">
          <div class="forecast-card">
            <h4>Monday</h4>
            <span>Condition: Sunny</span>
            <span>Min Temperature: 22°C</span>
            <span>Max Temperature: 32°C</span>
            <span>Humidity: 50%</span>
          </div>
        </div>
        <div class="col-md-4">
          <div class="forecast-card">
            <h4>Tuesday</h4>
            <span>Condition: Rainy</span>
            <span>Min Temperature: 24°C</span>
            <span>Max Temperature: 30°C</span>
            <span>Humidity: 70%</span>
          </div>
        </div>
        <div class="col-md-4">
          <div class="forecast-card">
            <h4>Wednesday</h4>
            <span>Condition: Cloudy</span>
            <span>Min Temperature: 23°C</span>
            <span>Max Temperature: 31°C</span>
            <span>Humidity: 60%</span>
          </div>
        </div>
        <!-- Add more forecast cards as needed -->
      </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>

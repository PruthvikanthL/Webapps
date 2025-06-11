<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Weather Data Saved</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
      body {
        background: linear-gradient(to right, #1d4350, #a43931);
        color: white;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }

      .success-container {
        background-color: rgba(255, 255, 255, 0.1);
        padding: 40px;
        border-radius: 15px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.4);
        text-align: center;
      }

      .success-container h1 {
        font-size: 32px;
        margin-bottom: 20px;
        color: #00ffcc;
      }

      .success-container p {
        font-size: 18px;
        margin-bottom: 30px;
      }

      .btn-custom {
        background-color: #00d4ff;
        color: black;
        border: none;
        font-weight: bold;
      }

      .btn-custom:hover {
        background-color: white;
        color: black;
      }
    </style>
  </head>
  <body>
    <div class="success-container">
      <h1>Weather Data Saved!</h1>
      <p>Your weather information was submitted successfully.</p>
      <a href="WeatherForm.jsp" class="btn btn-custom">Back to Form</a>
      <a href="forecast.jsp" class="btn btn-custom ms-2">View Forecast</a>
    </div>
  </body>
</html>

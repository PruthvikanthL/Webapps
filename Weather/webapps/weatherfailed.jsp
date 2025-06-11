<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Weather Data Save Failed</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
      body {
        background: linear-gradient(to right, #93291e, #ed213a);
        color: white;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }

      .error-container {
        background-color: rgba(255, 255, 255, 0.1);
        padding: 40px;
        border-radius: 15px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.4);
        text-align: center;
      }

      .error-container h1 {
        font-size: 32px;
        margin-bottom: 20px;
        color: #ffcccc;
      }

      .error-container p {
        font-size: 18px;
        margin-bottom: 30px;
      }

      .btn-custom {
        background-color: #fff;
        color: #93291e;
        font-weight: bold;
        border: none;
      }

      .btn-custom:hover {
        background-color: #ffcccc;
        color: #000;
      }
    </style>
  </head>
  <body>
    <div class="error-container">
      <h1>Failed to Save Data</h1>
      <p>There was an issue saving the weather data.<br>Please check for missing or incorrect information and try again.</p>
      <a href="WeatherForm.jsp" class="btn btn-custom">Go Back to Form</a>
    </div>
  </body>
</html>

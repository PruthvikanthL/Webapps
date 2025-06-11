<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Weather Home Page</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
      crossorigin="anonymous"
    />
    <style>
      body {
        margin: 0;
        padding: 0;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      }

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

      .hero-section {
        height: 90vh;
        background: url('https://images.unsplash.com/photo-1504384308090-c894fdcc538d?auto=format&fit=crop&w=1350&q=80')
          center center/cover no-repeat;
        position: relative;
        display: flex;
        align-items: center;
        justify-content: center;
        color: white;
        text-align: center;
      }

      .hero-section::before {
        content: "";
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: rgba(0, 0, 0, 0.6);
        z-index: 0;
      }

      .hero-section > div {
        position: relative;
        z-index: 1;
      }

      .hero-section h1 {
        font-size: 3.5rem;
        font-weight: bold;
        text-shadow: 2px 2px 8px #000;
      }

      .hero-section p {
        font-size: 1.3rem;
        margin-top: 1rem;
        color: #e0e0e0;
      }

      .hero-section .btn {
        margin-top: 2rem;
        font-size: 1.1rem;
        padding: 10px 30px;
        background-color: #00d4ff;
        border: none;
        color: #000;
        font-weight: bold;
      }

      .hero-section .btn:hover {
        background-color: #ffffff;
        color: #000;
      }
    </style>
  </head>
  <body>

    <nav class="navbar navbar-expand-lg navbar-custom">
      <div class="container-fluid">
        <a class="navbar-brand" href="WeatherForm.jsp">WeatherApp</a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarTogglerDemo02"
          aria-controls="navbarTogglerDemo02"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a
                class="nav-link active"
                aria-current="page"
                href="WeatherForm.jsp"
                >Form</a
              >
            </li>
            <li class="nav-item">
              <a class="nav-link" href="forecast.jsp">Forecast</a>
            </li>
            <li class="nav-item">
              <a class="nav-link disabled" aria-disabled="true">Coming Soon</a>
            </li>
          </ul>
          <form class="d-flex" role="search">
            <input
              class="form-control me-2"
              type="search"
              placeholder="Search city"
              aria-label="Search"
            />
            <button class="btn btn-outline-success" type="submit">
              Search
            </button>
          </form>
        </div>
      </div>
    </nav>

    <section class="hero-section">
      <div>
        <h1>Welcome to Rain Forecast</h1>
        <p>Your trusted source for live weather conditions and forecasts</p>
        <a href="WeatherForm.jsp" class="btn">Get Started</a>
      </div>
    </section>


    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>

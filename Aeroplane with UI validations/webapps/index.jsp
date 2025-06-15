<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Aeroplane Portal</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;800&display=swap" rel="stylesheet">
  <style>
    * {
      font-family: 'Poppins', sans-serif;
    }

    body, html {
      height: 100%;
      margin: 0;
      padding: 0;
      background: linear-gradient(to bottom, #0f2027, #203a43, #2c5364);
      color: white;
      overflow-x: hidden;
    }

    .navbar {
      background-color: rgba(0, 0, 0, 0.8) !important;
      backdrop-filter: blur(6px);
    }

    .hero-section {
      position: relative;
      height: 100vh;
      background: url('https://images.unsplash.com/photo-1533473359331-0135ef1b58bf?auto=format&fit=crop&w=1950&q=80') no-repeat center center/cover;
      display: flex;
      align-items: center;
      justify-content: center;
      text-align: center;
    }

    .overlay {
      position: absolute;
      top: 0; left: 0;
      height: 100%;
      width: 100%;
      background: rgba(0, 0, 0, 0.6);
    }

    .hero-content {
      position: relative;
      z-index: 1;
      max-width: 700px;
      padding: 40px;
      background: rgba(255, 255, 255, 0.05);
      border: 1px solid rgba(255, 255, 255, 0.15);
      border-radius: 20px;
      backdrop-filter: blur(12px);
      box-shadow: 0 8px 32px rgba(0, 0, 0, 0.3);
    }

    .hero-content h1 {
      font-size: 3.5rem;
      font-weight: 800;
      margin-bottom: 20px;
      color: #fff;
    }

    .hero-content p {
      font-size: 1.2rem;
      margin-bottom: 30px;
      color: #ddd;
    }

    .btn-glass {
      padding: 12px 30px;
      border-radius: 30px;
      background: rgba(255, 255, 255, 0.15);
      border: 1px solid rgba(255, 255, 255, 0.3);
      color: #fff;
      font-weight: 600;
      transition: all 0.3s ease;
    }

    .btn-glass:hover {
      background-color: white;
      color: #000;
      transform: scale(1.05);
    }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark px-3">
  <div class="container-fluid">
    <a class="navbar-brand fw-bold fs-4" href="aeroplaneform.jsp">Aeroplane Portal</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
      <ul class="navbar-nav mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" href="filghtinfo.jsp">Flights Info</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="aeroplaneform.jsp">Add New Flight</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Contact</a>
        </li>
      </ul>
      <form class="d-flex ms-3" role="search">
        <input class="form-control me-2 rounded-pill px-3" type="search" placeholder="Search Flights">
        <button class="btn btn-outline-light rounded-pill px-4" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<div class="hero-section">
  <div class="overlay"></div>
  <div class="hero-content">
    <h1>Welcome to the Aeroplane Portal</h1>
    <p>Manage your flight details, bookings, and schedules with ease and elegance.</p>
    <a href="aeroplaneform.jsp" class="btn btn-glass">Add Flight Details</a>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

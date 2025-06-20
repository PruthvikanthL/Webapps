<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>DJ Neon World</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
 <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@500&display=swap" rel="stylesheet">

  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    body {
      font-family: 'Orbitron', sans-serif;
      height: 100vh;
      background: linear-gradient(120deg, #0f0c29, #302b63, #24243e);
      background-size: 400% 400%;
      animation: gradientAnim 15s ease infinite;
      overflow: hidden;
      color: white;
    }

    @keyframes gradientAnim {
      0% { background-position: 0% 50%; }
      50% { background-position: 100% 50%; }
      100% { background-position: 0% 50%; }
    }

    .navbar {
      background: rgba(0, 0, 0, 0.6) !important;
      backdrop-filter: blur(8px);
      z-index: 10;
    }

    .navbar-brand, .nav-link {
      color: #00ffe5 !important;
      font-weight: bold;
    }

    .form-control {
      background-color: rgba(255, 255, 255, 0.1);
      color: white;
      border: 1px solid #ccc;
    }

    .form-control::placeholder {
      color: #ccc;
    }

    .hero {
      position: relative;
      z-index: 2;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      text-align: center;
      height: 100vh;
      padding: 20px;
    }

    .hero h1 {
      font-size: 3rem;
      color: #00ffe5;
      text-shadow: 0 0 10px #00ffe5, 0 0 20px #00ffe5;
      animation: fadeInDown 1.5s ease;
    }

    .hero .btn-glow {
      display: inline-block;
      margin: 15px;
      padding: 14px 28px;
      font-size: 1.2rem;
      font-weight: bold;
      color: black;
      background: #00ffe5;
      border: none;
      border-radius: 50px;
      box-shadow: 0 0 15px #00ffe5, 0 0 30px #00ffe5;
      transition: 0.3s ease;
      text-decoration: none;
    }

    .hero .btn-glow:hover {
      background-color: #00e2d0;
      transform: scale(1.1);
      box-shadow: 0 0 20px #00ffe5, 0 0 40px #00ffe5;
    }

    @keyframes fadeInDown {
      from {
        opacity: 0;
        transform: translateY(-30px);
      }
      to {
        opacity: 1;
        transform: translateY(0);
      }
    }

    .glow-ring {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      width: 300px;
      height: 300px;
      border-radius: 50%;
      background: rgba(0, 255, 229, 0.08);
      border: 2px solid #00ffe5;
      box-shadow: 0 0 60px #00ffe5, 0 0 100px #00ffe5;
      animation: pulse 3s infinite ease-in-out;
      z-index: 1;
    }

    @keyframes pulse {
      0%, 100% {
        transform: translate(-50%, -50%) scale(1);
        opacity: 0.6;
      }
      50% {
        transform: translate(-50%, -50%) scale(1.2);
        opacity: 1;
      }
    }
  </style>
</head>

<body>
  <nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
      <a class="navbar-brand" href="#"><i class="fas fa-headphones-alt"></i> DJ World</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarMenu">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarMenu">
        <ul class="navbar-nav me-auto">
          <li class="nav-item"><a class="nav-link" href="DJForm.jsp"><i class="fas fa-calendar-check"></i> Book Slot</a></li>
          <li class="nav-item"><a class="nav-link" href="Findevent.jsp"><i class="fas fa-search"></i> Events</a></li>
          <li class="nav-item"><a class="nav-link disabled">Coming Soon...</a></li>
        </ul>
        <form class="d-flex">
          <input class="form-control me-2" type="search" placeholder="Search">
          <button class="btn btn-outline-info" type="submit">Search</button>
        </form>
      </div>
    </div>
  </nav>
<div class="glow-ring"></div>
  <div class="hero">
    <h1>Welcome to DJ Event Portal</h1>
    <a class="btn-glow" href="DJForm.jsp"><i class="fas fa-calendar-alt"></i> Book an Event</a>
    <a class="btn-glow" href="Findevent.jsp"><i class="fas fa-search-location"></i> Search Event</a>
  </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

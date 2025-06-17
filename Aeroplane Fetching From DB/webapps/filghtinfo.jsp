<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Flight Info</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Poppins', sans-serif;
      background: linear-gradient(to right, #0f2027, #203a43, #2c5364);
      color: white;
      min-height: 100vh;
      padding-top: 80px;
    }

    .navbar {
      background-color: rgba(0, 0, 0, 0.85) !important;
      backdrop-filter: blur(6px);
    }

    .container {
      margin-top: 30px;
    }

    .card-glass {
      background: rgba(255, 255, 255, 0.05);
      border-radius: 20px;
      padding: 30px;
      box-shadow: 0 8px 32px rgba(0, 0, 0, 0.3);
      backdrop-filter: blur(12px);
    }

    .table {
      color: white;
    }

    .table th,
    .table td {
      vertical-align: middle;
    }

    .table thead {
      background-color: rgba(0, 201, 167, 0.2);
    }

    .table tbody tr:hover {
      background-color: rgba(255, 255, 255, 0.05);
    }

    .table-bordered {
      border-color: rgba(255, 255, 255, 0.2);
    }
  </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top px-3">
  <div class="container-fluid">
    <a class="navbar-brand fw-bold fs-4" href="#">Aeroplane Portal</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
      <ul class="navbar-nav mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="aeroplane.jsp">Flight Form</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Contact</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="container">
  <div class="card-glass">
    <h2 class="mb-4 text-center">Available Flights</h2>
    <div class="table-responsive">
      <table class="table table-bordered table-hover align-middle text-center">
        <thead>
          <tr>
            <th>#</th>
            <th>Flight Name</th>
            <th>Flight No.</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Domestic</th>
            <th>Departure Date</th>
            <th>Arrival Time</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>IndiGo Express</td>
            <td>6E-203</td>
            <td>Delhi</td>
            <td>Mumbai</td>
            <td>Yes</td>
            <td>2025-06-15</td>
            <td>09:30 AM</td>
          </tr>
          <tr>
            <td>2</td>
            <td>Air India</td>
            <td>AI-108</td>
            <td>Bangalore</td>
            <td>Chennai</td>
            <td>Yes</td>
            <td>2025-06-17</td>
            <td>11:15 AM</td>
          </tr>
          <tr>
            <td>3</td>
            <td>Qatar Airways</td>
            <td>QR-510</td>
            <td>Delhi</td>
            <td>Doha</td>
            <td>No</td>
            <td>2025-06-18</td>
            <td>01:00 AM</td>
          </tr>
          <tr>
            <td>4</td>
            <td>SpiceJet</td>
            <td>SJ-447</td>
            <td>Hyderabad</td>
            <td>Kolkata</td>
            <td>Yes</td>
            <td>2025-06-20</td>
            <td>06:45 PM</td>
          </tr>
          <tr>
            <td>5</td>
            <td>Emirates</td>
            <td>EK-517</td>
            <td>Mumbai</td>
            <td>Dubai</td>
            <td>No</td>
            <td>2025-06-21</td>
            <td>10:20 PM</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

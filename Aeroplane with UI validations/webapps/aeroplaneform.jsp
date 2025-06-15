<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Flight Registration</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Poppins', sans-serif;
      background: linear-gradient(to bottom right, #0f2027, #203a43, #2c5364);
      color: white;
      min-height: 100vh;
      margin: 0;
      padding-top: 80px;
    }
    .navbar {
      background-color: rgba(0, 0, 0, 0.85) !important;
      backdrop-filter: blur(6px);
    }
    .form-container {
      background: rgba(255, 255, 255, 0.05);
      border-radius: 20px;
      padding: 40px;
      max-width: 720px;
      margin: auto;
      box-shadow: 0 8px 32px rgba(0, 0, 0, 0.4);
      backdrop-filter: blur(12px);
    }
    .form-container h2 {
      text-align: center;
      margin-bottom: 30px;
      font-weight: 600;
    }
    .form-label {
      font-weight: 500;
    }
    .form-control,
    .form-select {
      background-color: rgba(255, 255, 255, 0.1);
      color: white;
      border: 1px solid rgba(255, 255, 255, 0.2);
    }
    .form-control:focus,
    .form-select:focus {
      background-color: rgba(255, 255, 255, 0.15);
      color: white;
      border-color: #00c9a7;
      box-shadow: none;
    }
    ::placeholder {
      color: #ccc;
    }
    .form-check-label {
      font-weight: 400;
    }
    .btn-submit {
      background-color: #00c9a7;
      color: white;
      border: none;
      transition: all 0.3s ease;
    }
    .btn-submit:hover {
      background-color: #00b59c;
      transform: scale(1.03);
    }
    .error {
      color: #ff6b6b;
      font-size: 0.9em;
    }
  </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark fixed-top px-3">
  <div class="container-fluid">
    <a class="navbar-brand fw-bold fs-4" href="index.jsp">Aeroplane Portal</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
      <ul class="navbar-nav mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="filghtinfo.jsp">Flights Info</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Contact</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="form-container mt-5">
  <h2>Flight Details Form</h2>
  <span style="color:green">
    <h4>${success}</h4>
  </span>
  <span style="color:red">
    <h4>${failed}</h4>
  </span>
  <form action="flightinfo" method="post">
    <div class="mb-3">
      <label class="form-label">Flight Name</label>
      <input type="text" class="form-control" name="flightName" placeholder="Enter flight name" required value="${aeroplanedto.flightName}">
      <div class="error">${errors.flightName}</div>
    </div>
    <div class="mb-3">
      <label class="form-label">Flight Number</label>
      <input type="text" class="form-control" name="flightNumber" placeholder="E.g., AI202" required value="${aeroplanedto.flightNumber}">
      <div class="error">${errors.flightNumber}</div>
    </div>
    <div class="mb-3">
      <label class="form-label">Source</label>
      <select class="form-select" name="source" required>
        <option selected disabled>Select source city</option>
        <option value="Delhi">Delhi</option>
        <option value="Mumbai">Mumbai</option>
        <option value="Bangalore">Bangalore</option>
        <option value="Chennai">Chennai</option>
      </select>
      <div class="error">${errors.source}</div>
    </div>
    <div class="mb-3">
      <label class="form-label">Destination</label>
      <select class="form-select" name="destination" required>
        <option selected disabled>Select destination city</option>
        <option value="Delhi">Delhi</option>
        <option value="Mumbai">Mumbai</option>
        <option value="Bangalore">Bangalore</option>
        <option value="Chennai">Chennai</option>
      </select>
      <div class="error">${errors.destination}</div>
    </div>
    <div class="mb-3">
      <label class="form-label">Is Domestic?</label><br>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="isDomestic" id="domesticYes" value="yes" required value="${aeroplanedto.isDomestic}">
        <label class="form-check-label" for="domesticYes">Yes</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="isDomestic" id="domesticNo" value="no" value="${aeroplanedto.isDomestic}">
        <label class="form-check-label" for="domesticNo">No</label>
      </div>
      <div class="error">${errors.isDomestic}</div>
    </div>
    <div class="mb-3">
      <label class="form-label">Departure Date</label>
      <input type="date" class="form-control" name="departureDate" required value="${aeroplanedto.departureDate}">
      <div class="error">${errors.departureDate}</div>
    </div>
    <div class="mb-3">
      <label class="form-label">Arrival Time</label>
      <input type="time" class="form-control" name="arrivalTime" required value="${aeroplanedto.arrivalTime}">
      <div class="error">${errors.arrivalTime}</div>
    </div>
    <div class="mb-3">
      <label class="form-label">Notes</label>
      <textarea class="form-control" name="notes" rows="3" placeholder="Any additional information..."></textarea>
    </div>
    <div class="d-grid">
      <button type="submit" class="btn btn-submit btn-lg">Submit Flight</button>
    </div>
  </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

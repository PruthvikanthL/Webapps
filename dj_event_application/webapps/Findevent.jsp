<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Book Your DJ Slot</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css" rel="stylesheet" />
  <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@500&display=swap" rel="stylesheet">
  <style>
    body {
      font-family: 'Orbitron', sans-serif;
      margin: 0;
      background: linear-gradient(270deg, #0f0c29, #302b63, #24243e);
      background-size: 600% 600%;
      animation: animatedGradient 15s ease infinite;
      color: white;
    }

    @keyframes animatedGradient {
      0% { background-position: 0% 50%; }
      50% { background-position: 100% 50%; }
      100% { background-position: 0% 50%; }
    }

    .navbar {
      background: rgba(0, 0, 0, 0.5);
      backdrop-filter: blur(10px);
    }

    .navbar-brand, .nav-link {
      color: #00ffe5 !important;
      font-weight: bold;
    }

    .form-wrapper {
      max-width: 700px;
      margin: 50px auto;
      background: rgba(255, 255, 255, 0.05);
      padding: 40px;
      border-radius: 20px;
      box-shadow: 0 0 40px rgba(0, 255, 229, 0.3);
      backdrop-filter: blur(15px);
      animation: fadeIn 2s ease;
    }

    @keyframes fadeIn {
      from { opacity: 0; transform: translateY(-30px); }
      to { opacity: 1; transform: translateY(0); }
    }

    .form-control, .form-control:focus {
      background: rgba(255, 255, 255, 0.1);
      border: 1px solid rgba(255, 255, 255, 0.2);
      color: white;
      box-shadow: none;
    }

    .form-label {
      color: #00ffe5;
    }

    .submit-btn {
      background: #00ffe5;
      color: black;
      font-weight: bold;
      padding: 10px 30px;
      border: none;
      border-radius: 30px;
      transition: all 0.4s ease;
      box-shadow: 0 0 20px #00ffe5;
    }

    .submit-btn:hover {
      background: #00e6ce;
      transform: scale(1.05);
      box-shadow: 0 0 40px #00ffe5;
    }

    .table-wrapper {
      margin: 40px auto;
      max-width: 95%;
      background: rgba(255, 255, 255, 0.05);
      padding: 20px;
      border-radius: 15px;
      box-shadow: 0 0 30px rgba(0, 255, 229, 0.2);
    }

    table {
      width: 100%;
      border-collapse: collapse;
      text-align: center;
    }

    th, td {
      border: 1px solid rgba(255, 255, 255, 0.2);
      padding: 10px;
      color: #fff;
    }

    th {
      background-color: rgba(0, 255, 229, 0.2);
      color: #00ffe5;
    }

    td {
      background-color: rgba(255, 255, 255, 0.05);
    }
  </style>
</head>
<body>

<nav class="navbar navbar-expand-lg">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp"><i class="fas fa-headphones-alt"></i> DJ World</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarMenu">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarMenu">
      <ul class="navbar-nav me-auto">
        <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="Findevent.jsp">Events</a></li>
        <li class="nav-item"><a class="nav-link disabled">Coming Soon...</a></li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search">
        <button class="btn btn-outline-info" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<div class="form-wrapper">
  <h2 class="text-center mb-4">Search Booking by ID</h2>
  <form action="searchById" method="get">
    <div class="mb-3">
      <label class="form-label">Enter Booking ID</label>
      <input type="text" class="form-control" name="bookingId" placeholder="Enter your booking ID" required />
    </div>
    <div class="text-center">
      <button type="submit" class="submit-btn me-3"><i class="fas fa-search"></i> Search</button>
      <button type="reset" class="submit-btn" style="background-color: transparent; border: 2px solid #00ffe5; color: #00ffe5;"><i class="fas fa-eraser"></i> Clear</button>
    </div>
  </form>
</div>
<div class="text-center">
  <span style="color:lime"><h4>${fetched}</h4></span>
  <span style="color:tomato"><h4>${notfetched}</h4></span>
</div>
<c:if test="${not empty data}">
  <div class="table-wrapper">
    <table>
      <thead>
        <tr>
          <th>Id</th>
          <th>User Name</th>
          <th>User Number</th>
          <th>User Email</th>
          <th>Event Name</th>
          <th>Location</th>
          <th>Event Date</th>
          <th>Event Time</th>
          <th>Note</th>
          <th>Created Date</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>${data.id}</td>
          <td>${data.userName}</td>
          <td>${data.userNumber}</td>
          <td>${data.userEmail}</td>
          <td>${data.eventName}</td>
          <td>${data.location}</td>
          <td>${data.eventDate}</td>
          <td>${data.eventTime}</td>
          <td>${data.note}</td>
          <td>${data.createdDate}</td>
        </tr>
      </tbody>
    </table>
  </div>
</c:if>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

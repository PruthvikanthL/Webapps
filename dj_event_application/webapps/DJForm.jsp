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
  <h2 class="text-center mb-4">Book Your DJ Slot</h2>
<span style="color:green">
    <h4>${success}</h4>
  </span>
  <span style="color:red">
    <h4>${fail}</h4>
  </span>
  <form action="regform" method="post">
    <div class="mb-3">
      <label class="form-label">User Name</label>
      <input type="text" class="form-control" name="userName" placeholder="Enter your name" required values="${dto.userName}" />
    </div>
    <div class="mb-3">
      <label class="form-label">Phone Number</label>
      <input type="tel" class="form-control" name="userNumber" placeholder="Enter your phone number" required values="${dto.userNumber}"/>
    </div>
    <div class="mb-3">
      <label class="form-label">Email</label>
      <input type="email" class="form-control" name="userEmail" placeholder="Enter your email" required  values="${dto.userEmail}"/>
    </div>
    <div class="mb-3">
      <label class="form-label">Event Name</label>
      <input type="text" class="form-control" name="eventName" placeholder="Enter the event name" required values="${dto.eventName}"/>
    </div>
    <div class="mb-3">
      <label class="form-label">Location</label>
      <input type="text" class="form-control" name="location" placeholder="Enter event location" required values="${dto.location}" />
    </div>
    <div class="mb-3">
      <label class="form-label">Date</label>
      <input type="date" class="form-control" name="eventDate" required values="${dto.eventDate}"/>
    </div>
    <div class="mb-3">
      <label class="form-label">Time</label>
      <input type="time" class="form-control" name="eventTime" required values="${dto.eventTime}" />
    </div>
    <div class="mb-3">
      <label class="form-label">Note</label>
      <textarea class="form-control" name="note" placeholder="Add any additional notes..." rows="3"></textarea>
    </div>
    <div class="text-center">
      <button type="submit" class="submit-btn">Register to Enjoy the Event</button>
    </div>
  </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

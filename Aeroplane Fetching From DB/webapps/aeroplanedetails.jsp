<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Get Aeroplane Details</title>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet"/>
  <style>
    * {
      margin: 0;
      padding: 0;
      font-family: 'Poppins', sans-serif;
      box-sizing: border-box;
    }

    body {
      min-height: 100vh;
      background: linear-gradient(135deg, #00b4db, #0083b0);
      display: flex;
      flex-direction: column;
      align-items: center;
      padding-top: 80px;
    }

    .navbar {
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      background: rgba(0, 0, 0, 0.8);
      color: white;
      padding: 16px;
      text-align: center;
      font-size: 24px;
      font-weight: 600;
      letter-spacing: 1px;
      z-index: 1000;
      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
    }

    .glass-card {
      background: rgba(255, 255, 255, 0.1);
      border-radius: 20px;
      padding: 30px 30px;
      box-shadow: 0 8px 32px rgba(0, 0, 0, 0.2);
      backdrop-filter: blur(15px);
      -webkit-backdrop-filter: blur(15px);
      width: 360px;
      color: white;
      border: 1px solid rgba(255, 255, 255, 0.2);
      margin-bottom: 40px;
    }

    .glass-card h2 {
      font-size: 22px;
      margin-bottom: 20px;
      text-align: center;
    }

    label {
      display: block;
      margin-bottom: 8px;
      font-weight: 500;
    }

    input[type="text"] {
      width: 100%;
      padding: 10px 14px;
      border-radius: 10px;
      border: none;
      margin-bottom: 20px;
      font-size: 14px;
      outline: none;
    }

    button {
      width: 100%;
      padding: 12px;
      background: #ffffff;
      border: none;
      border-radius: 10px;
      color: #007c91;
      font-weight: 600;
      font-size: 16px;
      cursor: pointer;
      transition: all 0.3s ease-in-out;
    }

    button:hover {
      background: #f1f1f1;
      transform: scale(1.05);
    }

    .result-message {
      text-align: center;
      color: #00ffbf;
      margin-top: 10px;
    }
.result-not-message {
      text-align: center;
      color:red;
      margin-top: 10px;
    }
    .data-table {
      width: 90%;
      max-width: 1000px;
      background: rgba(255, 255, 255, 0.2);
      border-collapse: collapse;
      backdrop-filter: blur(10px);
      box-shadow: 0 8px 24px rgba(0, 0, 0, 0.2);
      border-radius: 15px;
      overflow: hidden;
    }

    .data-table th, .data-table td {
      padding: 14px 18px;
      text-align: center;
      color: white;
    }

    .data-table thead {
      background-color: rgba(0, 0, 0, 0.3);
    }

    .data-table tbody tr:nth-child(even) {
      background-color: rgba(255, 255, 255, 0.1);
    }

    @media (max-width: 768px) {
      .data-table th, .data-table td {
        font-size: 12px;
        padding: 10px;
      }
    }
  </style>
</head>
<body>

  <div class="navbar">Get Aeroplane Details</div>

  <div class="glass-card">
    <h2>Search Flight by ID</h2>
    <form action="aeroplanedetails" method="get">
      <label for="flightid">Flight ID</label>
      <input type="text" id="flightNumber" name="flightid" placeholder="e.g. 1XX" required />
      <button type="submit">Search</button>
      <div class="result-message">
        <h4>${fetched}</h4>
        </div>
      <div class="result-not-message">
        <h4>${notfetched}</h4>
            </div>
    </form>
  </div>


  <table class="data-table">
    <thead>
      <tr>
        <th>Flight Name</th>
        <th>Flight Number</th>
        <th>Source</th>
        <th>Destination</th>
        <th>Domestic</th>
        <th>Departure Time</th>
        <th>Arrival Time</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${aerodetails.flightName}</td>
        <td>${aerodetails.flightNumber}</td>
        <td>${aerodetails.source}</td>
        <td>${aerodetails.destination}</td>
        <td>${aerodetails.isDomestic}</td>
        <td>${aerodetails.departureDate}</td>
        <td>${aerodetails.arrivalTime}</td>
      </tr>
    </tbody>
  </table>

</body>
</html>

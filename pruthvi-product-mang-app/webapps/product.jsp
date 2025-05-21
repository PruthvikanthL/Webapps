<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Product Form</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <style>
      body {
        background: linear-gradient(to right, #e3f2fd, #ffffff);
        padding: 30px;
      }
      .form-title {
        text-align: center;
        font-weight: bold;
        font-size: 2rem;
        color: #0d6efd;
        margin-bottom: 20px;
      }
    </style>
  </head>
  <body>

    <nav class="navbar" style="background-color: #e3f2fd;" data-bs-theme="light">
      <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
          data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03"
          aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="#">Products Portal</a>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </li>
          </ul>
          <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
            <button class="btn btn-outline-success" type="submit">Search</button>
          </form>
        </div>
      </div>
    </nav>


    <div class="container mt-4">
      <div class="form-title">Product Form</div>
      <form method="post" action="product">
        <div class="row mb-3">
          <div class="col">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" name="name" id="name" required />
          </div>
          <div class="col">
            <label for="type" class="form-label">Type</label>
            <select class="form-select" name="type" id="type" required>
              <option selected disabled>Choose type</option>
              <option>Electronic</option>
              <option>Furniture</option>
              <option>Apparel</option>
            </select>
          </div>
        </div>

        <div class="row mb-3">
          <div class="col">
            <label for="incomingPrice" class="form-label">Incoming Price</label>
            <input type="number" class="form-control" name="incomingPrice" id="incomingPrice" required />
          </div>
          <div class="col">
            <label for="sellingPrice" class="form-label">Selling Price</label>
            <input type="number" class="form-control" name="sellingPrice" id="sellingPrice" required />
          </div>
          <div class="col">
            <label for="mrp" class="form-label">MRP</label>
            <input type="number" class="form-control" name="mrp" id="mrp" />
          </div>
        </div>

        <div class="mb-3">
          <label for="description" class="form-label">Description</label>
          <textarea class="form-control" name="description" id="description" rows="3"></textarea>
        </div>

        <div class="row mb-3">
          <div class="col">
            <label for="brand" class="form-label">Brand</label>
            <input type="text" class="form-control" name="brand" id="brand" />
          </div>
          <div class="col">
            <label for="quantity" class="form-label">Quantity</label>
            <input type="number" class="form-control" name="quantity" id="quantity" />
          </div>
          <div class="col">
            <label for="color" class="form-label">Color</label>
            <select class="form-select" name="color" id="color">
              <option selected disabled>Select color</option>
              <option>Red</option>
              <option>Blue</option>
              <option>Black</option>
            </select>
          </div>
        </div>

        <div class="row mb-3">
          <div class="col">
            <label for="weight" class="form-label">Weight (kg)</label>
            <input type="number" step="0.01" class="form-control" name="weight" id="weight" />
          </div>
          <div class="col">
            <label for="manufDate" class="form-label">Manufacturing Date</label>
            <input type="date" class="form-control" name="manufDate" id="manufDate" />
          </div>
          <div class="col">
            <label for="warranty" class="form-label">Warranty</label>
            <select class="form-select" name="warranty" id="warranty">
              <option selected disabled>Choose warranty</option>
              <option>No Warranty</option>
              <option>6 Months</option>
              <option>1 Year</option>
              <option>2 Years</option>
            </select>
          </div>
        </div>

        <div class="form-check mb-3">
          <input class="form-check-input" type="checkbox" id="returnPolicy" name="returnPolicy" value="true"/>
          <label class="form-check-label" for="returnPolicy">Return Policy Available</label>
        </div>

        <button type="submit" class="btn btn-primary w-100">Submit</button>
      </form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Product Submission Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />
    <style>
        td {
            word-break: break-word;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-success">
    <div class="container">
        <a class="navbar-brand" href="#">MyStore</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavSuccess" aria-controls="navbarNavSuccess" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavSuccess">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="productForm.jsp">Product Form</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="ProductSuccess.jsp">Submission Success</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-3">
    <a href="product.jsp" class="btn btn-outline-primary">← Back to Product Form</a>
</div>

<div class="container text-center mt-5 pt-4">
    <div class="card shadow p-4 border-success">
        <h2 class="text-success mb-3">Product Submitted Successfully!</h2>
        <table class="table table-hover table-bordered border-primary">
            <thead>
                <tr class="table-primary">
                    <th scope="col">Name</th>
                    <th scope="col">Type</th>
                    <th scope="col">Incoming Price</th>
                    <th scope="col">Selling Price</th>
                    <th scope="col">MRP</th>
                    <th scope="col">Description</th>
                    <th scope="col">Brand</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Color</th>
                    <th scope="col">Weight (kg)</th>
                    <th scope="col">Manufacture Date</th>
                    <th scope="col">Warranty</th>
                    <th scope="col">Return Policy</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${productDto.name}</td>
                    <td>${productDto.type}</td>
                    <td>${productDto.incomingprice}</td>
                    <td>${productDto.sellingprice}</td>
                    <td>${productDto.MRP}</td>
                    <td>${productDto.description}</td>
                    <td>${productDto.brand}</td>
                    <td>${productDto.quantity}</td>
                    <td>${productDto.color}</td>
                    <td>${productDto.weight}</td>
                    <td>${productDto.manufdate}</td>
                    <td>${productDto.warranty}</td>
                    <td>${productDto.returnpolicy}</td>
                </tr>
            </tbody>
        </table>
        <p class="fs-5 mt-3">Your product details have been successfully submitted.</p>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>

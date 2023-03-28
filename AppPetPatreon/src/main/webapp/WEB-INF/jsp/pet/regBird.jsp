<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
      <meta charset="UTF-8">
      <title>Register New Bird</title>
    </head>

    <body>
      <c:import url="/WEB-INF/jsp/modal.jsp" />
      
      <c:import url="/WEB-INF/jsp/navbar.jsp" />

      <div class="d-flex justify-content-center">
        <div class="shadow p-3 mb-5 bg-white container card card-block w-50 m-5">
          <form action="/pet/addBird" method="post">
            <div class="d-flex flex-column">
              <h2 class="align-self-center">New Bird</h3>

                <div class="form-group mb-3 mt-3">
                  <label>Name:</label>
                  <input type="text" name="name" value="Bat" class="form-control">
                </div>

                <div class="mb-3 mt-3">
                  <label><b>Animal Type</b></label>
                  <div class="form-check mb-3 mt-3">
                    <label class="form-check-label">
                      <input type="radio" name="animalType" value="Bird" class="form-check-input" checked> Bird
                    </label>
                  </div>
                </div>

                <div class="form-group mb-3">
                  <label>Age:</label>
                  <input type="number" name="age" value="16" class="form-control">
                </div>

                <div class="form-group mb-3">
                  <label>Gender:</label>
                  <input type="text" name="gender" value="Male / Female" class="form-control">
                </div>

                <div class="form-group mb-3">
                  <label>Monthly Food Cost:</label>
                  <input type="number" name="foodCost" value="12" class="form-control">
                </div>

                <div class="mb-3 mt-3">

                  <label><b>Size</b></label>
                  <div class="form-check mb-3 mt-3">
                    <label class="form-check-label">
                      <input type="radio" name="size" value="Large" class="form-check-input"> Large
                    </label>
                  </div>

                  <div class="form-check mb-3">
                    <label class="form-check-label">
                      <input type="radio" name="size" value="Medium" class="form-check-input" checked> Medium
                    </label>
                  </div>

                  <div class="form-check mb-3">
                    <label class="form-check-label">
                      <input type="radio" name="size" value="Small" class="form-check-input"> Small
                    </label>
                  </div>

                </div>

                <div class="form-group mb-3">
                  <label>Monthly Hay Cost:</label>
                  <input type="number" name="hayCost" value="10" class="form-control">
                </div>

                <div class="form-group mb-3">
                  <label>Monthly Toys Cost:</label>
                  <input type="number" name="toysCost" value="5" class="form-control">
                </div>

                <button type="submit" class="align-self-center btn btn-primary">Confirm</button>

            </div>
          </form>
        </div>
      </div>
    </body>

    </html>
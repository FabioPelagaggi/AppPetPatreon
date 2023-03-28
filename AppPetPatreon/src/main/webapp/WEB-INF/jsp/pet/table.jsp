<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>

    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
      <meta charset="UTF-8">
      <title>Pets Data Table</title>
    </head>

    <body>
      <c:import url="/WEB-INF/jsp/modal.jsp" />
      
      <c:import url="/WEB-INF/jsp/navbar.jsp" />

      <div class="d-flex justify-content-center">
        <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">

          <c:if test="${not empty message}">
            <div class="alert alert-success">
              <strong>Success!</strong> ${message}
            </div>
          </c:if>

          <c:if test="${not empty messageError}">
            <div class="alert alert-danger">
              <strong>Error!</strong> ${messageError}
            </div>
          </c:if>

          <form action="/" method="get">

            <div class="d-flex flex-column">
              <h2 class="m-3 align-self-center">Pets Data</h2>

              <c:if test="${empty pets}">
                <div class="alert alert-danger">
                  <strong>Warning!</strong> No pets registered yet.
                </div>
              </c:if>

              <c:if test="${not empty pets}">
                <div>
                  <div>
                    <h5 class="m-3 align-self-center">Pets # ${pets.size()}</h5>
                  </div>
                  <table class="table">
                    <thead class="thead-dark">
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Species</th>
                        <th scope="col">Age</th>
                        <th scope="col">Gender</th>
                        <th scope="col">Food Cost</th>
                        <th scope="col">Agency</th>
                        <th scope="col">Monthly Cost</th>
                        <th scope="col">Donations Qty.</th>
                        <c:if test="${logedPatreon.admin}">
                          <th scope="col">Delete</th>
                        </c:if>
                      </tr>
                    </thead>
                    <tbody>
                      <c:forEach items="${pets}" var="pet">
                        <tr>
                          <th scope="row">${pet.id}</th>
                          <td>${pet.name}</td>
                          <td>${pet.animalType}</td>
                          <td>${pet.age}</td>
                          <td>${pet.gender}</td>
                          <td>${pet.foodCost}</td>
                          <td>${pet.agency.name}</td>
                          <td>${pet.calcMonthlyCost()}</td>
                          <td>${pet.donations.size()}</td>
                          <c:if test="${logedPatreon.admin}">
                            <td>
                              <a href="/pet/${pet.id}/remove">
                                <i class="fa fa-trash-o ms-3" style="font-size:24px;color:red"></i>
                              </a>
                            </td>
                          </c:if>
                        </tr>
                      </c:forEach>
                    </tbody>
                  </table>
                </div>
              </c:if>

              <button type="submit" class="align-self-center btn btn-primary mb-3">Home</button>

            </div>

          </form>
        </div>
      </div>
    </body>

    </html>
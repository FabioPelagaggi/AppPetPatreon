<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>

    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <meta charset="ISO-8859-1">
      <title>Pets Data Table</title>
    </head>

    <body>
      <div class="d-flex justify-content-center">
        <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">

          <c:if test="${not empty addedPet}">
            <div class="alert alert-success">
              <strong>Success!</strong> New Pet ${addedPet.name} was registred.
            </div>
          </c:if>

          <c:if test="${not empty removedPet}">
            <div class="alert alert-success">
              <strong>Success!</strong> Pet ${removedPet.name} was removed.
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
                        <th scope="col">Delete</th>
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
                          <td>
                            <a href="/pet/${pet.id}/remove">
                              <i class="fa fa-trash-o" style="font-size:24px;color:red"></i>
                            </a>
                          </td>
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
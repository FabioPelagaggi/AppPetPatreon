<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>

    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <meta charset="ISO-8859-1">
      <title>Patreon Data Table</title>
    </head>

    <body>
      <c:import url="/WEB-INF/jsp/navbar.jsp" />
      
      <div class="d-flex justify-content-center">
        <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">

          <c:if test="${not empty addedPatreon}">
            <div class="alert alert-success">
              <strong>Success!</strong> New Patreon ${addedPatreon.name} was registred.
            </div>
          </c:if>

          <c:if test="${not empty removedPatreon}">
            <div class="alert alert-success">
              <strong>Success!</strong> Patreon ${removedPatreon.name} was removed.
            </div>
          </c:if>

          <form action="/" method="get">

            <div class="d-flex flex-column">
              <h2 class="m-3 align-self-center">Patreons Data</h2>

              <c:if test="${empty patreons}">
                <div class="alert alert-danger">
                  <strong>Warning!</strong> No patreons registered yet.
                </div>
              </c:if>

              <c:if test="${not empty patreons}">
                <div>
                  <div>
                    <h5 class="m-3 align-self-center">Patreons # ${patreons.size()}</h5>
                  </div>
                  <table class="table">
                    <thead class="thead-dark">
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Phone</th>
                        <th scope="col">Password</th>
                        <th scope="col">Admin</th>
                        <th scope="col">Delete</th>
                      </tr>
                    </thead>
                    <tbody>
                      <c:forEach items="${patreons}" var="patreon">
                        <tr>
                          <th scope="row">${patreon.id}</th>
                          <td>${patreon.name}</td>
                          <td>${patreon.email}</td>
                          <td>${patreon.phone}</td>
                          <td>${patreon.password}</td>
                          <td>${patreon.admin}</td>
                          <td>
                            <a href="/patreon/${patreon.id}/remove">
                              <i class="fa fa-trash-o" style="font-size:24px;color:red"></i>
                            </a>
                          </td>
                        </tr>
                      </c:forEach>
                    </tbody>
                  </table>
                </div>
              </c:if>

              <button type="submit" class="align-self-center btn btn-primary m-3">Home</button>

            </div>

          </form>
        </div>
      </div>
    </body>

    </html>
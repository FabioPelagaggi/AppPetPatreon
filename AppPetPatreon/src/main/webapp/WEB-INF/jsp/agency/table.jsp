<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>

    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <meta charset="ISO-8859-1">
      <title>Agency Data Table</title>
    </head>

    <body>
      <c:import url="/WEB-INF/jsp/navbar.jsp" />
      
      <div class="d-flex justify-content-center">
        <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">

          <c:if test="${not empty addedAgency}">
            <div class="alert alert-success">
              <strong>Success!</strong> New Agency ${addedAgency.name} was registred.
            </div>
          </c:if>

          <c:if test="${not empty removedAgency}">
            <div class="alert alert-success">
              <strong>Success!</strong> Agency ${removedAgency.name} was removed.
            </div>
          </c:if>

          <form action="/" method="get">

            <div class="d-flex flex-column">
              <h2 class="m-3 align-self-center">Agencies Data</h2>

              <c:if test="${empty agencies}">
                <div class="alert alert-danger">
                  <strong>Warning!</strong> No agencies registered yet.
                </div>
              </c:if>

              <c:if test="${not empty agencies}">
                <div>
                  <div>
                    <h5 class="m-3 align-self-center">Agencies # ${Agencies.size()}</h5>
                  </div>
                  <table class="table">
                    <thead class="thead-dark">
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Members Qty.</th>
                        <th scope="col">Delete</th>
                      </tr>
                    </thead>
                    <tbody>
                      <c:forEach items="${agencies}" var="agency">
                        <tr>
                          <th scope="row">${agency.id}</th>
                          <td>${agency.name}</td>
                          <td>${agency.email}</td>
                          <td>${agency.patreons.size()}</td>
                          <td>
                            <a href="/agency/${agency.id}/remove">
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
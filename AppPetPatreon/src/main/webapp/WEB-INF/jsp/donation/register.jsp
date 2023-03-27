<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
            <meta charset="ISO-8859-1">
            <title>Register New Donation</title>
        </head>

        <body>
            <c:import url="/WEB-INF/jsp/modal.jsp" />

            <c:import url="/WEB-INF/jsp/navbar.jsp" />

            <div class="d-flex justify-content-center">
                <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">
                    <form action="/donation/add" method="post">
                        <div class="d-flex flex-column">
                            <h2 class="mt-3 align-self-center">New Donation</h2>

                            <div class="form-group mb-3 mt-3">
                                <label>Donation Amount:</label>
                                <input type="number" name="donationAmount" value="1000" class="form-control">
                            </div>

                            <label class="mb-2">Pets:</label>
                            <c:if test="${not empty pets}">
                                <table class="table">
                                    <thead class="thead-dark">
                                    <tr>
                                        <th scope="col">Select</th>
                                        <th scope="col">#</th>
                                        <th scope="col">Name</th>
                                        <th scope="col">Animal Type</th>
                                        <th scope="col">Monthly Cost (R$)</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${pets}" var="pet">
                                        <tr>
                                        <td class="ms-3">
                                            <input class="ms-3" type="checkbox" name="pets" value="${pet.id}">
                                        </td>
                                        <td scope="row">${pet.id}</td>
                                        <td>${pet.name}</td>
                                        <td>${pet.animalType}</td>
                                        <td>${pet.calcMonthlyCost()}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </c:if>
                            <c:if test="${empty pets}">
                                <p class="text-center">No pets registered</p>
                            </c:if>
                           
                            <button type="submit" class="align-self-center btn btn-primary m-3">Comfirm</button>
                        </div>
                    </form>
                </div>
            </div>
        </body>

        </html>
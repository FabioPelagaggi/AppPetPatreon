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

                            <div class="mb-3">
                                <label class="mb-1">Pet</label>
                                <select class="form-select" name="petId">
                                    <c:forEach items="${pets}" var="pet">
                                        <option value="${pet.id}">${pet.name}</option>
                                    </c:forEach>
                                </select>
                            </div>

                            <button type="submit" class="align-self-center btn btn-primary m-3">Comfirm</button>
                        </div>
                    </form>
                </div>
            </div>
        </body>

        </html>
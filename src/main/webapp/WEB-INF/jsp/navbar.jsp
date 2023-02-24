<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <ul class="navbar-nav">

                    <li class="nav-item">
                        <a class="nav-link" href="/home">Home</a>
                    </li>

                    <c:if test="${logedUser.admin}">
                        <li class="nav-item">
                            <a class="nav-link" href="/user/register">New Patreon</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/user/table">Patreons Table</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/pet">New Pet</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/pet/table">Pets Table</a>
                        </li>
                    </c:if>

                    <c:if test="${not empty logedUser}">
                        <c:if test="${not logedUser.admin}">
                            <li class="nav-item">
                                <a class="nav-link" href="/donation">Make Donation</a>
                            </li>
                        </c:if>
                    </c:if>
                </ul>

                <ul class="navbar-nav navbar-right">

                    <c:if test="${empty logedUser}">
                        <li class="nav-item">
                            <a href="/user/register" class="nav-link">
                                Register
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/login" class="nav-link active btn btn-primary">
                                Login
                            </a>
                        </li>
                    </c:if>

                    <c:if test="${not empty logedUser}">
                        <button type="button" class="btn btn-secondary" data-bs-toggle="modal"
                            data-bs-target="#myModal">
                            Logout, ${logedUser.name}
                        </button>
                    </c:if>

                </ul>
            </div>
        </nav>
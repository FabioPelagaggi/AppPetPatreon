<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>

    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" />
      <meta charset="ISO-8859-1" />
      <title>Login</title>
    </head>

    <body>
      <div class="d-flex justify-content-center">
        <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">
          <c:if test="${not empty errorMsg}">
            <div class="alert alert-danger">
              <strong>Warning!</strong> ${errorMsg}
            </div>
          </c:if>

          <form action="/login" method="post">
            <div class="d-flex flex-column">
              <h2 class="mt-3 align-self-center">Login</h2>

              <div class="form-group mb-3">
                <label>E-mail:</label>
                <input type="email" name="email" value="bat@gmail.com" class="form-control" />
              </div>

              <div class="form-group mb-3">
                <label>Password:</label>
                <input type="password" name="password" value="666" class="form-control" />
              </div>

              <button type="submit" class="align-self-center btn btn-primary mb-3">
                Comfirm
              </button>

              <div class="d-flex justify-content-around mb-3">
                <a class="nav-link active" href="/user/register">Register</a>
                <a class="nav-link active" href="/user/password">Reset Password</a>
              </div>
            </div>
          </form>
        </div>
      </div>
    </body>

    </html>
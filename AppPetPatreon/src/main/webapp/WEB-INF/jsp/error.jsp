<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
            <meta charset="ISO-8859-1">
            <title>Not Ready</title>
        </head>

        <body>
            <c:import url="/WEB-INF/jsp/modal.jsp" />
            
            <c:import url="/WEB-INF/jsp/navbar.jsp" />

            <div class="d-flex justify-content-center">
                <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">
                    <form action="" method="post">
                        <div class="d-flex flex-column">
                            <h2 class="m-3 align-self-center">Page not Ready</h2>
                        </div>
                    </form>
                </div>
            </div>
        </body>

        </html>
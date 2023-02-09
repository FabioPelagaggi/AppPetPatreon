<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">	
        <meta charset="ISO-8859-1">
        <title>Register New Horse</title>
    </head>
    <body>
        <div class="d-flex justify-content-center">
            <div class="shadow p-3 mb-5 bg-white container card card-block w-50 m-5">
                <form action="/pet/addHorse" method="post">
                <div class="d-flex flex-column">
                    <h2 class="align-self-center">New Horse</h3>

                    
                    
                    <button type="submit" class="align-self-center btn btn-primary">Confirm</button>

                </div>
                </form>			
            </div>
        </div>
    </body>
</html>
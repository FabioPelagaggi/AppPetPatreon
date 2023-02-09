<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <meta charset="ISO-8859-1">
        <title>Register New User</title>
    </head>
    <body>
        <div class="d-flex justify-content-center">
            <div class="shadow p-3 mb-5 bg-white container card card-block w-50 m-5">
                <form action="/user/add" method="post">
                    <div class="d-flex flex-column">
                        <h2 class="mt-3 align-self-center">New User</h2>
                
                        <div class="form-group mb-3 mt-3">
                            <label>Name:</label> 	
                            <input type="text" name="name" value="Vlad Tepes Dracula" class="form-control">
                        </div>
                        
                        <div class="form-group mb-3">
                            <label>Password:</label>
                            <input type="password" name="password" value="666" class="form-control">
                        </div>
                        
                        <div class="form-group mb-3">
                            <label>E-mail:</label>
                            <input type="email" name="email" value="bat18@gmail.com" class="form-control">
                        </div>
                                    
                        <div class="form-group mb-3">
                            <label>Phone:</label> 	
                            <input type="text" name="phone" value="65683156613" class="form-control">
                        </div>
                                                
                        <button type="submit" class="align-self-center btn btn-primary mb-3">Comfirm</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
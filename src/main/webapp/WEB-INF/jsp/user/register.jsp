<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">	
        <meta charset="ISO-8859-1">
        <title>Register new User</title>
    </head>
    <body>
        <div class="container">
            <form action="/user/add" method="post">
                <h3>Register new User</h3>
            
                <div class="form-group">
                    <label>Name:</label> 	
                    <input type="text" name="name" value="Vlad Tepes Dracula" class="form-control">
                </div>
                
                <div class="form-group">
                    <label>Password:</label>
                    <input type="password" name="password" value="666" class="form-control">
                </div>
                
                <div class="form-group">
                    <label>E-mail:</label>
                    <input type="email" name="email" value="bat18@gmail.com" class="form-control">
                </div>
                            
                <div class="form-group">
                    <label>Phone:</label> 	
                    <input type="text" name="phone" value="65683156613" class="form-control">
                </div>
    
                <button type="submit">Register</button>
            </form>
        </div>
    </body>
</html>
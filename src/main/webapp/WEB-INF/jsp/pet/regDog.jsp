<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">	
        <meta charset="ISO-8859-1">
        <title>Register New Dog</title>
    </head>
    <body>
        <div class="d-flex justify-content-center">
            <div class="shadow p-3 mb-5 bg-white container card card-block w-50 m-5">
                <form action="/pet/addDog" method="post">
                <div class="d-flex flex-column">
                    <h2 class="align-self-center">New Dog</h3>

                     <div class="form-group mb-3 mt-3">
                        <label>Name:</label> 	
                        <input type="text" name="name" value="Ymir" class="form-control">
                    </div>

                    <div class="mb-3 mt-3">	
                      <label><b>Animal Type</b></label>			
                      <div class="form-check mb-3 mt-3">
                        <label class="form-check-label">
                          <input type="radio" name="animalType" value="Dog" class="form-check-input" checked> Dog
                        </label>
                      </div>
                    </div>
                    
                    <div class="form-group mb-3">
                        <label>Age:</label>
                        <input type="number" name="age" value="6" class="form-control">
                    </div>
                    
                    <div class="form-group mb-3">
                        <label>Gender:</label>
                        <input type="text" name="gender" value="Male" class="form-control">
                    </div>

                    <div class="form-group mb-3">
                      <label>Monthly Food Cost:</label>
                      <input type="number" name="foodCost" value="60" class="form-control">
                    </div>

                    <div class="form-group mb-3">
                        <label>Breed:</label>
                        <input type="text" name="breed" value="Alaskan Malamute" class="form-control">
                    </div>

                    <div class="mb-3 mt-3">	

                        <label><b>Size</b></label>			
                        <div class="form-check mb-3 mt-3">
                          <label class="form-check-label">
                            <input type="radio" name="size" value="Large" class="form-check-input" checked> Large
                          </label>
                        </div>
        
                        <div class="form-check mb-3">
                          <label class="form-check-label">
                            <input type="radio" name="size" value="Medium" class="form-check-input" > Medium
                          </label>
                        </div>
        
                        <div class="form-check mb-3">
                          <label class="form-check-label">
                            <input type="radio" name="size" value="Small" class="form-check-input" > Small
                          </label>  
                        </div>

                    </div>

                    <div>
                        <label>Castrated</label>
                        <select class="form-select" name="castrated" >
                            <option value="0">Yes</option>
                            <option value="1">No</option>
                        </select>
                    </div>

                    <div class="form-group mb-3">
                        <label>Monthly Bath Cost:</label>
                        <input type="number" name="bathCost" value="22" class="form-control">
                      </div>

                    <div class="form-group mb-3">
                        <label>Monthly Toys Cost:</label>
                        <input type="number" name="toysCost" value="25" class="form-control">
                    </div>
                    
                    <button type="submit" class="align-self-center btn btn-primary">Confirm</button>

                </div>
                </form>			
            </div>
        </div>
    </body>
</html>
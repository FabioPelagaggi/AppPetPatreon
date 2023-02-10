<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">        
        <meta charset="ISO-8859-1">
        <title>Register New Pet</title>
    </head>
    <body>
      <div class="d-flex justify-content-center">
        <div class="shadow p-3 mb-5 bg-white container card card-block w-50 m-5">
          <form action="/pet/add" method="post">
            <div class="d-flex flex-column">
              <h2 class="align-self-center">New Pet</h3>

              <div class="mb-3 mt-3">	

                <label><b>Animal Type</b></label>			
                <div class="form-check mb-3 mt-3">
                  <label class="form-check-label">
                    <input type="radio" name="pet" value="Bird" checked class="form-check-input" > Bird
                  </label>
                </div>

                <div class="form-check mb-3">
                  <label class="form-check-label">
                    <input type="radio" name="pet" value="Dog" class="form-check-input"> Dog
                  </label>
                </div>

                <div class="form-check mb-3">
                  <label class="form-check-label">
                    <input type="radio" name="pet" value="Horse" class="form-check-input"> Horse
                  </label>  
                </div>
              </div>
              
              <button type="submit" class="align-self-center btn btn-primary">Next</button>

            </div>
          </form>			
        </div>
      </div>
    </body>
</html>
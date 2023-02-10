<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <meta charset="ISO-8859-1">
        <title>Users Data Table</title>
    </head>
    <body>
        <div class="d-flex justify-content-center">
            <div class="shadow p-3 mb-5 bg-white container card card-block w-auto m-5">
                <form action="/" method="get">
                    <div class="d-flex flex-column">
                        <h2 class="m-3 align-self-center">Users Data</h2>
                        <div>
                            <table class="table">
                                <thead class="thead-dark">
                                  <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Name</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">Password</th>
                                    <th scope="col">Phone</th>
                                  </tr>
                                </thead>
                                <tbody>
                                  <tr>
                                    <th scope="row">1</th>
                                    <td>Vlad Tepes Dracula</td>
                                    <td>bat18@gmail.com</td>
                                    <td>666</td>
                                    <td>65683156613</td>
                                  </tr>
                                  <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob</td>
                                    <td>Thornton@hotmail.com</td>
                                    <td>@f#$%@#at</td>
                                    <td>23126156613</td>
                                  </tr>
                                  <tr>
                                    <th scope="row">3</th>
                                    <td>Larry</td>
                                    <td>bird_person@tmail.com</td>
                                    <td>@twi%#$#$#!tter</td>
                                    <td>25126156513</td>
                                  </tr>
                                </tbody>
                              </table>
                        </div>

                        <button type="submit" class="align-self-center btn btn-primary mb-3">Home</button>

                    </div>
                    
                </form>
            </div>
        </div>
    </body>
</html>
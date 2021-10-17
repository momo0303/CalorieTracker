<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Action Page</title>
  </head>
  <body>
  
    <h1>&nbspWelcome ${username }</h1>&nbsp&nbsp&nbsp<a href="login" class="btn btn-primary">Logout</a></center>
    <h1>${msgUpdateSuccess }</h1>
    <h1>${msgDeleteSuccess }</h1>
    <h1>${insertMsg }</h1>
    
     <div class="p-1 mb-1 bg-secondary text-white">
    <div style="width:600px ;" class="container mt-3">
        <a class="btn btn-secondary btn-lg" href="view" role="button"><h2>View All Users</h2></a>
    </div>
    </div>
    <br><br>
    <div class="p-1 mb-1 bg-secondary text-white">
    <div style="width:600px ;" class="container mt-3">
      <form action="register">
        <button type="submit" class="btn btn-secondary btn-lg"><h2>Insert User</h2></button>
      </form><br>
    </div>
    </div>
      <br><br>
    <div class="p-1 mb-1 bg-secondary text-white">
    <div style="width:600px ;" class="container mt-3">
      <form action="updateUser">
        <button type="submit" class="btn btn-secondary btn-lg"><h2>Update User</h2></button>
      </form><br>
    </div>
    </div>
    <br><br>
    <div class="p-1 mb-1 bg-secondary text-white">
    <div style="width:600px ;" class="container mt-3">
      <form action="deleteUser">
        <button type="submit" class="btn btn-secondary btn-lg"><h2>Delete User</h2></button>
      </form><br>
    </div>
    </div>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
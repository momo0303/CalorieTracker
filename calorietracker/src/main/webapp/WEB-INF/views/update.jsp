<!doctype html>
<%@page isELIgnored="false" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Update Page</title>
  </head>
  <body><br>
  &nbsp&nbsp&nbsp&nbsp&nbsp;
  <a href="login" class="btn btn-primary">Logout</a><hr>
    <div class="p-1 mb-1 bg-secondary text-white">
    <div style="width:600px ;" class="container mt-7">
    
         <form action="updateform">
         ${msgFail }
         <center><h3>Update User Information...</h3></center>
          Username<input type="text" class="form-control" placeholder="Old Username" name="userName"><br>
          Password<input type="password" class="form-control" placeholder="Old password" name="password"><br>
          Weight<input type="number" class="form-control" placeholder="Enter Updated Weight(in kg)" name="weight"><br>
          Height<input type="number" class="form-control" placeholder="Enter Updated Height(in cm)" name="height"><br>
          Age<input type="number" class="form-control" placeholder="Enter Updated Age(in years)" name="age"><br>
            Select Gender  
            <input type="radio" name="sex" value="M"> Male
            <input type="radio" name="sex" value="F"> Female<br>
          <center>
          <button type="submit" class="btn btn-primary">Update</button></center>
         </form>
    </div>
    </div><hr>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>
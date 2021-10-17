<!doctype html>
<%@page import="com.dao.FoodDao"%>
<%@page import="java.util.List"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Activity Page</title>
  </head>
  <body> <br>
    &nbsp&nbsp&nbsp&nbsp&nbsp;
  <a href="login" class="btn btn-primary">Logout</a><hr>
 
    <div class="p-5 mb-5 bg-secondary text-white">
    <div style="width:600px ;" class="container mt-7">
  <form action="activityform">
    
      <% 
       //out.println("hey momo3"+request.getAttribute("activities"));
       List<String> activities=(List<String>)request.getAttribute("activities");
         //out.println("hey momo4"+activities);
       %>
    <h3>  Activity</h3><br>
      <select name="activity" onchange="javascript:if(this.value!='null') this.form.submit();">
       <%for(String s:activities) 
        {%>
         <option value="<%=s %>"><%=s %>
         </option>
 
           <%} %>
        </select><br><br>
        <a href="createlogs" class="btn btn-primary">Create Log for selected date</a>
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
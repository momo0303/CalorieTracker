<!doctype html>
<%@page import="com.entities.FoodIn"%>
<%@page import="java.util.List"%>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Food Name Page</title>
  </head>
  <body> <br>
    &nbsp&nbsp&nbsp&nbsp&nbsp;
  <a href="login" class="btn btn-primary">Logout</a><hr>
     <div class="p-5 mb-5 bg-secondary text-white">
    <div style="width:600px ;" class="container mt-7">
     <form action="addmore">

<% 
//out.println("hey momo3"+request.getAttribute("foodChoice"));
String mealtime=(String)request.getAttribute("mealtime");
String foodgroup=(String)request.getAttribute("foodgroup");
//out.println("hey momo4"+foodChoice);
%><h3>
<br><br>Meal Time<br>
<select name="mealtime">
  <option value="<%=mealtime%>"><%=mealtime%></option>
</select>
<br><br>Foodgroup<br>
<select name="foodgroup">
  <option value="<%=foodgroup%>"><%=foodgroup%></option>
</select>

<% 
//out.println("hey momo3"+request.getAttribute("foodChoice"));
List<String> foodName=(List<String>)request.getAttribute("foodName");
FoodIn fi=(FoodIn)request.getAttribute("fi");
//out.println("hey momo4"+foodChoice);
%>


<h3>
<br><br>Food Name<br></h3>
<select name="foodname">
<%for(String s:foodName) 
{%>
 <option value="<%=s %>"><%=s %></option>
 
 <%} %>
</select>
<h3>
<br>Portion<br>
<select name="portion">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
</select>
      <br><br><button type="submit" class="btn btn-primary">Save Record</button>
     </form>
</h3></div>
</div><hr>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 </body>
</html>
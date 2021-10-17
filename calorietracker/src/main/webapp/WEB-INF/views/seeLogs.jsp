<!doctype html>
<%@page import="com.entities.CaloriesRecord"%>
<%@page import="com.entities.User"%>
<%@page import="java.util.List"%>
<%@page isELIgnored="false" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Log Page</title>
  </head>
  
  <body >
    
    <br>
&nbsp&nbsp&nbsp&nbsp&nbsp;
<a href="login" class="btn btn-primary">Logout</a><hr>
<div class="p-3 mb-2 bg-secondary text-black">

<%
List<CaloriesRecord> caloriesRecord=(List<CaloriesRecord>)request.getAttribute("caloriesRecord");
String username=(String)request.getAttribute("username");
Float bmr=(Float)request.getAttribute("bmr");
%>
<h3>
Username:<%=username %><br>
BMR:<%=bmr %></h3>
<h2><center>Records</center></h2>
<% 
out.println("<center><table border = '1' bgcolor = 'gray' width='80%'><tr><th>Date</th><th>CaloriesIn</th><th>CaloriesOut</th><th>NetCalories</th>");
for(CaloriesRecord s:caloriesRecord)
{
	String date=s.getDate();
	float caloriesin=s.getCaloriesin();
	float caloriesout=s.getCaloriesout();
	float netcalories=s.getNetcalories();
	out.println("<tr><td>"+ date+"</td><td>"+ caloriesin+"</td><td>"+ caloriesout+"</td><td>"+ netcalories+"</td><td>"+"</tr>");
%>
<%} out.println("</center></table>");%>
    <br><br>
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 <br><br><br></div> </body><hr>
</html>
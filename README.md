# CalorieTracker
This is an Admin Portal where admin can view/insert/update/delete users. Once admin select a user from a list, it allow food data to be entered for that user for a specific 
day (admin should be able to select up to 30 days in past) and after that it will calculate the BMR, calories gain, calories burnt and net calories.

Men’s BMR = 66.4730 + (13.7516 x weight in kg)  + (5.0033x height in x height in cm) – (6.7550 x age in years)
Women’s BMR = 655.0955 + (9.5634 x weight in kg) + (1.8496 x height in cm) – (4.6756 x age in years)
Calories out for activities = MET Value x weight in kg x duration in hour.

* Calories in: 
Select food from a drop down, selection portion, and select time (breakfast, lunch, dinner) – upon selection that should calculate the calories gain.
Build this list for a day.

* Calories out: 
Select activities from a dropdown, select duration in minutes, and show calories burnt 

* Net Calories 
Net Calories per day = Food Calories per day - Basal Metabolic Rate - Activities Calories day per day

* Technology Used: Spring core, Spring Jdbc, Spring MVC, Servlet, MySql, HTML, JavaScript.

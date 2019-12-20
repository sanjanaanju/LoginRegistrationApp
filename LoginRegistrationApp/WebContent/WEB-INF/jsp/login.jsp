<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Login Page</title> 
<style>
.colors{background-color:white;
width:75%} 
</style>
  </head>  
  <legend>Login Form</legend>
<h1><center>Login With Registered UserName And Password</center></h1> 
<body bgColor="coral">  
<div class="colors">
    <form:form action="loginForm" modelAttribute="login" method="post">  
        User name: <form:input path="userName" />         
        <br><br>  
        password: <form:password path="password" />  
        <br><br> 
        
        <input type="submit" value="login" /> <br><br>     
    </form:form>  
    
    <right> <a href="http://localhost:8080/LoginRegistrationApp">go back to home page.</a></right> 
    </div>
</body>  
</html>
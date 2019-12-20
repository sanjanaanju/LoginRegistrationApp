<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>Registration Page</title>  
    <style>  
.error{color:red}  
.colors{background-color:white;
width:75%}
</style>  
</head>
<h1><center>CreatingAccount</center></h1> 
<body bgColor="coral"> 
<div class="colors">

    <form:form action="submitForm" modelAttribute="registration"> 
     User name: <form:input path="userName" />         
      <form:errors path="userName" cssClass="error"/><br><br>    
        password: <form:password path="password" /> 
         <form:errors path="password" cssClass="error"/><br><br>    
        
         Email Address: <form:input path="email" />
         <form:errors path="email" cssClass="error"/><br><br>  
                 
                 
        <input type="submit" value="Submit" />  <br><br>    
    </form:form>  
    

 <a href="http://localhost:8080/LoginRegistrationApp" align="right">go back to home page.</a> 
 </div>
 </body>
</html>
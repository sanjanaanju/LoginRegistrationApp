<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.colors{background-color:white;
width:50%} 
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="coral"> 
<centre><h3><p>Your Account Is Created successfully. With The Below userName And EmailAddress </p></h3></centre> 
 
<div class="colors">
        Registered User Name : ${registration.userName} <br>  
    Registered PassWord : ${registration.password} <br>
    Registered Email Address : ${registration.email}
    <br><br>
      </body>
   <right> <a href="http://localhost:8080/LoginRegistrationApp">go back to home page.</a></right> 
   </div>
</html>
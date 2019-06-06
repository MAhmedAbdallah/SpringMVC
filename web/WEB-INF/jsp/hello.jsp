<%-- 
    Document   : hello
    Created on : Jun 5, 2019, 3:05:15 PM
    Author     : V19MFoda
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
        
        
        <form:form action="user" modelAttribute="userObject" >
            <form:input path="id"/>
            <form:errors path="id" />
            <input type="submit" value="Submit"/>
                
            
        </form:form>
        
    
    
    </body>
</html>

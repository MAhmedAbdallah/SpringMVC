<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
    
        
        
        
        
        
        
        
        
        <form:form action="user" modelAttribute="userObject" >
            <form:input path="id"/>
            <input type="submit" value="Submit"/>
                
            
        </form:form>
        
        
        
        
        
        
        
        
        
        <spring:message code="hello" />
        
    </body>
</html>

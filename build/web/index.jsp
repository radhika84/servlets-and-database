<%-- 
    Document   : index
    Created on : Jun 28, 2016, 6:51:38 AM
    Author     : GyanSys 181
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MyServlet" method="post">
            <strong> Welcome to j2ee</strong></br>
            Username: <input type="text" name="username"></br>
            Password: <input type="password" name="password"></br>
            <input type="submit" value="call my servlet">
            
              </form>
    </body>
</html>

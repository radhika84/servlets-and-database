<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Employee Details</title>
    </head>
    <body>
        
            <form name="updateform" action="UpdateEmployeeDetails" method="get" style="background-color: pink" >
            
            <label>EmployeeId : </label><input type="text"  name="empid" required/><br/>
            
            <label>EmployeeName:</label> <input type="text" name="empname"  required/><br/>
            <label>  EmployeeSalary </label><input type="text" name="empsalary"  required/><br/>
            
            <input type="submit" value="UpdateEmployee" />
          
            </form>
        
    </body>
</html>

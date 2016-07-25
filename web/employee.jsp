

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <script>
        function validate(){
var num=document.employeeform.empid.value;

if(num===null||num===""){
   document.getElementById("empId").innerHTML="Employee Id cannot be empty";
   return false;
  }
      </script>  
    </head>
    <body>
        <form name="employeeform" action="AddEmployeeDetails" method="get" style="background-color: pink" onsubmit="return validate()">
            
            
            <label>EmployeeId : </label><input type="text"  name="empid" required/><br/>
            
            <label>EmployeeName:</label> <input type="text" name="empname"  required/><br/>
            <label>  EmployeeSalary </label><input type="text" name="empsalary"  required/><br/>
            
            <input type="submit" value="submit" />
        

        </form>
        
    </body>
</html>

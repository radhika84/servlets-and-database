

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
function validate(){
var num=document.getform.num.value;

if(num===null||num===""){
   document.getElementById("empId").innerHTML="Employee Id cannot be empty";
   return false;
  }
  

else if (isNaN(num)){
  document.getElementById("empId").innerHTML="Enter Numeric value only";
  return false;
}else{
  return true;
  }
}
</script>
</head>

<body>
<form name="getform" action="getDetails" method="get" onsubmit="return validate()" >
    <label>EmployeeID:</label> <input type="text" name="num" required><span id="empId"></span><br/>
<input type="submit" value="EmployeeDetails">
</form>

</body>
</html>

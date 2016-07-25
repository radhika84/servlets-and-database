<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Employee Details</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
   <script type="text/javascript">

$(document).ready(function() {
    $('#tabs').tabs({
        load: function(event, ui) {
            alert(event.id)
            $(ui.panel).delegate('a', 'click', function(event) {
                alert(this.href)
                $(ui.panel).load(this.href);
                event.preventDefault();
            });
        }
    });

    $("#tabs").bind('tabsselect', function(event, ui) {
        window.location.href=ui.tab;
    });

});

</script>
</head>
<body>
 
<div id="tabs">
  <ul>
    <li><a href="employee.jsp">Add Employee Details</a></li>
    <li><a href="getdetails.jsp">Get Employee Details</a></li>
    <li><a href="update.jsp">Update Employee Details</a></li>
  </ul>
  <div id="employee.jsp">
    
  </div>
  <div id="getdetails.jsp">
    
  
  </div>
  <div id="update.jsp">
    
  </div>
</div>
 
 
</body>
</html>
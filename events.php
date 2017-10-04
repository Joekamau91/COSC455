<html><head><title>schools and events</title></head>
<body>
<table border=1>
<tr><th>ID</th><th>Event Name</th><th>Location</th><th>Capacity</th></tr>
<?php
include 'db.inc.php';

if (!($connection = @ mysql_connect($hostName, $username,
  $password)))
  showerror();

if (!mysql_select_db($databaseName, $connection))
  showerror();
 

$query = "SELECT * FROM EVENT";

if (!($result = @ mysql_query ($query, $connection)))
  showerror();

while ($row = @ mysql_fetch_array($result))
  echo "<tr><td>{$row["id"]}</td>
<td>{$row["eventname"]}</td>
<td>{$row["location"]}</td>
<td>{$row["capacity"]}</td></tr>";
?>
</table></body>
</html>
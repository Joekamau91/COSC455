<html><head><title>select scool by name</title>
</head> 
<body>
<?php if(!empty($_POST['name'])) {
 echo "<table border=1>
 <tr><th>ID</th><th>NAME</th><th>STATE</th><th>LOCATION</th><th>ZIP</th>
 <th>ADDRESS</th></tr>";
 include 'db.inc.php';

 if (!($connection = @ mysql_connect($hostName, $username,
 $password)))
 showerror();

 if (!mysql_select_db($databaseName, $connection))
 showerror();

 $name = $_POST['name'];
 
 $query = "SELECT * FROM SCHOOLS WHERE name='$name'";
 
 if (!($result = @ mysql_query ($query, $connection)))
 showerror();
 
 while ($row = @ mysql_fetch_array($result))
 echo "<tr><td>{$row["id"]}</td>
 <td>{$row["name"]}</td>
 <td>{$row["state"]}</td>
 <td>{$row["location"]}</td>
 <td>{$row["zip"]}</td>
  <td>{$row["address"]}</td></tr>";
 echo "</table>";
 }

 ?>
 </body> 
 </html>
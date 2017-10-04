<?php

$hostName = "localhost:/usr/cis/var/triton.sock";
$databaseName = "jkamau2db";  
$username = "jkamau2";             
$password = "Cosc*7wm5";               

function showerror()
{
if (mysql_error())
die("Error " . mysql_errno() . " : " . mysql_error());
else
die ("Could not connect to the DBMS");
}
?>
<?php 

 define('DB_HOST', 'localhost');
 define('DB_USER', 'root');
 define('DB_PASS', '');
 define('DB_NAME', 'signuplogin');
 
 $conn = new mysqli(DB_HOST, DB_USER, DB_PASS, DB_NAME);
 
 if (mysqli_connect_errno()) {
 echo "Failed to connect to MySQL: " . mysqli_connect_error();
 die();
 }

 $stmt = $conn->prepare("SELECT id, fullname, email, username, photo FROM user;");

 $stmt->execute();
 
 $stmt->bind_result($id, $fullname, $email, $username, $photo);
 
 $userss = array(); 

 while($stmt->fetch()){
 $temp = array();
 $temp['id'] = $id; 
 $temp['fullname'] = $fullname; 
 $temp['email'] = $email; 
 $temp['username'] = $username;
 $temp['photo'] = $photo;
 array_push($userss, $temp);
 }
  
 echo json_encode($userss);
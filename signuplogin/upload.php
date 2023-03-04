<?php

if($_SERVER['REQUEST_METHOD'] == 'POST'){
    
    $uid = rand(1,1000000);

    $username = $_POST['username'];
    $photo = $_POST['photo'];

    $path = "profile_image/$username$uid.jpeg";
    $finalPath = "http://ipaddresshere/signuplogin/".$path;

    require_once 'connect.php';

    $sql = "UPDATE user SET photo= '$finalPath' WHERE username='$username' ";

    if (mysqli_query($conn, $sql)){

        if(file_put_contents($path, base64_decode($photo))){

            $result['success'] = "1";
            $result['message'] = "success";

            echo json_encode($result);
            mysqli_close($conn);

            }

    }

}

?>
<?php

require "connect.php";

$username = $_POST['username'];
$email = $_POST['email'];

$sql = "UPDATE user SET email = '$email' WHERE username = '$username'";

if (mysqli_query($conn, $sql)) {

    echo "Update Successful";

} else {

    echo "Try again later" .mysqli_error($conn);

}

?>
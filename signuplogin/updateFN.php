<?php

require "connect.php";

$username = $_POST['username'];
$fullname = $_POST['fullname'];

$sql = "UPDATE user SET fullname = '$fullname' WHERE username = '$username'";

if (mysqli_query($conn, $sql)) {

    echo "Update Successful";

} else {

    echo "Try again later" .mysqli_error($conn);

}

?>
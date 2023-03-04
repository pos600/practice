<?php

require "connect.php";

$sender = $_POST['sender']; //username
$msg = $_POST['msg'];

$sql = "INSERT INTO chat (msg, sender) VALUES ('$msg', '$sender');";

if (mysqli_query($conn, $sql)) {

    echo "Update Successful";

} else {

    echo "Try again later" .mysqli_error($conn);

}

?>
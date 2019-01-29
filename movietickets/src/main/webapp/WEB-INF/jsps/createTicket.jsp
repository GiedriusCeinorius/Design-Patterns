<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Ticket</title>
</head>
<body>
<form action="createTicket" method="post">
    Movie Name: <input type="text" name="movie"/>
    Screen: <input type="text" name="screen"/>
    Seat No: <input type="text" name="seat"/>
    <input type="submit" value="purchase"/>
</form>
${msg}
</body>
</html>
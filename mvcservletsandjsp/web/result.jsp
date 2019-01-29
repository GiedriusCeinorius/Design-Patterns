<%--
  Created by IntelliJ IDEA.
  User: gce
  Date: 2019-01-29
  Time: 09:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Average</title>
</head>
<body>
<%
    int result = (Integer)request.getAttribute("result");
    out.println("Average of two numbers is: " + result);
%>
</body>
</html>

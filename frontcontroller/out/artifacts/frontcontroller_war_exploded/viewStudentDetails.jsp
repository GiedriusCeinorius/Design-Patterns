<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019-01-28
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Student Details</title>
</head>
<body>
<jsp:useBean id="studentDetails" type="com.gce.patterns.frontcontroller.StudentVO" scope="request"/>
Student Id: <jsp:getProperty property="id" name="studentDetails"/>
Student Id: <jsp:getProperty property="name" name="studentDetails"/>
</body>
</html>

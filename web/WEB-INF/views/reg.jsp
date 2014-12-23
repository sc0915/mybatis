<%--
  Created by IntelliJ IDEA.
  User: SC
  Date: 2014/12/23
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form action="${ctx}/tea/teainsert" method="post" modelAttribute="teainfo">
    <form:input path="teaId"></form:input>
    <form:input path="teaName"></form:input>
    <input type="submit" value="ok">
</form:form>
</body>
</html>

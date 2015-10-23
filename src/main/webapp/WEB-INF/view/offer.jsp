<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hsamao
  Date: 10/19/15
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach var="row" items="${offers}">

    ID: ${row.id}<br/>
    Name: ${row.name}<br/>
    Email: ${row.email} <br/>
    Text: ${row.text}<br/> <br/>

    <%--<p><c:out value="${row}"></c:out></p>--%>

</c:forEach>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: hsamao
  Date: 10/18/15
  Time: 10:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:query var="rs" dataSource="jdbc/TestDB">
    select id, foo, bar from testdata
</sql:query>

<html>
<head>
    <title>DB Test</title>
</head>
<body>

<h2>Results</h2>

<c:forEach var="row" items="${rs.rows}">
    Id ${row.id}<br/>
    Foo ${row.foo}<br/>
    Bar ${row.bar}<br/>
</c:forEach>

</body>
</html>
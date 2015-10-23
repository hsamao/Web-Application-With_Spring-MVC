<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hsamao
  Date: 10/18/15
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

I am using expression language for rendering stuff from Java classes ${sub_page} <p/>
<br/>
I am using JSTL: <c:out value="${sub_page}"></c:out>

</body>
</html>

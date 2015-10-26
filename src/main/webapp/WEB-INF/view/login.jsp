<%--
  Created by IntelliJ IDEA.
  User: hsamao
  Date: 10/25/15
  Time: 5:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login Page</title>

    <link href="${pageContext.request.contextPath}/app/static/customCSS.css" rel="stylesheet" type="text/css"/>
</head>
<body onload="document.formLogin.j_username.focus();">

<h3>Login with Username and Password</h3>

<form name="formLogin" method="post" action="${pageContext.request.contextPath}/j_spring_security_check" >
    <table class="formTable">
        <tr>
            <td>User:</td>
            <td><input type="text" name="j_username" value=""/></td>
        </tr>

        <tr>
            <td>Password</td>
            <td><input type="password" name="j_password"/></td>
        </tr>

        <tr>
            <td colspan="2"><input name="submit" type="submit" value="Login"/></td>
        </tr>
    </table>
</form>


</body>
</html>

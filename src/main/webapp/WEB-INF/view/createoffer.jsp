<%--
  Created by IntelliJ IDEA.
  User: hsamao
  Date: 10/20/15
  Time: 6:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <link href="${pageContext.request.contextPath}/app/static/customCSS.css" rel="stylesheet" type="text/css">

    <meta http-equiv="content-type" content="text/html" charset="US-ASCII">

    <title></title>
</head>
<body>

<sf:form method="post" action="${pageContext.request.contextPath}/app/docreate" commandName="offer">
    <%--acttion ==> url where the form is going to --%>
    <table CLASS="formTable">
        <tr>
            <td class="label"> Name:</td>
            <td><sf:input class="control" path="name" name="name" type="text"/> <br/> <sf:errors path="name"
                                                                                     cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td class="label"> Email:</td>
            <td><sf:input class="control" path="email" name="email" type="text"/> <br/> <sf:errors path="email"
                                                                                cssClass="error"></sf:errors></td>
        </tr>
        <tr>
        <td class="label"> Your offer:</td>
        <td><sf:textarea class="control" path="text" name="text" rows="10" cols="18"></sf:textarea> <br/> <sf:errors path="text"
                                                                                                   cssClass="error"></sf:errors></td>
        </tr>
        <tr>
            <td class="label"></td>
            <td><input class="control" value="Create advert" type="submit"/></td>
        </tr>
    </table>
</sf:form>


</body>
</html>
